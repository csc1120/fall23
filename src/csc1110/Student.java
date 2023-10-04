package csc1110;

import java.util.Scanner;

/*
       +-----------------------------------+
       |             Student               |
       +-----------------------------------+
       | - age: int                        |
       | - height: int                     |
       | - firstName: String               |
       | - lastName: String                |
       +-----------------------------------+
       | + Student(student: String)        |
       | + getHeight(): int                | done
       | + getAge(): int                   | done
       | + celebrateBirthday(): void       | done
       | + earlierAlphabetically(student: Student): boolean | done
       | + setHeight(height: int): boolean | done
       | + toString(): String              | done
       +-----------------------------------+
       "Chris Taylor, 53, 71"
 */
public class Student {
    // this.earlierAlphabetically(student)
    public boolean earlierAlphabetically(Student student) {
        return this.lastName.compareToIgnoreCase(student.lastName) < 0;
    }

    private int age;
    private int height;
    private String firstName;
    private String lastName;

    //   "Chris Taylor, 53, 71"
    public Student(String studentInfo) {
        studentInfo = studentInfo.replace(",", "");
        Scanner in = new Scanner(studentInfo);
        firstName = in.next();
        lastName = in.next();
        age = in.nextInt();
        height = in.nextInt();
        /*
        int firstSpace = studentInfo.indexOf(" ");
        int firstComma = studentInfo.indexOf(",");
        int lastComma = studentInfo.lastIndexOf(",");
        firstname = studentInfo.substring(0, firstSpace);
        lastName = studentInfo.substring(firstSpace + 1, firstComma);
        age = Integer.parseInt(studentInfo.substring(firstComma + 2, lastComma));
        height = Integer.parseInt(studentInfo.substring(lastComma + 2));
         */
    }

    public void celebrateBirthday() {
        age += 1;
    }

    public int getHeight(){
        return this.height;
    }

    public int getAge(){
        return this.age;
    }

    public boolean setHeight(int height) {
        boolean changed = false;
        if ((age < 23 && height == this.height + 1) || (age > 50 && height == this.height - 1)) {
            this.height = height;
            changed = true;
        }
        return changed;
    }

    @Override
    public String toString(){
        return firstName +" "+lastName+", "+age+", "+height;
    }

}

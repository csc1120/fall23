package wk1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter filename");
        String filename = in.nextLine();
        Path path = Path.of("data/" + filename);
        try (Scanner fin = new Scanner(path)) {
            int[] meetingsPerDayCount = new int[SectionMeeting.DAYS.size()];
            while (fin.hasNextLine()) {
                SectionMeeting meeting = new SectionMeeting(fin.nextLine());
                for (int i = 0; i < meetingsPerDayCount.length; i++) {
                    if (meeting.meetsOn(SectionMeeting.DAYS.get(i))) {
                        meetingsPerDayCount[i]++;
                    }
                }
            }
            System.out.println("Total daily meetings:");
            for (int i = 0; i < meetingsPerDayCount.length; i++) {
                System.out.println(SectionMeeting.DAYS.get(i) + ": " + meetingsPerDayCount[i]);
            }
        } catch (IOException e) {
            System.err.println("Trouble reading file");
        }
    }
}

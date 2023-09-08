package wk2;

public class CommandMyLine {
    public static void main(String[] args) {
        System.out.println("There were " + args.length + " arguments on the command line");
        for (String arg : args) {
            System.out.println(arg.length());
        }
    }
}

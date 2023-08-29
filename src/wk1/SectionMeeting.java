package wk1;

public class SectionMeeting {
    private String courseCode;
    private String sectionNumber;
    private String title;
    private boolean[] daysOfWeek;
    private int startTime;
    private int endTime;

    public SectionMeeting(String line) {
        String[] fields = line.split(",");
        final int sectionNumberIndexStart = 10;
        courseCode = fields[0].substring(0, sectionNumberIndexStart);
        sectionNumber = fields[0].substring(sectionNumberIndexStart);
        title = fields[1];
        daysOfWeek = new boolean[5];
        daysOfWeek[0] = !fields[2].isEmpty();
        daysOfWeek[1] = !fields[3].isEmpty();
        daysOfWeek[2] = !fields[4].isEmpty();
        daysOfWeek[3] = !fields[5].isEmpty();
        daysOfWeek[4] = !fields[6].isEmpty();
    }


}

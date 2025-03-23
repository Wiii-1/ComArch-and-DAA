
import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    static class Activity {
        int start, end;

        public Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void ActivitySelection(Activity[] activities){
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        System.out.println("Selecte Activities: ");

        int lastEndtime = activities[0].end;
        System.out.println("Activity: (" + activities[0].start + ","  + activities[0].end+ ")");

        for (int i = 1; i <activities.length; i++){
            if (activities[i].start >= lastEndtime){
                System.out.println("Activity: (" + activities[i].start + "," + activities[0].end + ")");
                lastEndtime = activities[i].end;
            }
        }
    }
    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 4),
            new Activity(3, 5),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(3, 8),
            new Activity(5, 9),
            new Activity(6, 10),
            new Activity(8, 11),
            new Activity(8, 12),
            new Activity(2, 13),
            new Activity(12, 14)
        };

        ActivitySelection(activities);
    }
}

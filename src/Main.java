import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();

        // create an ActivityTracker object
        ActivityTracker activity = new ActivityTracker(goal);

        // repeatedly ask user to enter an activity session's number of minutes
        while (true) {

            System.out.print("Enter an activity session's number of minutes: ");
            int minutes = scan.nextInt();
            if (minutes == -1) {
                break;
            }
            activity.logMinutes(minutes);
        }
        // and enter -1 when done entering

        // log the number of minutes associated with each activity session

        // when the user is done entering numbers, end the loop and
        // tell the user their stats:
        // - total sessions logged
        // - total minutes logged
        // - max minutes logged
        // - did they reach their goal?
        System.out.println("Total sessions logged: " + activity.getSessions());
        System.out.println("Total minutes logged: " + activity.getTotalMinutes());
        System.out.println("Max minutes logged: " + activity.getMaxMinutes());
        System.out.println("goal reached: " + activity.goalAchieved());
    }
}

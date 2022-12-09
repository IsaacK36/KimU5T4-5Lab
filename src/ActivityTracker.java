public class ActivityTracker {
    private int targetGoal;
    private int sessions;
    private int totalMinutes;
    private int longestSession;

    public ActivityTracker(int targetGoal) {
        this.targetGoal = targetGoal;
        sessions = 0;
        totalMinutes = 0;
        longestSession = 0;
    }

    public void logMinutes(int minutes) {
        totalMinutes += minutes;
        sessions++;
        if (minutes > longestSession) {
            longestSession = minutes;
        }
    }

    public int getSessions() {
        return sessions;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getMaxMinutes() {
        return longestSession;
    }

    public boolean goalAchieved() {
        return totalMinutes >= targetGoal;
    }
}

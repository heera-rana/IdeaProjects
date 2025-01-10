public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));


    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid number of seconds as " + seconds + " must be positive";

        } int minutes = seconds / 60;
        return getDurationString(minutes, seconds % 60);

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid number of minutes as " + minutes + " must be positive";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid number of seconds as " + seconds + "s must be between 0 and 59";
        }
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;

            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }
}
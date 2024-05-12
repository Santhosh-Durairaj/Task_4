package Task_4;
import java.util.Scanner;
class WeekdayHandler {
    private String[] weekdays;

    public WeekdayHandler() {
        weekdays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    }

    public void printWeekdayByPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day position (0-6): ");
        int dayPosition = scanner.nextInt();

        try {
            String dayName = getWeekdayName(dayPosition);
            System.out.println("Day: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day position. Please enter a position between 0 and 6.");
        }
    }

    private String getWeekdayName(int position) {
        if (position < 0 || position >= weekdays.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return weekdays[position];
    }
}
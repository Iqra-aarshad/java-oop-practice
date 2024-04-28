import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time in 24-hour format: ");
        String time24 = sc.nextLine();

        String[] timeComponents = time24.split(":");
        int hours = Integer.parseInt(timeComponents[0]);
        int minutes = Integer.parseInt(timeComponents[1]);
        if (hours < 0 || hours > 23) {
            System.out.println("Invalid input for hours.");
            return;
        }

        if (minutes < 0 || minutes > 59) {
            System.out.println("Invalid input for minutes.");
            return;
        }

        String suffix = (hours >= 12) ? "PM" : "AM";
        hours = hours % 12;
        if (hours == 0) {
            hours = 12;
        }
        String time12 = String.format("%d:%02d %s", hours, minutes, suffix);
        System.out.println("The time in 12-hour format is: " + time12);
    }
}

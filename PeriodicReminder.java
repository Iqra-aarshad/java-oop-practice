import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class PeriodicReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the reminder date and time (yyyy-MM-dd HH:mm): ");
        String dateTimeString = scanner.nextLine();

        System.out.print("Enter the reminder message: ");
        String reminderMessage = scanner.nextLine();

        Date reminderDateTime = parseDateTime(dateTimeString);

        Timer timer = new Timer();
        timer.schedule(new ReminderTask(reminderMessage), reminderDateTime);

        System.out.println("Reminder scheduled!");

        scanner.close();
    }

    private static Date parseDateTime(String dateTimeString) {
        return new Date();
    }

    static class ReminderTask extends TimerTask {
        private String reminderMessage;

        public ReminderTask(String reminderMessage) {
            this.reminderMessage = reminderMessage;
        }
        public void run() {
            System.out.println("Reminder: " + reminderMessage);
        }
    }
}

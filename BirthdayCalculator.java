import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthDateStr = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateStr);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + age.getYears() + " years");
    }
}
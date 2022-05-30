import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the year:");
        year = scanner.nextInt();
        System.out.println("----");

        boolean isDivisibleof100 = year % 100 == 0;
        boolean isDivisibleof400 = year % 400 == 0;
        boolean isDivisible4 = year % 4 == 0;

        if (isDivisibleof100 && isDivisibleof400 && isDivisible4) {
            System.out.println("Leap year");

        }else {
            System.out.println("Not leap year");
        }
    }
}

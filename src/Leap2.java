import java.util.Scanner;

public class Leap2 {
    public static void main (String[] args){
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the year:");
        year = scanner.nextInt();
        System.out.println("----");

        boolean isDivisibleof4 = (year % 4) == 0;
        System.out.println(isDivisibleof4);
        boolean isNotDivisibleof100 = (year % 100) != 0;  // not a century
        System.out.println(isNotDivisibleof100);
        boolean isDivisible100and400 = (year % 100 == 0) && (year % 400 == 0);  // century that is leap - 2000 not 1999
        System.out.println(isDivisible100and400);

        if (isDivisibleof4 && (isNotDivisibleof100 || isDivisible100and400)) {
            System.out.println("Leap year");

        }else {
            System.out.println("Not leap year");
        }
    }
}


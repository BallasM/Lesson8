import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {

        float num;
        float num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextFloat();
        System.out.println("Enter a number: ");
        num2 = scanner.nextFloat();
        float result = Math.abs(num - num2);
        System.out.printf("The result/difference is " + "%.4f", result);

        //boolean diFFuptoone = result < 0.1;
        //boolean diFFuptotwo = result < 0.01;
        //boolean diFFuptothree = result < 0.001;
        //boolean diFFuptofour = result < 0.0001;

        if (result < 0.1 || result < 0.01 || result < 0.001 || result < 0.0001) {
            System.out.println("\nCheck the result");

        } else {
            System.out.println("\nDifferent values");


        }
    }
}


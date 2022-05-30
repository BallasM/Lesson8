import java.util.Scanner;

public class Diskriminanta {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for 'a': ");
        int numA = input.nextInt();
        if (numA == 0) {
            System.out.println("Variable 'a' must be different from 0");
        } else {
            System.out.println("Enter a value for 'b':");
            int numB = input.nextInt();
            System.out.println("Enter a value for 'c': ");
            int numC = input.nextInt();

            int numD = (numB * numB - 4 * numA * numC);
            System.out.println("The discriminator D = " + numD);
            if (numD > 0) {
                System.out.println("ie the equation has 2 roots");
                double numX1 = ((-(numB) + Math.sqrt(numD)) / 2 * numA);
                double numX2 = ((-(numB) + Math.sqrt(numD)) / 2 * numA);

                System.out.printf("\t\tThe first root is X1= %.2f%n ", numX1);
                System.out.printf("\t\tThe second root is X2 = %.2f%n ", numX2);

            } else {
                if (numD < 0) {
                    System.out.println("The discriminant is <0 ==> The equation has no roots");
                } else {
                    if (numD == 0) {
                        System.out.println("The discriminant D = 0, ==> The equation has one root");
                        double numX3 = -(numB / 2 * numA);
                        System.out.printf("\t\tThe root of the equation is X = %.2f%n ", numX3);

                    }
                }
            }
        }
    }
}
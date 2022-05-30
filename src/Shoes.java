import java.util.Scanner;

public class Shoes {
    public static void main(String[] args) {
        float price;
        int size;
        int coLor = 0;
        int retUrnable = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the price: ");
        price = scanner.nextFloat();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please, enter the size: ");
        size = scanner.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please, choose between the following available colors and press 1 for White," +
                "2 for Grey, 3 for Blue, 4 for Yellow and 5 for Black");
        coLor = scanner.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Returnable options? Please, reply with 1 for Yes or 2 for No.");
        retUrnable = scanner.nextInt();


        if ((price <= 150) && (size >= 44 && size <= 45) && (coLor >=1 && coLor <=4) && (retUrnable == 1)) {
            System.out.println("The perfect choice!");


    } else {
            System.out.println("Please, try with other filters!");
        }


    }
}
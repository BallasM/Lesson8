import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VowelsAndConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a letter: ");

        String input = scanner.next();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;

        boolean vowels = input.equalsIgnoreCase("a") || input.equals("e") || input.equals("i") ||
                input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Error. Not a signle character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error! Not a letter. Enter uppercase or lowercase letter");
        }else if(vowels) {
            System.out.println("This letter is vowel.");
        }else {
            System.out.println("This letter is consonant.");
            
        }
    }

    }

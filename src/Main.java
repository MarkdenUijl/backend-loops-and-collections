//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Hier mag je je code schrijven voor de hoofd-opdracht
//
//        // Variables
//        boolean playing = true;
//        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//
//        Translator translator = new Translator(numbers, words);
//        Scanner scanner = new Scanner(System.in);
//
//        // Run the program.
//        while(playing) {
//            System.out.println("Press 'x' to quit or 't' to translate.");
//            String input = scanner.nextLine().toLowerCase();
//
//            if (input.equals("x")) {
//                playing = false;
//            } else if (input.equals("t")) {
//                System.out.println("Enter a number from this list: " + Arrays.toString(numbers));
//
//                int numInput = scanner.nextInt();
//
//                translator.translate(numInput);
//                scanner.nextLine();
//            } else {
//                System.out.println("Invalid input.");
//            }
//        }
//    }
//}

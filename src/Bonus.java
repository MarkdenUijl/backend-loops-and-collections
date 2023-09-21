import java.util.*;

public class Bonus {

    public static void main(String[] args) {

        // Onderstaande code is uitgecommentarieerd. Haal de code uit de comment (delete /* en */) om aan de slag te gaan met de bonus
        // In de code staan op verschillende plekken comments tussen "/*...*/" als hint wat je moet doen


        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
        // System.out.println(stringnumber);
        feedback(stringnumber);
    }

    public static HashSet<Integer> randomnumbergenerator(){
        Random random = new Random();
        HashSet<Integer> randomNumber = new HashSet<>();

        while (randomNumber.size() < 4) {
            randomNumber.add(random.nextInt(10));
        }

        return randomNumber;
    }

    public static String setToStringConverter(HashSet<Integer> randomNumbers){
        String numberString = "";

        for (Integer number: randomNumbers) {
            numberString += Integer.toString(number);
        }

        return numberString;
    }

    public static void feedback(String stringnumber) {
        int tries = 5;

        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();

        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");


        while(tries > 0) {
            String guess = scanner.nextLine();

            if (Objects.equals(guess, stringnumber)) {
                System.out.println("gefeliciteerd je hebt het goed");
                tries = 0;
            } else {
                for (int i = 0; i < 4; i++) {
                    if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                        feedback.append("+");
                    } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                        feedback.append("0");
                    } else {
                        feedback.append("X");
                    }
                }
            }
            System.out.println(feedback.toString());
            tries--;
            feedback = new StringBuilder();

            if (tries == 0) {
                System.out.println("Helaas! je hebt het niet geraden.");
            } else if (tries < 0) {
                System.out.println("Het spel is afgelopen.");
            } else {
                System.out.println("Je hebt nog " + tries + " pogingen om het goed te raden.");
            }
        }
    }
}

// De hashset was geen goede keuze voor dit programma omdat in een set ieder nummer maar één keer voor kan komen. Dit maakt het spelletje een stuk makkelijker.
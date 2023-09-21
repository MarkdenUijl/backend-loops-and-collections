import java.util.HashMap;
import java.util.Map;

public class Translator {
    private int[] numbers;
    private String[] words;
    Map<Integer, String> numberMap = new HashMap<>();

    public Translator(int[] numbers, String[] words) {
        this.numbers = numbers;
        this.words = words;

        for (int i = 0; i < numbers.length; i++) {
            numberMap.put(numbers[i], words[i]);
        }
    }

    public void translate(int number) {
        String word = numberMap.get(number);

        if(word == null) {
            System.out.println("This is not one of the provided numbers, try again! \n");
        } else {
            System.out.println("The number " + number + " is spelled as follows: " + word + "\n");
        }
    }
}

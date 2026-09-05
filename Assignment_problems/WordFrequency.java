import java.util.*;

public class WordFrequency {

    static void printFilteredWordFrequency(String feedback) {
        feedback = feedback.toLowerCase().replace(".", "").replace(",", "");

        String[] words = feedback.split("\\s+");
        String[] stop = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            boolean skip = false;

            for (String s : stop) {
                if (word.equals(s))
                    skip = true;
            }

            if (!skip)
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort((x, y) -> map.get(y) - map.get(x));

        for (String word : list)
            System.out.println(word + ": " + map.get(word));
    }

    public static void main(String[] args) {
        String feedback = "The mentor was great, the session was great and clear.";

        printFilteredWordFrequency(feedback);
    }
}
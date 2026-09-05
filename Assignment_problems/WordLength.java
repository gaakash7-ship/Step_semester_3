public class WordLength {

    static void classifyWordLengths(String review) {
        String[] words = review.split(" ");
        int shortWord = 0, medium = 0, longWord = 0;

        for (String word : words) {
            int len = word.length();

            if (len <= 4)
                shortWord++;
            else if (len <= 8)
                medium++;
            else
                longWord++;
        }

        System.out.println("Short: " + shortWord);
        System.out.println("Medium: " + medium);
        System.out.println("Long: " + longWord);
    }

    public static void main(String[] args) {
        String review = "This movie was absolutely fantastic and thrilling";

        classifyWordLengths(review);
    }
}
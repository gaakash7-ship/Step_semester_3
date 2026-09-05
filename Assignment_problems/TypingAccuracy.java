public class TypingAccuracy {

    static void checkTypingAccuracy(String original, String typed) {
        int count = 0;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i))
                count++;
        }

        double accuracy = count * 100.0 / original.length();

        System.out.println("Matched: " + count + "/" + original.length());
        System.out.println("Accuracy: " + accuracy + "%");
    }

    public static void main(String[] args) {
        String original = "hello world";
        String typed = "hello worlt";

        checkTypingAccuracy(original, typed);
    }
}

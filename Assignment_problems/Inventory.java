public class Inventory {

    static void analyzeInventory(int[] a, int[] b) {
        int totalA = 0, totalB = 0;
        int max = 0, index = 0;
        String section = "";

        for (int i = 0; i < a.length; i++) {
            totalA += a[i];
            totalB += b[i];

            if (a[i] > max) {
                max = a[i];
                index = i;
                section = "Section A";
            }

            if (b[i] > max) {
                max = b[i];
                index = i;
                section = "Section B";
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);
        System.out.println("Status: " + status);
        System.out.println("Highest Quantity: " + max +
                " (" + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}
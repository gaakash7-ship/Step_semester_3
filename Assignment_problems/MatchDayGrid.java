package Assignment_problems;

public class MatchDayGrid {

    static double rowAverage(int[] row) {

        int sum = 0;

        for (int x : row)
            sum += x;

        return (double) sum / row.length;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold) {

        String result = "";

        for (int i = 0; i < runsPerOver.length; i++) {

            double avg = rowAverage(runsPerOver[i]);

            if (avg >= threshold)
                result += "Match " + i + ": Power Surge";
            else
                result += "Match " + i + ": Normal";

            if (i < runsPerOver.length - 1)
                result += " | ";
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] runsPerOver = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };

        int threshold = 8;

        System.out.println(classifyMatches(runsPerOver, threshold));
    }
}
package Assignment_problems;

import java.util.Arrays;

public class Player implements Comparable<Player> {

    String name;
    int matches;
    double points;
    boolean injured;

    Player(String name, int matches, double points, boolean injured) {
        this.name = name;
        this.matches = matches;
        this.points = points;
        this.injured = injured;
    }

    static boolean isDraftable(int matches) {
        return matches >= 10;
    }

    static boolean isDraftable(int matches, boolean injured) {
        return matches >= 5 && !injured;
    }

    public int compareTo(Player p) {
        return Double.compare(p.points, this.points);
    }

    static String draftAndRank(Player[] players) {

        Player[] draft = new Player[players.length];
        int count = 0;

        for (Player p : players) {
            if (isDraftable(p.matches) ||
                isDraftable(p.matches, p.injured)) {
                draft[count++] = p;
            }
        }

        draft = Arrays.copyOf(draft, count);
        Arrays.sort(draft);

        String result = "";

        for (int i = 0; i < draft.length; i++) {
            result += (i + 1) + ". " + draft[i].name;

            if (i < draft.length - 1)
                result += " | ";
        }

        return result;
    }

    public static void main(String[] args) {

        Player[] players = {
            new Player("Virat", 15, 48, false),
            new Player("Rahul", 7, 55, false),
            new Player("Sameer", 3, 60, false),
            new Player("Dev", 12, 20, true)
        };

        System.out.println(draftAndRank(players));
    }
}
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text (max 100 chars): ");
        String ch = sc.nextLine().toUpperCase();

        int[] nb_occurrences = new int[26];

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                nb_occurrences[c - 'A']++;
            }
        }

        System.out.println("The string \"" + ch + "\" contains:");
        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                System.out.println(nb_occurrences[i] + " occurrence(s) of the letter '" + (char)(i + 'A') + "'");
            }
        }
    }
}

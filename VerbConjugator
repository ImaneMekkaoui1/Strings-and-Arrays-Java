import java.util.Scanner;

public class VerbConjugator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un verbe du premier groupe : ");
        String verb = sc.nextLine().toLowerCase().trim();

        if (verb.endsWith("er")) {
            String root = verb.substring(0, verb.length() - 2);

            System.out.println("➔ je " + root + "e");
            System.out.println("➔ tu " + root + "es");
            System.out.println("➔ il/elle " + root + "e");
            System.out.println("➔ nous " + root + "ons");
            System.out.println("➔ vous " + root + "ez");

            System.out.println("➔ ils/elles " + root + "ant");
        } else {
            System.out.println("This is not a first-group verb.");
        }
    }
}

import java.util.Scanner;
public class StringMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter String\n2. Display\n3. Reverse\n4. Word Count\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter text: ");
                    text = sc.nextLine();
                }
                case 2 -> System.out.println("String: " + text);
                case 3 -> {
                    String reversed = new StringBuilder(text).reverse().toString();
                    System.out.println("Reversed: " + reversed);
                }
                case 4 -> {
                    if (text.trim().isEmpty()) {
                        System.out.println("Word count: 0");
                    } else {
                        String[] words = text.trim().split("\\s+");
                        System.out.println("Word count: " + words.length);
                    }
                }
            }
            if (choice >= 1 && choice <= 4) {
                System.out.println("Press enter to return to menu...");
                sc.nextLine();
            }
        } while (choice != 5);
    }
}

import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        double[] grades = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
        Arrays.sort(grades);
        System.out.println("\nSorted Grades: " + Arrays.toString(grades));
        double sum = 0;
        for (double g : grades) sum += g;
        System.out.println("Average Grade: " + (sum / n));
        System.out.println("Lowest Grade: " + grades[0]);
        System.out.println("Highest Grade: " + grades[n - 1]);
        System.out.print("Enter a grade to search for: ");
        double search = sc.nextDouble();
        int count = 0;
        for (double g : grades) {
            if (g == search) count++;
        }
        System.out.println("Number of students with grade " + search + ": " + count);
    }
}

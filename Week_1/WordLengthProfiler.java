import java.util.Scanner;

public class WordLengthProfiler {

    static void classifyWordLengths(String review) {

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        // Split sentence into words
        String[] words = review.trim().split("\\s+");

        for (String word : words) {

            int length = word.length();

            if (length >= 1 && length <= 4) {

                shortWords++;

            } else if (length >= 5 && length <= 8) {

                mediumWords++;

            } else if (length >= 9) {

                longWords++;
            }
        }

        System.out.println("\n========== WORD LENGTH REPORT ==========");

        System.out.println("Short: " + shortWords);
        System.out.println("Medium: " + mediumWords);
        System.out.println("Long: " + longWords);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        classifyWordLengths(review);

        sc.close();
    }
}

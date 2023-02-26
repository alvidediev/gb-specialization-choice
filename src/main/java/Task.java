import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner inputStrings = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = inputStrings.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = inputStrings.next();
        }
        inputStrings.close();

        int count = (int) Arrays.stream(arr)
                .filter(str -> str.length() <= 3)
                .count();

        String[] shortArr = new String[count];
        int index = 0;
        for (String str : arr) {
            if (str.length() <= 3) {
                shortArr[index] = str;
                index++;
            }
        }

        System.out.println("Short strings:");
        for (String str : shortArr) {
            System.out.println(str);
        }
    }
}

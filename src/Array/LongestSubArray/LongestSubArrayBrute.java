package Array.LongestSubArray;
import Array.ArrayUtility.ArrayUtility;
import java.util.Scanner;

public class LongestSubArrayBrute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sum : ");
        int k = input.nextInt();
        int size = 10, length = 0;
        int[] arr = new int[size];
        ArrayUtility inputArray = new ArrayUtility();
        inputArray.ArrayInput(size, arr);
        for (int i = 0; i < size; i++) {
            int ans = 0;
            for (int j = i; j < size; j++) {
                ans += arr[j];
                if (ans == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        System.out.println("The Longest length : " + length);
    }
}


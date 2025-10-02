package Array.Longest_Conseucative_Sequence;

import Array.ArrayUtility.ArrayUtility;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Optimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        ArrayUtility inputTaking = new ArrayUtility();
        inputTaking.ArrayInput(size, arr);
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int j : arr) {
            set.add(j);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        System.out.println("Longest Sequence is : "+longest);
    }
}


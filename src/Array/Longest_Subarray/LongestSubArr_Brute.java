package Array.Longest_Subarray;
import Array.ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class LongestSubArr_Brute {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=input.nextInt();
        int[] arr=new int[size];
        ArrayUtility ArrInput=new ArrayUtility();
        ArrInput.ArrayInput(size,arr);
        System.out.println("Enter the Key : ");
        int K=input.nextInt();
        int l=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                if(K==sum) {
                    l=Math.max(l, j - i + 1);
                }
            }
        }
        System.out.println("Longest subarray length is : "+l);
    }
}

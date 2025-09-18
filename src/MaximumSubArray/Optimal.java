package MaximumSubArray;
import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size=input.nextInt();
        int[]arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        int sum=0,len=Integer.MIN_VALUE;
        for (int j : arr) {
            sum += j;
            if (sum < 0) {
                sum = 0;
            }
            len = Math.max(sum, len);
        }
        System.out.println("Maximum Value is : "+len);
    }
}

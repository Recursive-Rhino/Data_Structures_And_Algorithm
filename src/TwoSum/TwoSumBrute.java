package TwoSum;
import ArrayUtility.ArrayUtility;

import java.util.Scanner;
public class TwoSumBrute {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size= input.nextInt();
        System.out.println("enter the key Value : ");
        int k = input.nextInt();
        ArrayUtility inputArray=new ArrayUtility();
        int[] arr=new int[size];
        inputArray.ArrayInput(size,arr);
        for (int i =0; i <size; i++) {
            int sum=arr[i];
            for (int j = i+1; j < size; j++) {
                sum+=arr[j];
                if(sum==k) {
                    System.out.println("YES");
                    System.out.println("index is  :"+"[ "+i+","+j+" ]");
                } else {
                    sum=arr[i];
                }
            }
        }
    }
}

package BuyAndSell_Stock;
import ArrayUtility.*;
import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ArrayUtility inputTaking=new ArrayUtility();
        System.out.println("Enter the size of the Array : ");
        int size=input.nextInt();
        int[] arr=new int[size];
        inputTaking.ArrayInput(size,arr);
        int mini=arr[0];
        System.out.print("[ ");
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.print("]");
        int profit=0;
        for(int i=1;i<arr.length;i++) {
            int cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println();
        System.out.println("The Profit will be : "+profit);
    }
}

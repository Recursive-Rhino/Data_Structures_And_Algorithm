package Array.TwoSum;
import Array.ArrayUtility.ArrayUtility;
import java.util.Scanner;
public class TwoSumOptimal {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size= input.nextInt();
        System.out.println("enter the key Value : ");
        int k = input.nextInt();
        ArrayUtility inputArray=new ArrayUtility();
        int[] arr=new int[size];
        inputArray.ArrayInput(size,arr);
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        while(left<right) {
            int sum=arr[left]+arr[right];
            if(k>sum) {
                left=left+1;
            }
            if(k<sum) {
                right=right-1;
            }
            if(sum==k) {
                System.out.println("YES");
                System.out.println("Index is : ["+left+","+right+"]");
                return;
            }
        }
    } 
}

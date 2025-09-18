package LongestSubArray;
import ArrayUtility.ArrayUtility;
import java.util.Scanner;
public class LongestSubArrayOptimal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int size=10,length=0;
        int []arr=new int[size];
        ArrayUtility inputArray=new ArrayUtility();
        inputArray.ArrayInput(size,arr);
        int i=0,j=0;
        int sum=arr[0];
        while(i<arr.length) {
            while(j<=i && sum>k){
                sum=sum-arr[j];
                j++;
            }
            if(sum==k) {
                length=Math.max(i-j+1,length);
            }

            i++;
            if(i< arr.length) {
                sum+=arr[i];
            }
        }
        System.out.println("Longest length is "+length);
    }
}

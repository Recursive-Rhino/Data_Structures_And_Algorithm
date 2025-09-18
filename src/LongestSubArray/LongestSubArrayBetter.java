package LongestSubArray;
import ArrayUtility.ArrayUtility;

import java.util.HashMap;
import java.util.Scanner;
public class LongestSubArrayBetter {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sum : ");
        int k=input.nextInt();
        int size=10,length=0,prefixSum=0;
        int []arr=new int[size];
        ArrayUtility inputArray=new ArrayUtility();
        inputArray.ArrayInput(size,arr);
        HashMap<Integer,Integer> mpp=new HashMap<Integer, Integer>();
        for (int i=0;i< arr.length;i++) {
            prefixSum+=arr[i];
            int x=prefixSum-k;
            if(prefixSum==k) {
                    //mpp.put(prefixSum,i);
                    length=Math.max(i+1,length);
                    mpp.put(prefixSum,i);
            }else {
                if(mpp.containsKey(x)) {
                    //rem=k
                    int rem=i-mpp.get(x);
                    length=Math.max(rem,length);
                    System.out.println();

                }
                if(!mpp.containsKey(prefixSum)){
                mpp.put(prefixSum, i);
                }
            }
        }
        System.out.println("Longest subArray Length is  : "+length);
    }
}

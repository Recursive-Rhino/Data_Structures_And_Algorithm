package Array.GreaterThen_nBy2;

import java.util.Scanner;
import Array.ArrayUtility.ArrayUtility;
public class GreaterThen_nBy2_BruteForce {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size=input.nextInt();
        int counter=0,ans=0,num;
        int[] arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        for (int i = 0; i < arr.length; i++) {
            num=arr[i];
            counter=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]==num) {
                    counter++;
                }
            }
            if(counter>(size/2)) {
                ans=num;
            }
        }
        System.out.println("answer is : "+ans);
    }
}

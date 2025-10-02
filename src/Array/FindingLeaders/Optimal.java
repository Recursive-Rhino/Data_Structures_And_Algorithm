package Array.FindingLeaders;

import Array.ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in) ;
        System.out.println("enter the size of the Array : ");
        int size=input.nextInt();
        int[]arr=new int[size];
        int[]newArr=new int[size];
        ArrayUtility InputTaking=new ArrayUtility();
        InputTaking.ArrayInput(size,arr);
        int largestRight=arr[size-1];
        int counter=0;
        int k=0;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]<largestRight) {
                continue;
            } else {
                counter++;
            }
            if(counter>0) {
                newArr[k++]=arr[i];
            }
            largestRight=Math.max(largestRight,arr[i]);
        }
        System.out.print("Leaders are ....");
        System.out.println();
        for(int l=0;l<k;l++) {
            System.out.print(newArr[l]+" ");
        }
    }
}

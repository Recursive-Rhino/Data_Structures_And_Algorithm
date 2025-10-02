package Array.Sorting;

import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[10];
        int i,j,temp;
        for (i = 0; i < 10; i++) {
            System.out.print("Enter the number "+(i+1)+" :");
            arr[i]=input.nextInt();
        }
        for(i=0;i<10;i++) {
            for(j=0;j<10-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array is : ");
        for (i=0;i<10;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

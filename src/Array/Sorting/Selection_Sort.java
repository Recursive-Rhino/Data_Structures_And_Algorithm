package Array.Sorting;

import java.util.Scanner;
public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int min,temp,i,j;
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("Enter the number "+(i+1)+" :");
            arr[i]=input.nextInt();
        }
        System.out.println("Original Array is : ");
        for (i=0;i<10;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i=0;i<10;i++) {
            min=i;
            for ( j =i+1; j <10 ; j++) {
                if(arr[i]>arr[j]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted Array is : ");
        for (i=0;i<10;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

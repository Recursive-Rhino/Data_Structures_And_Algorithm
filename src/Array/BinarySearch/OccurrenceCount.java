package Array.BinarySearch;
import Array.ArrayUtility.*;

import java.util.Scanner;

public class OccurrenceCount {
    static void main() {
        Scanner input = new Scanner(System.in);
        ArrayUtility inputTaking = new ArrayUtility();
        System.out.println("Enter the size of the Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        inputTaking.ArrayInput(size, arr);
        System.out.println("ENTER THE NUMBER TO FIND THE OCCURRENCE OF THE NUMBER  : ");
        int num = input.nextInt();
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int low = 0;
        int high = arr.length - 1;
        if(UpperBound(arr,num)==-1) {
            System.out.println("[-1,-1]");
        } else {
            System.out.println(STR."Total Occurance is : \{UpperBound(arr, num)
                    - LowerBound(arr, num)}");
        }

    }

    public static int LowerBound(int[] arr, int search) {
        int low = 0;
        int high = arr.length - 1;

        int SmallestIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= search) {
                SmallestIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return SmallestIndex;
    }

    public static int UpperBound(int[] arr, int search) {
        int low = 0;
        int high = arr.length - 1;
        int UpperBoundIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > search) {
                UpperBoundIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return UpperBoundIndex;
    }
}


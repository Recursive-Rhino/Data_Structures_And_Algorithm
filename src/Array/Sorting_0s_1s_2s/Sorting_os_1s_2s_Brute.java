package Array.Sorting_0s_1s_2s;
import Array.ArrayUtility.ArrayUtility;
import java.util.Scanner;
import java.util.ArrayList;
public class Sorting_os_1s_2s_Brute {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int size=input.nextInt();
        int[]arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        System.out.println("Before Array.ArrayUtility.ArrayUtility.Array.ArrayUtility.ArrayUtility.Sorting the Array : " );
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
        mergeSort(arr,0,size-1);
        System.out.println();
        System.out.println("After Array.ArrayUtility.ArrayUtility.Array.ArrayUtility.ArrayUtility.Sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }

    }
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }
    public static void merge(int[]arr,int low,int mid,int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

}

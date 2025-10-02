package Array.Sorting_0s_1s_2s;
import Array.ArrayUtility.ArrayUtility;
import java.util.Scanner;
// OPTIMAL APPROACH
public class Sorting_0s_1s_2s_Optimal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the Array : ");
        int size= input.nextInt();
        int[]arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        System.out.println("Before Array.ArrayUtility.ArrayUtility.Array.ArrayUtility.ArrayUtility.Sorting : ");
        for (int k : arr) {
            System.out.print(k+" ");
        }
        // DNF Algorithm
        int low=0,mid=0,high=size-1,temp;
        while(mid<=high) {
            if(arr[mid]<1) {
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else
            if(arr[mid]>1) {
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            } else {
                mid++;
            }
        }
        System.out.println("After Array.ArrayUtility.ArrayUtility.Array.ArrayUtility.ArrayUtility.Sorting : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

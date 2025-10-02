package Array.Sorting_0s_1s_2s;
import Array.ArrayUtility.ArrayUtility;
import java.util.Scanner;

public class Sorting_0s_1s_2s_better {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Array : ");
        size=input.nextInt();
        int[]arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        Sort(arr);
        System.out.println("After Array.ArrayUtility.ArrayUtility.Array.ArrayUtility.ArrayUtility.Sorting : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void Sort(int []arr) {
        int counter1=0,counter2=0,counter0 = 0;
        for (int j : arr) {
            if (j == 0) {
                counter0++;
            }
            if (j == 1) {
                counter1++;
            }
            if (j == 2) {
                counter2++;
            }
        }
        for (int i = 0; i < counter0; i++) {
            arr[i]=0;
        }
        for (int i = counter0; i < counter1+counter0; i++) {
            arr[i]=1;
        }
        for (int i =counter1; i < counter2+counter1; i++) {
            arr[i]=2;
        }
    }
}

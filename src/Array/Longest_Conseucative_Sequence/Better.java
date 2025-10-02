package Array.Longest_Conseucative_Sequence;

import Array.ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class Better {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp,i,j;
        System.out.println("Enter the size of the Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        ArrayUtility inputTaking = new ArrayUtility();
        inputTaking.ArrayInput(size, arr);
        for (i = 0; i <size; i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int print:arr) {
            System.out.println(print+" ");
        }
        int Dup=arr[0];
        int counter=1,large=1;
        for (int k = 1; k < arr.length; k++) {
            if(arr[k]==(Dup+1)) {
                counter++;
            } else {
                large=Math.max(counter,large);
                counter=1;
                    Dup=arr[k];
            }
        }
        System.out.println("Large counter is  : "+large);
//
      }
}

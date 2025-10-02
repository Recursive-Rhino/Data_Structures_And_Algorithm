package Array.ArrayUtility;

import java.util.Scanner;

public class ArrayUtility {
    public void ArrayInput(int size,int[]arr) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number "+(i+1)+" :");
            arr[i]= input.nextInt();
        }

    }
}

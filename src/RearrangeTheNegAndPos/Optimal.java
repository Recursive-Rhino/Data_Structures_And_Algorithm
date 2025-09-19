package RearrangeTheNegAndPos;
import ArrayUtility.*;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size=input.nextInt();
        int[]arr=new int[size];
        int[] AnsArr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        int j=0,k=0;
        for (int i = 0; i < size; i++) {
            if(arr[i]>0) {
                AnsArr[2*j]=arr[i];
                j++;
            }
            if(arr[i]<0) {
                AnsArr[2*k+1]=arr[i];
                k++;
            }
        }
        System.out.println("Normal Array ...");
        for(int ans1:arr) {
            System.out.print(ans1+" ");
        }
        System.out.println();
        System.out.println("Answer ..");
        for(int ans:AnsArr) {
            System.out.print(ans+" ");
        }
    }
}

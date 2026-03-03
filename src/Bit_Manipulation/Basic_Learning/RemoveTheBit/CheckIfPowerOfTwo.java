package Bit_Manipulation.Basic_Learning.RemoveTheBit;

import java.util.Scanner;
public class CheckIfPowerOfTwo {
    static void main() {
        System.out.println("Enter the number : ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean ans=((num & (num-1))==0);
        if(ans){
            System.out.println("Yes , it is power of 2");
        } else {
            System.out.println("No it is not .. . . ");
        }
    }
}

package Bit_Manipulation;

import java.util.Scanner;

public class IthBitSetOrNot {
    static void main() {
        System.out.println("Enter the number : ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Enter the it pos to check : ");
        int i=input.nextInt();
        int ans=num & (1<<i);
        if (ans>0){
            System.out.println("Set");
        } else{
            System.out.println("Not set");
        }

    }
}

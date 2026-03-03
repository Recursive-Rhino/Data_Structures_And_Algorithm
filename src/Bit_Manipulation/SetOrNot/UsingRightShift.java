package Bit_Manipulation.SetOrNot;

import java.util.Scanner;

public class UsingRightShift {
    static void main() {
        System.out.println("Enter the number : ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Enter the it pos to check : ");
        int i=input.nextInt();
        int ans=(num>>i)&1;
        if(ans>0) {
            System.out.println("Set");
        } else {
            System.out.println("Not Set");
        }

    }
}

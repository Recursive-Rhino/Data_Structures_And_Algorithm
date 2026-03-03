package Bit_Manipulation.Basic_Learning.RemoveTheBit.SetTheIthBit;

import java.util.Scanner;

public class ByOrGate {
    static void main() {
        System.out.println("Enter the number : ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Enter the bitPos : ");
        int i=input.nextInt();
        int ans=num | (1<<i);
        System.out.println(ans);
    }
}

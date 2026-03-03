package Bit_Manipulation.Basic_Learning.RemoveTheBit.setAndUnsetBits;

import java.util.Scanner;

public class LastSetBit {
    static void main() {
        System.out.println("Enter the number : ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int ans=(num&(num-1));
        System.out.println(ans);


    }
}

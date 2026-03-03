package Bit_Manipulation.Basic_Learning.RemoveTheBit.CountTheSetBits;

import java.util.Scanner;

class ByBitWiseManipulation {
    static void main() {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        System.out.println("Counting the number of set Bits");
        while (num > 1) {
            if ((num & 1) == 1) {
                counter++;
            }
            num = num >> 1;
        }
        if (num == 1) {
            counter++;
        }
        System.out.println(STR."Total count of set Bits : \{counter}");
    }
}

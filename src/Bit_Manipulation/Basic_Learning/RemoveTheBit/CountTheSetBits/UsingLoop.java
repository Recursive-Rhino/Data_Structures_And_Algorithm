package Bit_Manipulation.Basic_Learning.RemoveTheBit.CountTheSetBits;
import java.util.Scanner;
public class UsingLoop {
    static void main() {
        int counter=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=input.nextInt();
        System.out.println("Counting the number of set Bits");
        while(num>0){
            if(num%2==1){
                counter++;
            }
            num/=2;
        }
        System.out.println(counter);
    }
}

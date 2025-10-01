package Longest_Conseucative_Sequence;
import ArrayUtility.ArrayUtility;
import java.util.Scanner;
public class Brute {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size=input.nextInt();
        int []arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);

        int LargeCounter=1;
        int j;
        for (int k : arr) {
            int num=k;
            boolean pr = true;
            int counter=1;

            while (pr) {
                boolean found=false;
                 num+=1;
                for (j = 0; j < arr.length; j++) {
                    if (arr[j] == num) {
                        counter++;
                        found=true;
                        break;
                    }
                }
                if (!found) {
                    pr = false;
                }
            }
            LargeCounter = Math.max(counter, LargeCounter);
        }
        System.out.println("Largest Counter is : "+LargeCounter);
    }
}

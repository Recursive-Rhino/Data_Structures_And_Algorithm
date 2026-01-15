package Array.PascalsTriangle;
/*
Rows number will e given
print the Particular row values (All)
 */
import java.util.Scanner;
public class Pascal_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Row to print  :");
        Printer(input.nextInt());
    }
    public static void Printer(int n) {
        int value=1;
        System.out.print(value+" ");
        for(int i=1;i<n;i++) {
            value=value*(n-i);
            value=value/i;
            System.out.print(value+" ");
        }
    }
}

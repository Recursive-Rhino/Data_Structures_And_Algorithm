package Array.PascalsTriangle;

import java.util.Scanner;

/* Row and column index will be given , you have to find out the element at that position
                            1
                          1    1
                      1     2     1
                  1      3      3     1
 */
public class Pascal_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Row and Column No. :  ");
        System.out.println(STR."Ans : \{NumFinder(input.nextInt() - 1, input.nextInt() - 1)}");


    }
    public static int NumFinder(int n,int r) {
        int value=1;
        for(int i=0;i<r;i++) {
            value=value*(n-i);
            value=value/(i+1);
        }
        return value;
    }

}


package Array.Missing_Value_Problem;

import java.util.Scanner;
public class MissingValue_Brute {
    public static void main(String[] args) {
        //Brute Force
        int i, j;
        int size = 5;
        int[] arr = new int[size-1];
        Scanner input = new Scanner(System.in);
        for (i = 0; i < size-1; i++) {
            System.out.print("Enter the number " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        int ans=AnswerReturn(arr,size);
        System.out.println("Answer is : "+ans);
    }

    public static int AnswerReturn(int[] arr,int size) {
        int i ,j,flag=0;
        for (i = 1; i <=size; i++) {
            flag = 0;//Base Case
            for (j = 0; j < size - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }
}
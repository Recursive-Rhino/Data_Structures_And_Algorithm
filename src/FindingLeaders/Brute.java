package FindingLeaders;
import ArrayUtility.ArrayUtility;
import java.util.Scanner;

public class Brute {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in) ;
        System.out.println("enter the size of the Array : ");
        int size=input.nextInt();
        int[]arr=new int[size];
        int[]newArr=new int[size];
        ArrayUtility InputTaking=new ArrayUtility();
        InputTaking.ArrayInput(size,arr);
        int j,k=0;

        System.out.println(arr.length);
        for(int i=0;i<arr.length-1;i++) {
            int counter=0;
            j=i+1;

            while(j<size) {
               if(arr[j]>arr[i]) {
                   counter=0;
                   break;
               } else {
                   counter++;
               }
               j++;
            }
            if(counter>0) {
                newArr[k++]=arr[i];
            }
//            if(j==size-1) {
//                newArr[k++]=arr[j];
//            }
        }
        newArr[k++]=arr[size-1];
        System.out.print("Leaders are ....");
        System.out.println();
        for(int l=0;l<k;l++) {
            System.out.print(newArr[l]+" ");
        }
    }
}

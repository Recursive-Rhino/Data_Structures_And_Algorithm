package Array.GreaterThen_nBy2;
import Array.ArrayUtility.ArrayUtility;
import java.util.Scanner;

public class GreaterThen_nBy2_Optimal {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        //Moore's voting Algorithm
        int ans=arr[0];
        int counter=0;
        for(int i=0;i<size;i++) {
            if(arr[i]==ans) {
                counter++;
            } else {
                counter--;
                if(counter==0) {
                    ans=arr[i];
                    counter++;
                }
            }
        }
        System.out.println("Your ans is : "+ans);
    }
    //4,4,2,4,3,4,4,3,2,4
}

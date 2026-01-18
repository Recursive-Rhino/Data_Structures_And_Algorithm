package Array.BinarySearch;
import Array.ArrayUtility.*;
import java.util.Scanner;

public class Normal {
    static void main() {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size=input.nextInt();
        int[]arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Enter the number to search : ");
        int search=input.nextInt();
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high) {
            mid=(low+high)/2; //FOr edge case
            if(arr[mid]==search){
                System.out.println("Got The Number : ");
                break;
            } else if(arr[mid]>search) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
    }
}

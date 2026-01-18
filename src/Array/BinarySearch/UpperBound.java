package Array.BinarySearch;
import Array.ArrayUtility.ArrayUtility;
import java.util.Scanner;
/*
You have to find out the smallest Index which will Greater or equals to the given number
 */
public class UpperBound {
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
        System.out.println("Enter the number : ");
        int search=input.nextInt();
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int SmallestIndex=arr.length;
        while(low<=high) {
            mid=(low+high)/2;
            if(arr[mid]>=search) {
                SmallestIndex=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        System.out.println("SMallest Index is : "+SmallestIndex);
    }
}

package Array.Missing_Value_Problem;

public class MissingValuesOptimal2nd {
    public static void main(String[] args) {
        int size=10;
        int []arr={1,2,3,4,5,6,8,9,10};
        int xor1=0,xor2=0;
        for (int i = 1; i <=10; i++) {
            xor1=xor1^i;
        }
        for (int i = 0; i <9; i++) {
            xor2=xor2^arr[i];
        }
        int ans=xor1^xor2;
        System.out.println("Missing value is : "+ans);
    }
}

package Array.Missing_Value_Problem;

public class MissingValueBetter {
    public static void main(String[] args) {
        int size=10;
        int []arr={1,2,3,4,5,6,7,8,10};
        int[]hashArr=new int[size+1];
        int j=0;
        for (int i = 0; i < size-1; i++) {
            hashArr[arr[i]]=1;
        }
        for (int i = 1; i < size; i++) {
            if(hashArr[i]==0) {
                System.out.println("The Value "+i+" Is missing.");
                break;
            }
        }
    }
}

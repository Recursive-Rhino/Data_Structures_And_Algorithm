package Missing_Value_Problem;

public class MissingValueOptimal {
    public static void main(String[] arg) {
        int size=10;
        int []arr={1,2,3,4,5,6,8,9,10};
        int GivenSum=0,OriginalSum;
        for(int i=0;i<size-1;i++){
            GivenSum=GivenSum+arr[i];
        }
        OriginalSum=(size*(size+1))/2;
        System.out.println("The missing Value is : "+(OriginalSum-GivenSum));
    }
}

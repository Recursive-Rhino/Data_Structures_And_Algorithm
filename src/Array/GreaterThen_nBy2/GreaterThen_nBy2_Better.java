package Array.GreaterThen_nBy2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Array.ArrayUtility.ArrayUtility;
public class GreaterThen_nBy2_Better {
    public static <integer> void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int []arr=new int[size];
        ArrayUtility inputTaking=new ArrayUtility();
        inputTaking.ArrayInput(size,arr);
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int j : arr) {
            int value = mpp.getOrDefault(j, 0);
            mpp.put(j, value + 1);
        }
        int ans=0;
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (arr.length / 2)) {
                ans=it.getKey();
            }
        }
        System.out.println("Answer is : "+ans);
    }
}

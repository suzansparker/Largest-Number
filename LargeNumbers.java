import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargeNumbers {
    public static String largestNumber(int[] A) {
        // Convert the integer array to a string array
        String[] nums = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            nums[i] = String.valueOf(A[i]);
        }

        // Sort the string array using a custom comparator
        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Reverse order
            }
        });

        // Handle the case where the array contains only zeros
        if (nums[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted strings to form the largest number
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("enter Array");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println(largestNumber(A));
    }
}


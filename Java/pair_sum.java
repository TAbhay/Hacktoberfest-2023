import java.util.*;
public class pair_sum {
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
            if (s.contains(temp)) {
                System.out.println("Yes");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
    }
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printpairs(A, n);
    }
}

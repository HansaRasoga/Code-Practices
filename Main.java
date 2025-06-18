import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMaxSum(arr, n));
    }

    private static int findMaxSum(int[] arr, int n) {
        if (n == 0) return 0;
        if (n == 1) return arr[0];
        
        int prev2 = 0, prev1 = arr[0], current;
        
        for (int i = 1; i < n; i++) {
            current = Math.max(prev1, prev2 + arr[i]);
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}
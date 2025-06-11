import java.util.Scanner;
public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        System.out.println("Maximum: " + max);
        sc.close();
    }
}

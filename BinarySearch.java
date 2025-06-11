import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int[] arr = new int[sc.nextInt()];
        
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter key: ");
        int key = sc.nextInt(), low = 0, high = arr.length - 1, mid, index = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(index != -1 ? "Found at index " + index : "Not found!");
        sc.close();
    }
}

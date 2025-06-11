import java.util.Scanner;
public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int[] arr = new int[sc.nextInt()];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter target number: ");
        int target = sc.nextInt(), count = 0;
        for (int num : arr) if (num == target) count++;
        
        System.out.println(target + " appears " + count + " times");
        sc.close();
    }
}

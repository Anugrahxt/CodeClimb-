import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "Not Anagram");
        sc.close();
    }
}

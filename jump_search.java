import java.util.Scanner;
import java.util.Arrays;

class jump_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int i;
        int[] ar = new int[n];
        System.out.println("Enter the elements");
        for (i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        int last = 0;
        while (ar[Math.min(step, n) - 1] < key) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                System.out.println("Element not found");
            }
        }
        last = prev + (int) Math.floor(Math.sqrt(n));
        for (i = prev; i < last; i++) {
            if (ar[i] == key) {
                System.out.println("Element is found at " + (i + 1) + " position");
            }
        }
    }
}
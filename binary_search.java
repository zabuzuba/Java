import java.util.Scanner;
import java.util.Arrays;

class binary_search {
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
        int mid, low, high;
        low = 0;
        high = ar.length;
        mid = (low + high) / 2;
        while (low <= high) {
            if (ar[mid] == key) {
                System.out.println("Element is at " + (mid + 1) + " position");
                break;
            } else if (ar[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Element not found");
        }
    }
}
import java.util.Scanner;
import java.util.Arrays;

class exponential_search {
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
        i = 1;
        if (key == ar[0])
            System.out.println("Element is present at the 1st position ");
        while (i < n && key >= ar[i]) {
            i = i * 2;
        }
        int posi = Arrays.binarySearch(ar, (i / 2), Math.min(i, n - 1), key);
        System.out.println("Element is found at " + (posi + 1) + " position");
    }
}
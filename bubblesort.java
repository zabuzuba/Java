import java.util.Scanner;

class bubblesort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int len = sc.nextInt();
        int[] ar = new int[len];
        int i, dum;
        System.out.println("Enter the elements");
        for (i = 0; i < len; i++) {
            ar[i] = sc.nextInt();
        }
        for (i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (ar[j] > ar[j + 1]) { // here change > symbol to < for descending order
                    dum = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = dum;
                }
            }
        }
        System.out.println("Sorted array is");
        for (i = 0; i < len; i++) {
            System.out.print(ar[i] + " ");
        }

    }
}
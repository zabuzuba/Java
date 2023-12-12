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
        int in;
        for (i = 0; i < len - 1; i++) {
            in = i;
            for (int j = i + 1; i < len; j++) {
                if (ar[j] < ar[in])
                    in = j;
            }
            dum = ar[in];
            ar[in] = ar[i];
            ar[i] = dum;
        }
        System.out.println("Sorted array is");
        for (i = 0; i < len; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
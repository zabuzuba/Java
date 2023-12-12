import java.util.Scanner;

class merge_sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter the elements");
        int i;
        for (i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        msort(ar, 0, size - 1);
        System.out.println("Sorted array is");
        for (i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");

        }
    }

    public static void msort(int[] a, int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high - 1) / 2;
            msort(a, low, mid);
            msort(a, mid + 1, high);
            combine(a, low, mid, high);
        }
    }

    public static void combine(int[] a, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = a[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[mid + 1 + j];
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

}
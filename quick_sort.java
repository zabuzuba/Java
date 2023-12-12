import java.util.Scanner;

class quick_sort {
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
        qsort(ar, 0, size - 1);
        System.out.println("Sorted array is");
        for (i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");

        }

    }

    static void qsort(int[] ar, int low, int high) {
        int z = 0;
        if (low < high) {
            z = partition(ar, low, high);
            qsort(ar, low, z);
            qsort(ar, z + 1, high);
        }
    }

    static int partition(int[] ar, int low, int high) {
        int pivot = ar[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i <= high && ar[i] <= pivot)
                i++;
            while (j >= low && ar[j] > pivot)
                j--;
            if (i < j) {
                int sw = ar[i];
                ar[i] = ar[j];
                ar[j] = sw;
            }
        }
        int sww = ar[low];
        ar[low] = ar[j];
        ar[j] = sww;
        return j;

    }
}

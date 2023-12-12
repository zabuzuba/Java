import java.util.Scanner;

class linear_search {
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
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        for (i = 0; i < ar.length; i++) {
            if (key == ar[i]) {
                System.out.println("Value is at " + (i + 1) + " position");
                break;
            }
        }
    }
}
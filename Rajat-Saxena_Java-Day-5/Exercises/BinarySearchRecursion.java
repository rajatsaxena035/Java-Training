import java.util.Scanner;
class BinarSearchRecursion
{
   public static int BinarSearchRecursion(int[] A, int left, int right, int x)
    {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (x == A[mid]) {
            return mid;
        }
        else if (x < A[mid]) {
            return BinarSearchRecursion(A, left,  mid - 1, x);
        }
        else {
            return BinarSearchRecursion(A, mid + 1,  right, x);
        }
    }

    public static void main(String[] args)
    {
        int a[] ;
		Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int n = s.nextInt();
        a = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter Key element to Find");
        int key = s.nextInt();
        

        int left = 0;
        int right = a.length - 1;
        int index = BinarSearchRecursion(a, left, right, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
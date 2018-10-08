import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int a[];
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
        int index = linearSearch(a, key);
        if(index == -1){
            System.out.println("Element Not found");
        }else{
            System.out.println("Element Found at index : "+index);
        }
    }
    public static int linearSearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void display(int a[]){
        System.out.println("Array Elements Are");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
            
        }
    }
}
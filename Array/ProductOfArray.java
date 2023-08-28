package Array;

public class ProductOfArray {
    public static void product(int arr[]) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        // for left
        left[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        // for right
        right[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4 };
        product(numbers);

    }
}

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortDescending {

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // Change comparison for DESCENDING order
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if no swaps happened
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(new File("dataset.txt"));

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        sc.close();

        // Convert ArrayList to array
        int[] data = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }

        // Sort using Bubble Sort (Descending)
        bubbleSortDescending(data);

        // Print sorted result
        for (int num : data) {
            System.out.println(num);
        }
    }
}

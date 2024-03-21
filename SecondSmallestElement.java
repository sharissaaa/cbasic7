import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Check if the array size is less than 2
        if (size < 2) {
            System.out.println("Please enter at least two elements.");
            return;
        }

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the second smallest element
        int secondSmallest = findSecondSmallest(array);

        // Display the result
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element in the array is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element in the array.");
        }

        scanner.close();
    }

    public static int findSecondSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        return secondSmallest;
    }
}

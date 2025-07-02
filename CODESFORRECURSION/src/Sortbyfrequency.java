import java.util.Arrays;

public class Sortbyfrequency {
    public static void main(String[] args) {
        int grr[] = {5, 6, 4, 7, 6, 9, 6};  // Input array
        int n = grr.length;

        // Array to store the unique elements
        int[] uniqueElements = new int[n];
        // Array to store the count of each element
        int[] counts = new int[n];
        int size = 0;  // To track the number of unique elements

        // Step 1: Count frequencies and store them
        for (int i = 0; i < n; i++) {
            if (grr[i] == -1) {
                continue;  // Skip if the element is already counted
            }

            int count = 1;  // Start the count for the current element

            // Count the frequency of the current element
            for (int j = i + 1; j < n; j++) {
                if (grr[i] == grr[j]) {
                    count++;
                    grr[j] = -1;  // Mark this element as counted
                }
            }

            // Store the element and its frequency in the arrays
            uniqueElements[size] = grr[i];
            counts[size] = count;
            size++;
        }

        // Step 2: Sort the uniqueElements and counts arrays based on frequency (descending)
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (counts[i] < counts[j]) {
                    // Swap counts
                    int tempCount = counts[i];
                    counts[i] = counts[j];
                    counts[j] = tempCount;

                    // Swap corresponding unique elements
                    int tempElem = uniqueElements[i];
                    uniqueElements[i] = uniqueElements[j];
                    uniqueElements[j] = tempElem;
                }
            }
        }

        // Step 3: Print the elements and their frequencies
        for (int i = 0; i < size; i++) {
            System.out.println(uniqueElements[i] + ":" + counts[i]);
        }
    }
}

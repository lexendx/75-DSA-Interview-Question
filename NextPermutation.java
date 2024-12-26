class Solution {
    // Function to reverse the portion of the array between indices i and j
    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Function to find the next permutation of the given array
    void nextPermutation(int[] arr) {
        int p = -1;
        // Step 1: Find the largest index 'p' such that arr[p] < arr[p + 1]
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }

        // Step 2: If no such 'p' exists, reverse the entire array (array is in descending order)
        if (p == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        // Step 3: Find the largest index 'q' such that arr[q] > arr[p]
        int q = -1;
        for (int i = arr.length - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }

        // Step 4: Swap arr[p] and arr[q]
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        // Step 5: Reverse the subarray from p + 1 to the end
        reverse(arr, p + 1, arr.length - 1);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example input array
        int arr[] = {1, 2, 3};

        // Call nextPermutation method to find the next permutation
        solution.nextPermutation(arr);

        // Print the result after finding the next permutation
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

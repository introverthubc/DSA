class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] zeros = new int[n];

        // Count trailing zeros in every row
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 0) {
                    count++;
                } else {
                    break;
                }
            }

            zeros[i] = count;
        }

        int swaps = 0;

        for (int i = 0; i < n; i++) {

            // Find a row below having enough trailing zeros
            int j = i;

            while (j < n && zeros[j] < n - i - 1) {
                j++;
            }

            // No suitable row found
            if (j == n) {
                return -1;
            }

            // Move row j to position i
            while (j > i) {
                int temp = zeros[j];
                zeros[j] = zeros[j - 1];
                zeros[j - 1] = temp;

                j--;
                swaps++;
            }
        }

        return swaps;
    }
}
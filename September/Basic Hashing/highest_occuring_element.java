
public class highest_occuring_element {
    static class Solution {
        public int mostFrequentElement(int[] nums) {
            int n = nums.length; // variable to store size of array

            int maxFreq = 0;
            int maxEle = 0;

            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (visited[i])
                    continue;

                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                        visited[j] = true;
                    }
                }

                if (count > maxFreq) {
                    maxFreq = count;
                    maxEle = nums[i];
                } else if (count == maxFreq) {
                    maxEle = Math.min(maxEle, nums[i]);
                }
            }
            return maxEle;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 5, 5, 6 };
        Solution sol = new Solution();

        int ans = sol.mostFrequentElement(nums);

        System.out.println("The highest occuring element in the array is: " + ans);
    }
}
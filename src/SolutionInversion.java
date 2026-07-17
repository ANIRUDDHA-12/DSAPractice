import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SolutionInversion {
        long merge(int [] arr, int low, int mid, int high) {
            List<Integer> ans = new ArrayList<>();
            int left = low;
            int right = mid + 1;
            long count = 0;

            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    ans.add(arr[left]);
                    left++;
                } else {
                    ans.add(arr[right]);
                    // All remaining elements in the left sorted subarray
                    // (from 'left' to 'mid') are greater than arr[right]
                    count += (mid - left + 1);
                    right++;
                }
            }

            while (left <= mid) {
                ans.add(arr[left]);
                left++;
            }
            while (right <= high) {
                ans.add(arr[right]);
                right++;
            }

            for (int i = low; i <= high; i++) {
                arr[i] = ans.get(i - low);
            }
            return count;
        }

        long mergeSort(int [] arr, int low, int high) {
            long count = 0;
            if (low >= high) return 0;
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
            return count;
        }

        public long numberOfInversions(int[] nums) {
            return mergeSort(nums, 0, nums.length - 1);
        }

        // --- Main Method ---
        public static void main(String[] args) {
            SolutionInversion solver = new SolutionInversion();
            int[] nums = {2, 4, 1, 3, 5};

            System.out.println("Original Array: " + Arrays.toString(nums));
            long inversions = solver.numberOfInversions(nums);
            System.out.println("Sorted Array:   " + Arrays.toString(nums));
            System.out.println("Total Number of Inversions: " + inversions);
        }
}

class Solution {
    public int findMin(int[] nums) {
        //! SORTED IN ASC ORDER

        int left = 0;
        int right = nums.length - 1;

        // we can assume thath the first one is our result
        int result = nums[0];

        while (left <= right) {
            if (nums[left] < nums[right]) {
                // posortowana w calosci- szukamy min i mamy odpowiedz
                result = Math.min(result, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;
            // sprawdzamy
            result = Math.min(result, nums[mid]);
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}

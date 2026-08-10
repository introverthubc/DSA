class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int low = binarySearch(nums, target, true);
        int high = binarySearch(nums, target, false);
        result[0] = low;
        result[1] = high;
        return result;        
    }

    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int low = 0;
        int high = nums.length - 1;
        int idx = -1;
        while (low <= high) {
            int mid=low+(high-low)/2;
            if (nums[mid]>target){
                high=mid-1;
            } else if(nums[mid]<target){
                low=mid+1;
            } else{
                idx=mid;
                if(isSearchingLeft){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return idx;
    }

}
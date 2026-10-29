class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        //4,5,6,7,0,1,2
        while(left < right){
            int mid = (right + left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else right = mid;
        }

        int p = left;
        int result = binarySearch(nums, target, p, nums.length - 1);
        if(result != -1) return result;

        return binarySearch(nums, target , 0, p - 1);
    }

    public static int binarySearch(int[] nums, int target, int left, int right){
        //4,5,6,7,0,1,2
        while(left <= right){
            int mid = (right + left) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                right = mid - 1;
            }else left = mid + 1;
        }
        return -1;
    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        //Step 1: using binary search algorithm
        while(left<right){
            int mid=left+(right-left)/2;
            //comparing the mid element if it is greater than right element
            if(nums[mid]>nums[mid+1]){
              right=mid;
            }
            else{
                left=mid+1;
            }
             
        }
        return left;
    }
}
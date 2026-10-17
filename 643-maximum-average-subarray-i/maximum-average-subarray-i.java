class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int max=Integer.MIN_VALUE;
     int i=0;
     while(i<=nums.length-k){
        int sum=0;
        for(int j=i;j<i+k;j++){
            sum=sum+nums[j];
        }
        i++;
        max=Math.max(max,sum);
     }   
     return (double)max/k;
    }
}
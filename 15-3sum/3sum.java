import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution{
    public List<List<Integer>> threeSum(int[]nums) {
      List<List<Integer>> res=new ArrayList<>();
      //1.sort the arrays
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++){
      //2. Skip duplicatesfor the first element
      if(i>0&&nums[i]==nums[i-1]){
        continue;
      }
      int left=i+1;
      int right=nums.length-1;
      //3.Two ponters search for the remaining two numbers
      while(left<right){
        int total=nums[i]+nums[left]+nums[right];
        if(total==0){
            //valid triplest found
            res.add(Arrays.asList(nums[i],nums[left],nums[right]));
            left++;
            right--;
            //skip duplicate values for the second elen=ment
            while(left<right&&nums[left]==nums[left-1]){
                left++;
            }
             while(left<right&&nums[right]==nums[right+1]){
                right--;
            }
        }
        else if(total<0){
            left++;
        }
        else{
            right--;
        }
              }

      } 
      return res; 
    }
}
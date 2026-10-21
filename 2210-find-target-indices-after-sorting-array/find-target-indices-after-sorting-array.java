import java.util.List;
import java.util.ArrayList;
class Solution {
    public static int findFirst(int nums[],int target){
        int left=0,right=nums.length-1,ans=-1;

    while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
          ans=mid;
          right=mid-1;
        }
        else if(nums[mid]<target){
            left=mid+1;
        }
        else{
          right=mid-1;
        }
    }
    return ans;
    }
      public static int findLast(int nums[],int target){
        int left=0,right=nums.length-1,ans=-1;

    while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
          ans=mid;
          left=mid+1;
        }
        else if(nums[mid]<target){
            left=mid+1;
        }
        else{
          right=mid-1;
        }
    }
    return ans;
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        List<Integer>ans=new ArrayList<>();
        int idx=first;
         while(idx<=last&&first!=-1){
          ans.add(idx);
          idx++;
         }
        return ans;
    }
}
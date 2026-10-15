class Solution {
    public int maxArea(int[] height) {
        int maxi=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int hight=Math.min(height[lp],height[rp]);
            int sW=hight*(rp-lp);
            maxi=Math.max(maxi,sW);
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxi;
    }
}
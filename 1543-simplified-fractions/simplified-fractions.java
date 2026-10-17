import java.util.ArrayList;
import java.util.HashSet;
class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans=new ArrayList<>();
        HashSet<Double>set=new HashSet<>();
     int nu=1;
     int den=2;
     while(nu<den&&nu<n&&den<=n){
        if(!set.contains((double)nu/(double)den)){
        set.add((double)nu/(double)den);
        ans.add(String.valueOf(nu)+"/"+String.valueOf(den));
        }
        nu++;
      if(nu==den){
        nu=1;
        den++;
      }
     }
     return ans;
    }
}
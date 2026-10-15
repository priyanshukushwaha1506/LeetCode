class Solution {
    public String multiply(String num1, String num2) {
       int length1=num1.length();
       int length2=num2.length();
       if(num1.equals("0")||num2.equals("0")) {
        return "0";
      }  
       int result[]=new int[length1+length2];
       for(int i=length1-1;i>=0;i--){
        int digit1=num1.charAt(i)-'0';
        for(int j=length2-1;j>=0;j--){
            int digit2=num2.charAt(j)-'0';
            int mul=digit1*digit2;
            int p1=i+j;
            int p2=i+j+1;
            int sum=mul+result[p2];
            result[p2]=sum%10;
            result[p1]+=sum/10;
        }
       }
       StringBuilder sb=new StringBuilder("");
       for(int value:result){
        if(!(sb.length()==0&&value==0)){
            sb.append(value);
        }
       }
       return sb.length()== 0 ? "0" : sb.toString();
    }
}
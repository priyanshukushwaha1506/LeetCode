import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
               st.push(c);
            }
            else if(st.isEmpty()&&c==')'){
                st.push(c);
            }
            else if(st.isEmpty()&&c==']'){
                st.push(c);
            }
            else if(st.isEmpty()&&c=='}'){
                st.push(c);
            }
            else if(st.peek()=='('&&c==')'&&!st.isEmpty()){
                st.pop();
            }
             else if(st.peek()=='{'&&c==')'&&!st.isEmpty()){
                st.push(c);
            }
            else if(st.peek()=='['&&c==')'&&!st.isEmpty()){
                st.push(c);
            }
           
           
            else if(st.peek()=='{'&&c=='}'&&!st.isEmpty()){
                st.pop();
            }
             else if(st.peek()=='('&&c=='}'&&!st.isEmpty()){
                st.push(c);
            }
             else if(st.peek()=='['&&c=='}'&&!st.isEmpty()){
                st.push(c);
            }
            else if(st.peek()=='['&&c==']'&&!st.isEmpty()){
                st.pop();
            }
             else if(st.peek()=='{'&&c==']'&&!st.isEmpty()){
                st.push(c);
            }
            else if(st.peek()=='('&&c==']'&&!st.isEmpty()){
                st.push(c);
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
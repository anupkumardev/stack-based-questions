solution: 
        class Solution {
       public String removeDuplicates(String s) {
       Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        int n=stack.size();
        char[] res =new char[n];
        for(int i=n-1;i>=0;i--){
            res[i]=stack.pop();
         }
         return new String(res);
       
    }
}

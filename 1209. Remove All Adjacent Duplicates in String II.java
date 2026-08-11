solution:
        class Solution {
    static class Pair{
        char character;
        int count;
        Pair(char character, int count){
            this.character=character;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().character==c){
                if(stack.peek().count == k-1){
                    stack.pop();
                }
                else{
                    stack.peek().count++;
                }
            }
            else{
                stack.push(new Pair(c,1));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Pair p: stack){
            for(int i=0;i<p.count; i++){
                sb.append(p.character);
            }
        }
        return sb.toString();
    }
}

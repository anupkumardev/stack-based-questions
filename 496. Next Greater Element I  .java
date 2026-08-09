solution:
        class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Stack<Integer> stack=new Stack<>();
        //to keep next greater element of each element of 2nd array we take a map
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int j=0;j<n;j++){
            nums1[j]=map.getOrDefault(nums1[j],-1);
        }
        
        return nums1;
    }
}

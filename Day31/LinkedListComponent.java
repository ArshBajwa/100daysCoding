class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int e:nums){
             s.add(e);
        }
        ListNode temp=head;
        int cnt=0;
        boolean iscomp=false;
          while(temp!=null){
            if(s.contains(temp.val)){
                if(!iscomp){
                    iscomp=true;
                    cnt++;
                }
            }
                else{
                    iscomp=false;
                }
            
            temp=temp.next;   
        }
        return cnt;  
    }
}
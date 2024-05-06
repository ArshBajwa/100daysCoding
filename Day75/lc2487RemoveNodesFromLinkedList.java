
class Solution {
    public ListNode removeNodes(ListNode head) {
      ListNode temp=reverse(head);
      ListNode curr=temp;
      int max=curr.val;
       while(curr.next!=null){
            if(curr.next.val<max){
                 curr.next=curr.next.next;
            }
            else{
                max=curr.next.val;
                curr=curr.next;
            } 
       }
      return reverse(temp);
    }
    public static ListNode reverse(ListNode head){
         ListNode curr=head;
         ListNode prev=null;
         ListNode agla=null;
         while(curr!=null){
                agla=curr.next;
                curr.next=prev;
                prev=curr;
                curr=agla;
         }
         return prev;
    }
}
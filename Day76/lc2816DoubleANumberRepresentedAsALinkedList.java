class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode rev=reverse(head);
        ListNode temp=rev;
        int carry=0;
        while(temp!=null){
            int newVal=2*temp.val+carry;
            temp.val=newVal%10;
            carry=newVal/10;
              if(temp.next==null&&carry>0){
              ListNode n=new ListNode(carry);
              temp.next=n;
              break;
        }
         temp=temp.next;
        }
        return reverse(rev);
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
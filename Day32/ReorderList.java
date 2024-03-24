class Solution {
    public void reorderList(ListNode head) {
        ListNode mid=middle(head);
        ListNode secondhalf=mid.next;
        mid.next=null;
        merge(head,reverse(secondhalf));
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        
          ListNode t1=l1;
         
          ListNode t2=l2;
          if(t2==null){
            return t1;
          }
           if(t1==null){
            return t2;
          }

          ListNode next1=t1.next;
          ListNode next2=t2.next;
          while(t1!=null&&t2!=null){
              t1.next=t2;
              t2.next=next1;
              t1=next1;
              t2=next2;
          
          if(next1!=null){
              next1=next1.next;
          }
          if(t2!=null){
            next2=next2.next;
          }
          }
          return t1;

          

    }
    public static ListNode middle(ListNode head){
           if(head==null)return head;
           ListNode slow=head;
           ListNode fast=head;
           while(fast!=null&&fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
           }
           return slow;
    }

    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
           
        }
        return prev;
    }
}
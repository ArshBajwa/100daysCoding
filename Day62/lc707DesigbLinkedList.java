class ListNode{
       ListNode next;
       int val;
       ListNode(int val){
        this.val=val;
        }
}
class MyLinkedList {
    int size=0;
     ListNode dummy;
    public MyLinkedList() {
        dummy=new ListNode(-1);
        size=0;
    }
    
    public int get(int index) {
        if(index>=size){
            return -1;
        }
        ListNode curr=dummy;
        for(int i=0;i<=index;i++){
            curr=curr.next;
        }
        return curr.val;     
    }
    
    public void addAtHead(int val) {  
        ListNode temp=new ListNode(val);
        temp.next=dummy.next;
        dummy.next=temp;
        size++;
    }

    
    public void addAtTail(int val) {
        ListNode tail=new ListNode(val);
        ListNode curr=dummy;
        for(int i=0;i<size;i++){
            curr=curr.next;
        }
         curr.next=tail;
         size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size)return;
        ListNode temp=new ListNode(val);
        ListNode curr=dummy;
        for(int i=0;i<index;i++){
              curr=curr.next;
        }
        temp.next=curr.next;   
        curr.next=temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)return;
        ListNode curr=dummy;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;
    }
}
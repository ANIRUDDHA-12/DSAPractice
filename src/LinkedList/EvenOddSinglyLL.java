package LinkedList;

public class EvenOddSinglyLL {
    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
        ListNode(int data,ListNode next){
            this.data=data;
            this.next=next;
        }

    }
    public ListNode oddEvenSplit(ListNode head){
        if(head==null){
            return null;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;

        while(even!=null && even.next!=null){
            odd=even.next;
            odd=odd.next;

            even=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}

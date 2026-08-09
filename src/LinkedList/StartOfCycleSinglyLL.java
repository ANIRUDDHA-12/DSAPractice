package LinkedList;

public class StartOfCycleSinglyLL {
    static class ListNode{
        int data;
        ListNode next;


        public ListNode(int data) {
            this.data = data;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }


        }
        return null;
    }
}



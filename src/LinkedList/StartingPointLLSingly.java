package LinkedList;

public class StartingPointLLSingly {
    public StartOfCycleSinglyLL.ListNode findStartingPoint(StartOfCycleSinglyLL.ListNode head) {
        StartOfCycleSinglyLL.ListNode fast=head;
        StartOfCycleSinglyLL.ListNode slow=head;
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

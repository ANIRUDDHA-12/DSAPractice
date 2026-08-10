package LinkedList;

public class RemoveNthElement {
    public PalindromeSinglyLL.Node removeNthElement(PalindromeSinglyLL.Node head,int n){
        if(head==null){
            return null;
        }
        PalindromeSinglyLL.Node dummy=new PalindromeSinglyLL.Node(0,head);
        PalindromeSinglyLL.Node fast=dummy;
        PalindromeSinglyLL.Node slow=dummy;
        while(fast!=null && fast.next!=null){
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}

package LinkedList;

public class CountOfLoopSinglyLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public int cycleLength(Node head){
        if (head==null){
            return 0;
        }
        Node fast=head;
        Node slow=head;
        int count=1;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                Node curr=slow;
                while(curr.next!=slow){
                    curr=curr.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}

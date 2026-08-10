package LinkedList;

public class PalindromeSinglyLL {
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
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondHalf=reverseList(slow);
        Node p1=head;
        Node p2=secondHalf;
        boolean result=false;
        while(p2!=null){
            if(p1.data!=p2.data){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return false;
    }
    Node reverseList(Node head){
        Node p=head;
        Node prev=null;
        while (p!=null){
            Node temp=p.next;
            p.next=prev;
            prev=p;
            p=temp;
        }
        return prev;
    }
}

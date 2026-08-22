package LinkedList;

public class FlattenADoublyLLWithChildren {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node child;

        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
            this.child=null;
        }
    }
    public Node flattenADoublyLL(Node head){
        if(head==null){
            return null;
        }
        Node p=head;
        while(p!=null){
            if(p.child!=null){
                Node temp=p.next;
                p.next=p.child;
                p.child.prev=p;
                p.child=null;
                Node tail=p.next;
                while(tail!=null){
                    tail=tail.next;
                }
                tail.next=temp;
                if(temp!=null){
                    temp.prev=tail;
                }
            }
            p=p.next;
        }
        return head;
    }
}

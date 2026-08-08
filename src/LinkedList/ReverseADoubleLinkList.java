package LinkedList;

public class ReverseADoubleLinkList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
        public Node(int data,Node prev,Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }
    public static Node reverseDoublyLL(Node head){
        if(head==null) return null;
        if(head.next==null) return head;

        else{
            Node p=head;
            Node ptr=null;
            while(p!=null){
                ptr=p;
                Node next=p.next;
                p.next=p.prev;
                p.prev=next;
                p=next;
            }
            return ptr;
        }
    }
    public static void printList(Node head){
        Node current=head;
        while (current!=null){
            System.out.println(current.data+"<->");
            current=current.next;
        }
        System.out.println("Null");
    }
    public static void main(String [] args){
        Node head = new Node(10);

        Node second = new Node(20, head, null);
        head.next = second;

        Node third = new Node(30, second, null);
        second.next = third;

        Node fourth = new Node(40, third, null);
        third.next = fourth;

        System.out.println("Original Doubly Linked List:");
        printList(head);

        head = reverseDoublyLL(head);

        System.out.println("\nReversed Doubly Linked List:");
        printList(head);
    }
}

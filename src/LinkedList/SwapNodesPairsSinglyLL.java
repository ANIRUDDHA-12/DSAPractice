package LinkedList;

public class SwapNodesPairsSinglyLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.next=next;
            this.next=next;
        }
    }
    public Node swapPairs(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node first=head;
        Node second=head.next;
        first.next=swapPairs(second.next);
        second.next=first;
        return second;
    }
    public static void printList(Node head){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String [] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        SwapNodesPairsSinglyLL s1=new SwapNodesPairsSinglyLL();
        System.out.println("Original Linked List");
        System.out.println(head);


        head=s1.swapPairs(head);
        System.out.println(head);
    }
}

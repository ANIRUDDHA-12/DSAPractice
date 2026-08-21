package LinkedList;

public class EvenListFlip2074 {
   static class Node {
        int data;
        Node next;
       public Node(int data){
           this.data=data;
           this.next=null;
       }
    }
    public Node reverseEvenList(Node head){
       Node prevGroupEnd=head;
       int idealSize=2;

       while(prevGroupEnd.next!=null){
           int count=0;
           Node scout=prevGroupEnd.next;
           while(count<idealSize && scout!=null){
               scout=scout.next;
               count++;
           }
           if(count%2==1){
               for(int i=0;i<count;i++){
                   prevGroupEnd=prevGroupEnd.next;
               }
           }else{
               Node end=scout;
               Node curr=prevGroupEnd.next;
               Node prev=end;

               for(int i=0;i<count;i++){
                   Node next=curr.next;
                   curr.next=prev;
                   prev=curr;
                   curr=next;
               }
               Node temp=prevGroupEnd.next;
               prevGroupEnd.next=prev;
               prevGroupEnd=temp;
           }
       }
       return head;
    }
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        System.out.print("Original List: ");
        printList(head);

        EvenListFlip2074 obj = new EvenListFlip2074();
        head = obj.reverseEvenList(head);

        System.out.print("Modified List: ");
        printList(head);
    }

}

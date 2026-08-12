package LinkedList;

public class ReverseKElementsInSinglyLL {
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
    public Node swapKElements(Node head,int k){
        if(head==null || head.next==null){
            return head;
        }
        Node p=head;
        for(int i=0;i<k;i++){
            if(p!=null){
                p=p.next;
            }
            else{
                return head;
            }
        }
        Node ptr=head;
        Node prev=null;
        for(int i=0;i<k;i++){
            Node next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        head.next=swapKElements(p,k);
        return prev;
    }

}

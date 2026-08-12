package LinkedList;

public class SwappingNodes1721 {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data, Node next){
            this.next=next;
            this.next=next;
        }
    }
    public Node SwapKNodes(Node head,int k){
        if(head==null || head.next==null){
            return head;
        }
        Node first=head;
        int count=0;
        while(first!=null && count<k-1){
            first=first.next;
            count++;
        }
        Node second=head;
        Node firstTarget=first;
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        Node secondTarget=second;
        if(firstTarget!=null && secondTarget!=null){
            int temp=firstTarget.data;
            firstTarget.data= secondTarget.data;
            secondTarget.data=temp;
        }
        return head;
    }

}

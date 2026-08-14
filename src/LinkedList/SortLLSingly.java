package LinkedList;

public class SortLLSingly {
    static class Node {
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
    public Node merge(Node right,Node left){
        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }
        Node low=left;
        Node high=right;
        Node dummy=new Node(0);
        Node curr=dummy;
        while(low!=null && high!=null){
            if(low.data<=high.data){
                curr.next=low;
                low=low.next;
            }
            else{
                curr.next=high;
                high=high.next;
            }
            curr=curr.next;
        }
        while(low!=null){
            curr.next=low;
            curr=curr.next;
            low=low.next;
        }
        while(high!=null){
            curr.next=high;
            curr=curr.next;
            high=high.next;
        }
        return dummy.next;
    }
    public Node sortLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node fast=head.next;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node first=head;
        Node second=slow.next;
        slow.next=null;
        Node firstHalf=sortLL(first);
        Node secondHalf=sortLL(second);
        return merge(firstHalf,secondHalf);
    }
    public void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" "+"->");
            temp=temp.next;
        }
    }
    public static void main(String [] args){
        Node head=new Node(5);
        head.next.data=4;
        head.next.next.data=3;
        head.next.next.next.data=2;
        head.next.next.next.next.data=1;

        SortLLSingly llSingly=new SortLLSingly();
        Node answer=llSingly.sortLL(head);
        llSingly.printLL(answer);
    }
}

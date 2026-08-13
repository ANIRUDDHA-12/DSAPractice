package LinkedList;


public class IntersectionOfTwoSInglyLL {
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
    public Node findInterSection(Node headA,Node headB){
        Node pA=headA;
        Node pB=headB;

        while(pA!=pB){
            pA=(pA==null)?headB:headA.next;
            pB=(pB==null)?headA:headB.next;
        }
        return pA;
    }


}

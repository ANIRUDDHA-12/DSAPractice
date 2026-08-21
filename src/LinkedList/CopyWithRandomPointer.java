package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyWithRandomPointer {
    class Node {
        int data;
        Node next;
        Node random;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.random=null;
        }
    }
    public Node copyRandomWithMap(Node head){
        if(head==null){
            return head;
        }
        Node p=head;
        Map<Node,Node> map=new HashMap<>();
        while(p!=null){
            Node copy=new Node(p.data);
            map.put(p,copy);
            p=p.next;
        }
        p=head;
        while(p!=null){
            Node copy=map.get(p);
            copy.next=map.get(p.next);
            copy.random=map.get(p.random);
            p=p.next;
        }
        return map.get(head);
    }
    public Node singlePass(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node p=head;
        while(p!=null){
            Node temp=p.next;
            Node copy=new Node(p.data);
            p.next=copy;
            copy.next=temp;
            p=temp;
        }
        p=head;
        Node ptr=new Node(0);
        while(p!=null){
           if(p.random!=null){
               p.next.random=p.random.next;
           }
           p=p.next.next;
        }

        p=head;
        Node curr=ptr;
        while(p!=null){
            Node temp=p.next.next;
            curr.next=p.next;
            curr=curr.next;
            p.next=temp;
            p=temp;
        }
        return ptr.next;
    }
}

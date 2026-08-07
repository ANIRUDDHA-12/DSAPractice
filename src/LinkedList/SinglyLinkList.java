package LinkedList;

public class SinglyLinkList {
    class Node {
        int x;
        Node next;
        public Node(int x){
            this.x=x;
        }
        public Node(int x,Node next){
            this.x=x;
            this.next=next;
        }
    }
    Node head;
    public void insert_beg(int x){
       Node newNode=new Node(x);
       newNode.next=head;
       head=newNode;
    }
    public void insert_end(int x){
        Node ptr=new Node(x);
        Node p;
        if(head==null){
            head=ptr;
        }
        else{
            p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=ptr;
        }
    }
    public void insert_pos(int x,int pos){
        Node ptr,p;
        ptr=new Node(x);
        if(pos<=0){
            throw new IllegalArgumentException("Invalid position");
        }
        if(pos==1){
            ptr.next=head;
            head=ptr;
        }
        else{
            p=head;
            for(int i=1;i<pos-1;i++){
                if(p==null){
                    throw new IllegalArgumentException("Invalid position");
                }
                p=p.next;
            }
            ptr.next=p.next;
            p.next=ptr;
        }
    }
    public void delete_by_key(int key){
        Node prev,p;
        prev=null;
        p=head;
        while(p!=null && p.x!=key){
            prev=p;
            p=p.next;
        }
        if(p==null){
           throw new IllegalArgumentException("Key not found");
        }
        if(p==head){
            head=head.next;
        }
        else {
            prev.next=p.next;
        }
    }
    public int del_pos(int pos){
        Node p=null;
        Node ptr=null;
        int deletedData;
        if(pos<=0){
            System.out.println("Invalid position");
            return -1;
        }
        if(pos==1){
            p=head;
            deletedData=p.x;
            head=head.next;

        }
        else{
         p=head;
         for(int i=1;i<pos-1;i++){
             if(p==null || p.next==null){
//                 throw new IllegalArgumentException("Invalid position");
                 return -1;
             }
             p=p.next;
         }
         ptr=p.next;
         p.next=ptr.next;
         deletedData=ptr.x;
        }
        return deletedData;
    }
    public int delete_pos_noHead(Node target){
        if(target==null){
            return -1;
        } else if (target.next==null) {
            return -1;
        }
        int deleteData=target.x;
        target.x=target.next.x;
        target.next=target.next.next;
        return deleteData;
    }
}

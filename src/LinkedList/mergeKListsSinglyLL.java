package LinkedList;

public class mergeKListsSinglyLL {
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data, Node next){
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
    public Node mergeSort(Node [] lists,int low,int high){
        if(low==high){
            return lists[0];
        }
        int mid=low+(high-low)/2;
        Node first=mergeSort(lists,low,mid);
        Node second=mergeSort(lists,mid+1,high);
        return merge(first,second);
    }
    public Node mergeKLists(Node [] lists){
        if(lists.length==0 || lists==null){
            return null;
        }
        return mergeSort(lists,0,lists.length-1);
    }

}

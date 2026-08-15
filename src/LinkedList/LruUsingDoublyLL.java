package LinkedList;

import java.util.Map;

public class LruUsingDoublyLL {
    public static class Node{
        Node prev;
        int value;
        int key;
        Node next;

        public Node(int key,int value){
            this.prev=null;
            this.key=key;
            this.value=value;
            this.next=null;
        }
    }
    public static class LRU{
        int capacity;
        Map<Integer,Node> map;
        Node head;
        Node tail;
        public LRU(int capacity){
            this.capacity=capacity;

            head=new Node(-1,-1);
            tail=new Node(-1,-1);

            head.next=tail;
            tail.prev=head;
        }
        private void removeNode(Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;
        }

        public void addFront(Node node){
            node.next=head.next;
            node.prev=head;
            node.next.prev=node;
            head.next=node;
        }

        public int get(int key){
            if(!map.containsKey(key)){
                return -1;
            }
            Node node=map.get(key);
            removeNode(node);
            addFront(node);
            return node.value;
        }
        public void put(int key,int value){
            if(map.containsKey(key)){
                Node node=map.get(key);
                node.value=value;
                removeNode(node);
                addFront(node);
                return;
            }
            if(map.size()>capacity){
                Node lruNode=tail.prev;
                removeNode(lruNode);
                map.remove(lruNode.key);
            }
            Node newNode=new Node(key,value);
            map.put(key,newNode);
            addFront(newNode);
        }
    }
    public static void main(String [] args){
        LRU cache=new LRU(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));

        cache.put(3, 3);
        System.out.println(cache.get(2));
    }
}

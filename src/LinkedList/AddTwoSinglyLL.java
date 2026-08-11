package LinkedList;

import java.util.LinkedList;

public class AddTwoSinglyLL {
    public EvenOddSinglyLL.ListNode twoAddLL(EvenOddSinglyLL.ListNode l1, EvenOddSinglyLL.ListNode l2){
        EvenOddSinglyLL.ListNode dummy=new EvenOddSinglyLL.ListNode(0);
        EvenOddSinglyLL.ListNode curr=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            carry=sum/10;

            curr.next=new LinkedList.EvenOddSinglyLL.ListNode(sum%10);
            curr=curr.next;
        }
        return dummy.next;

    }
}

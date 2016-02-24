package org.interview.leetcode;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
	    if (head == null || head.next == null) return head;
	    ListNode oddTail = head, evenTail, evenHead;
	    evenHead = evenTail = head.next;

	    while (evenTail != null && evenTail.next != null) {
	        // move to the odd list tail.
	        oddTail.next = evenTail.next;
	        evenTail.next = evenTail.next.next;
	        oddTail.next.next = evenHead;
	        // move tails.
	        oddTail = oddTail.next;
	        evenTail = evenTail.next;
	    }

	    return head;
	}
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		System.out.println(new OddEvenLinkedList().oddEvenList(one));
	}

	
	 
}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    @Override
  public String toString() {
  	// TODO Auto-generated method stub
  	return this.val + " -> ";
  }
}
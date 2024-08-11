package practise_app4;
///linkedList leetcode
//Input: head = [1,2,3,4,5]
//Output: [3,4,5]
//Explanation: The middle node of the list is node 3.
//Example 2:
//
//
//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
//
class ListNode
{
	int val;
	ListNode next;
	ListNode(int val)
	{
		this.val=val;
	}
}
class LinkedList{
	ListNode first;
	ListNode last;
	void add(int val)
		{
		ListNode n1= new ListNode(val);
		if(first==null){
			first=n1;
		}
		else
		{	
			last.next=n1;
		}
		last=n1;
	}
	void read()
		{
		ListNode current=first;
		while(current!=null){
			System.out.println(current.val+",");
			current=current.next;
		}
		System.out.println();
	}
	public ListNode middleNode(ListNode head) {
		ListNode oneStepPointer=head;
		ListNode twoStepPointer=head;
		
		while(twoStepPointer!=null &&
			  twoStepPointer.next!=null)
		{
			oneStepPointer=oneStepPointer.next;
			twoStepPointer=twoStepPointer.next.next;
		}
		return oneStepPointer;
	}
}
 public class  M36
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		ListNode middleNode=list.middleNode(list.first);
		System.out.println(middleNode.val);
		
		
	}
}

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class LinkedListInsertinAtPosition {
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of elemets");
		int n=sc.nextInt();

		System.out.println("Enter elements");
		Node head1=new Node(sc.nextInt());
		Node head=head1;
		for(int i=0;i<n-1;i++)
		{
			Node ptr=new Node(sc.nextInt());
			head1.next=ptr;
			head1=head1.next;
		}
        
		System.out.println("Enter element to be added along with its position starting from 0");
		int value=sc.nextInt();
		int pos=sc.nextInt();
		
		Node newNode=new Node(value);
		Node ptr=head;

		int i=0;
		while(i<pos-1 && ptr.next!=null)
		{
			i++;
			ptr=ptr.next;
		}
		
		if(ptr.next!=null)
		{
		newNode.next=ptr.next;
		ptr.next=newNode;
		}
		else if(i==pos)
		{
			newNode.next=null;
			ptr.next=newNode;
		}
		else
			System.out.println("Not a valid position");
		
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}
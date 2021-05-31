package LinkedListUsingSpring.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import node.Node;

//import .Node;

@Component
public class LinkedList {
	
	
	Node list;
	Node head = null;
	public void insert(int num)
	{
		list = new Node();
		list.data = num;

		if(head == null)
		{
			head = list;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = list;
		}
		
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	
}

package dsa2;

import java.util.Scanner;

public class dll extends node {

	public void insert(int key) {
		node new_node=new node(key);
		new_node.next = head;
	    new_node.prev = null;
	 
	    if (head != null)
	        head.prev = new_node;
	 
	    head = new_node;
	}
	
	public void display() {
		node x=head;
		while(x!=null) {
			System.out.print(x.key+" ");
			x=x.next;
		}
	}
	
	public void delete(int n) {
		node x=head;
		for(int i=0;i<n-1;i++) {
			x=x.next;
		}
		//if(x.prev != null)
		    x.prev.next=x.next;
		//else
		//	x.next.prev=null;
	}
	
	public void search(int num) {
		node x=head;
		int pos=1,flag=0;
		for(int i=0;;i++) {
			if(x != null) {
				if(x.key != num) {
				    x=x.next;
				    pos+=1;}
				else {
					break;
				}
				}
			else {
				System.out.println("Value not in list");
				flag=1;
				break;
			}
		}
		if(flag==0) {
		System.out.println("Key present at position:"+pos);}
	}

	public static void main(String[] args) {
		dll ob=new dll();
		int ch=-1,key,n;
		while(ch!=0) {
			
			System.out.println("Enter 1 to insert");
			System.out.println("Enter 2 to delete");
			System.out.println("Enter 3 to display");
			System.out.println("Enter 4 to search");
			System.out.println("Enter 0 to quit");
	        System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			
			switch(ch) {
			case 0:
				break;
			case 1:
				System.out.println("Enter a number to insert:");
				key=sc.nextInt();
				ob.insert(key);
				break;
			case 2:
				System.out.println("Enter the nth position to delete:");
				n=sc.nextInt();
				ob.delete(n);
				break;
			case 3:
				ob.display();
				System.out.println();
				break;
			case 4:
				System.out.println("Enter a key to search");
				key=sc.nextInt();
				ob.search(key);
				break;
			default:
				System.out.println("Enter a valid number");
                break;
			}
	}
		
}
}
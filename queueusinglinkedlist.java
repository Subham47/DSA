package dsa2;

/*class node{
	public node() {
		
	}
	int key;
	node head,tail,next;}*/


public class queueusinglinkedlist extends node {

	public queueusinglinkedlist() {
		head=null;
		tail=null;
	}
	
	public void insert(int key) {
		node x=new node(key);
		if(head==null) {
			head=tail=x;
			x.key=key;
			x.next=null;
			}
		else {
			x.next=x;
			x.key=key;
			x.next=null;
			tail=x;
		}
	}
	
	public void display() {
		//node x=new node();
		node x=head;
		while(x.next!=null) {
			System.out.print(x.key+"$");
		}
	}

	public static void main(String[] args) {
		queueusinglinkedlist ob=new queueusinglinkedlist();
		//System.out.println("Enter 1 to insert");
		//System.out.println("Enter 2 to delete");
		//System.out.println("Enter 3 to insert");
		//System.out.println("Enter 1 to insert");
        
		ob.insert(2);
		ob.insert(5);
		ob.insert(9);
		ob.insert(11);
		ob.display();

	}

}


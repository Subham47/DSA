/**
 * 
 */

/**
 * @author subham
 *
 */
package dsa2;
import java.util.Scanner;
import java.util.ArrayList;
public class stack {

	ArrayList<Integer> arr = new ArrayList<Integer>(5);
	public void insert(int n) {
		arr.add(n);
	}
	public void delete() {
		arr.remove(arr.size()-1);
	}
	public void display() {
		System.out.print(arr);
	}
	
	public static void main(String[] args) {
		stack ob=new stack();
		int ch=-1;
		while(ch!=0) {
			
		System.out.println("Enter 1 to insert");
		System.out.println("Enter 2 to delete");
		System.out.println("Enter 3 to display");
		System.out.println("Enter 0 to quit");
        System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();

		switch(ch) {
		    case 0:
			    break;
			case 1:
				System.out.println("Enter a number to insert:");
				int n=sc.nextInt();
				if (ob.arr.size()>=6) {
					System.out.println("Stack Overflow");
					break;
				}
                ob.insert(n);
				break;
			case 2:
				if (ob.arr.size()==0) {
					System.out.println("Stack Underflows");
					break;
				}
				ob.delete();
				break;
			case 3:
				ob.display();
				System.out.println();
				break;
			default:
				System.out.println("Enter valid input");
				break;}
		}

	}

}

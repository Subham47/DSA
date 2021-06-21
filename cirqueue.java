/**
 * 
 */

/**
 * @author subham
 *
 */
package dsa2;
import java.util.Scanner;
//import java.util.ArrayList;

public class cirqueue {
	//ArrayList<Integer> arr = new ArrayList<Integer>();
    int arr[]=new int[5];
    int head=-1,tail=-1;
	public void insert(int n,int tail) {
		//if(arr[tail]==0)
		arr[tail]=n;
	}
	public void delete(int head) {
		arr[head]=0;
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");}
	}
	
	public static void main(String[] args) {
		cirqueue Q=new cirqueue();
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
				if (Q.tail+1==Q.head||(Q.tail==Q.arr.length-1&&Q.head==0)) {
					System.out.println("Overflow "+Q.tail+" "+Q.head);
				}
				else if(Q.head==-1&&Q.tail==-1) {
					Q.head=0;Q.tail=0;
					Q.insert(n,Q.tail);
				}
				else if(Q.tail==Q.arr.length-1) {
					Q.tail=0;
					Q.insert(n,Q.tail);
				}
				else {
					Q.tail+=1;
					Q.insert(n,Q.tail);
				}
				break;
			case 2:
				System.out.println(Q.tail+" "+Q.head);
				Q.delete(Q.head);
				if (Q.head!=-1&&Q.tail!=-1&&Q.head==Q.tail) {
					System.out.println("Underflows");
				}
				else if(Q.head==Q.arr.length-1) {
					Q.head=0;
				}
				else {
				    Q.head+=1;
				}
				break;
			case 3:
				Q.display();
				System.out.println();
				break;
			default:
				System.out.println("Enter valid input");
				break;}
		}

	}

}

/*
	Mre64
	6/12/14
	
	«The Internet is a great way to get on the net.»
		- Bob Dole, Republican presidential candidate 
*/
import java.util.ArrayList;
import java.util.LinkedList;

public class StackQueues extends Struct {

	public static void main(String[] args) {
		//holds the list
		LinkedList<Integer> stack = new LinkedList<Integer>();
		//invokes new object from Struct class
		Struct store = new Struct(stack);
		//call functions
		store.push(5);
		store.enqueue(6);
		store.push(7);
		store.pop();
		store.dequeue();
	}
}

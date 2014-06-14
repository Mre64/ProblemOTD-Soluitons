/*
	Mre64
	6/12/14
	
	«The Internet is a great way to get on the net.»
		- Bob Dole, Republican presidential candidate 
*/
import java.util.LinkedList;

public class Struct {
	
	//use linkedList for the pop() push() like methods
	public static LinkedList<Integer> store = new LinkedList<Integer>();
	//static variable to hold removed items
	public static Integer keepNum;
	//Constructor
	Struct(LinkedList<Integer> store){
		Struct.store = store;
	}
	//push method
	public static void push(int pushN){
		store.addFirst(pushN);
		System.out.println(store.toString());
	}
	//pop method
	public static void pop(){
		store.pollLast();
		keepNum = store.getFirst();
		store.removeAll(store);
		store.add(keepNum);
		System.out.println(store.toString());
	}
	//enqueue method
	public static void enqueue(int enqueueN){
		store.addLast(enqueueN);
		System.out.println(store.toString());
	}
	//dequeue method
	public static void dequeue(){
		store.removeLast();
	}
}

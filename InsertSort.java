/*
	Mre64
	6/17/14
	
	''I'm a tree, I feed branches of people''
		-Kanye West
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertSort {
	
	public static void main(String[] args) {
		// Initialize ArrayList with default integer values
		List<Integer> list =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,8,9));
		// call addSort method, add 7
		sortAdd(list, 7);
		System.out.println(list.toString());
	}
	// addSort method just takes in an arrayList and a value to place in it, then sort
	public static void sortAdd(List<Integer> list, int add){
		//sort
		Collections.sort(list);
		//add integer
		list.add(add);
		//sort
		Collections.sort(list);
	}
}
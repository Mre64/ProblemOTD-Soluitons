/*
	Mre64
	6/9/14
	
	“I'm not dumb. I just have a command of thoroughly useless information.” 
		― Bill Watterson
*/
import java.util.*;

public class PryamidSort {

	public static void main(String[] args) {
		//list holds first half of data set
		List<Integer> firstHalf = new ArrayList<Integer>();
		//this list holds the second half of the data set
		List<Integer> secondHalf = new ArrayList<Integer>();
		//this list holds the end result of the pyramid
		List<Integer> pyramidSo = new ArrayList<Integer>();
		// holds the numbers to sort
		int[] pyramid = {1,22,3,17,5,6,14,8,900,10,11,12,13,7};
		// call the Pyramid sort method
		pyramidSort(pyramid, pyramidSo, firstHalf, secondHalf);
	}

	public static void pyramidSort(int[] pyramid, List<Integer> pyramidSo, List<Integer> first, List<Integer> second){
		//sort the data before handling algorithm
		Arrays.sort(pyramid);
		// this loop holds to values, which choose to pick the even or odd elements of the array
		for(int i = 0, j = 1; i < pyramid.length; i = i + 2, j = j + 2){
			//add the even elements to first list AKA --> [0] = 1, [2] = 3, [4] = 5 <--
			first.add(pyramid[i]);
			//add the odd elements to second list AKA --> [1] = 2, [3] = 4, [5] = 6 <--
			second.add(pyramid[j]);
		}
		//reverse the second list
		Collections.reverse(second);
		//add both lists together to get pyramid
		pyramidSo.addAll(first);
		pyramidSo.addAll(second);
		//print results
		System.out.println(pyramidSo);
	}
}

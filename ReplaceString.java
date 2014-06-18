/*
	Mre64
	6/16/14
	
	''If I were a single man, I might ask that mummy out. That's a good-looking mummy.''
		-Bill Clinton, mummy exhibit at the National Geographic museum
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceString {

	public static void main(String[] args) {
	//the sample string
	String str = "this is is is the string to replace is";
	//call replace function
	findAndReplaceString(str, "is", "meh");
	}
	private static void findAndReplaceString(String str,String toFind, String toReplace){
		//add contents to an arrayList
		ArrayList <String> myList =  new ArrayList<String>(Arrays.asList(str.split(" ")));
		//call the replace method
		replace(myList, toFind, toReplace);
	}
	private static void replace(ArrayList list, String toFind, String toReplace){
			// see if the word your looking for exists
			if(list.contains(toFind)){
				int freq = Collections.frequency(list, toFind);
				Collections.replaceAll(list, toFind, toReplace);
			System.out.println(list.toString() + " frequency: " + freq);
			}else{
				System.out.println("404 NOT FOUND");
		}
	}
}
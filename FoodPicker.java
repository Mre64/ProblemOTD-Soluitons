/*
	Mre64
	6/9/14
	
	"Facts are stupid things"
 		-Ronald Reagan, Former U.S. President 
*/

import java.util.Random;
import java.io.*;

public class FoodPicker {

	public static void main(String[] args) throws IOException {
			
		//food item array
		String[] foodList = {"burger","cheese","eggs","bread","banana","tofu","pho","more pho"};
		
		//create random number "n" to choose array location
		Random rand = new Random();
		int  n = rand.nextInt(foodList.length);
		
		//read file for previous food
		BufferedReader br = new BufferedReader(new FileReader("C:/thetextfile.txt"));
		StringBuilder sb = new StringBuilder();
		String read = br.readLine();
		
		//disallow eating at the same place twice in a row
		while(foodList[n].equals(read)){
			n = rand.nextInt(7) + 1;
		}
		//print food for the day
		System.out.println(foodPicker(foodList[n]));	
	}
	//food picker method
	public static String foodPicker(String foodList) throws IOException{
		//write the food chosen to a text file
		try {
            String str = foodList;
            File file = new File("C:/thetextfile.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(str);
            fw.close();
            
        //catch exception
        } catch (IOException iox) {
            
            System.out.println("excpetion");
        }
		return foodList;
	}
}


/*
	Consider a method which calculates and returns the following series:
	S(i) = 1 + 1/2^2 + 1/3^2+ 1/4^2 + 1/5^2 ... + 1/i^2

 */

public class IterVsRecur {
	// main method which runs series functions
	public static void main(String[] args) {

		IterVsRecur hw =  new IterVsRecur();
		System.out.println("<-----ITERATIVE----->");
		System.out.println(hw.seriersIter(10.0));
		System.out.println("\n<-----RECURSIVE----->");
		System.out.println(hw.seriesRec(10.0));
	}
	// iterative function using a for loop to process data
	public static double seriersIter(double input){
		double result = 0.0;
		for(int i = 1; i < input + 1; i++){
			result += (1.0/(Math.pow(i, 2)));
		}
		return result;
	}
	// recursive function which calls upon itself to process data
	public static double seriesRec(double n){
		if (n == 1.0)
            return 1.0;
		
        return (1.0 / Math.pow(n, 2)) + seriesRec( n - 1.0);
	}
}
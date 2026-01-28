package Lab1;

public class Problem5 {
	
	public static void main(String[] args) {
	//Initialize the array
	int[] NumArray = {-5, -20, -3, 50, -30};
	//Method Calls
	System.out.println("Middle:" + getMiddle(NumArray));
	System.out.println("Average:" + getAverage(NumArray));
	System.out.println("Total of negatives:" + getNegativeTotal(NumArray));
	System.out.println("More positives or negatives:" + isMoreNegative(NumArray));

	}
		public static int getMiddle(int[] NumArray){
			// Returns the middle number by taking the length of the array, dividing it by 2, and using that number as an index
			return NumArray[NumArray.length / 2];

		}
		public static double getAverage(int[] NumArray){
			int sum = 0;
			//Iterates through each number in the array, adding it the sum variable
			for (int num : NumArray) {
				sum += num;
			}
			//Returns the sum divided by the array's length, which gives the average
			return (double) sum / NumArray.length;
		}
		public static int getNegativeTotal(int[] NumArray) {
			int total = 0;
			//Iterates through each number in the array. If a number is less than 0 then it gets added to the total variable.
			for (int num : NumArray) {
				if (num < 0) {
					total += num;
				}
		}
		return total;
	}

		public static boolean isMoreNegative(int[] NumArray) {
			int negatives = 0;
			int positives = 0;
			//Iterates through each number in the array, adding 1 to negatives is the number is less than 0 and adding 1 to positives for anything else.
			for (int num : NumArray) {
				if (num < 0) {
					negatives += 1;
				} else if (num > 0) {
					positives += 1;
				}
			}
		//Boolean statement
		return negatives > positives;
		}
}



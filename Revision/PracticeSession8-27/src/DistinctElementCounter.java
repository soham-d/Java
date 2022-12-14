import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DistinctElementCounter {

	public static int getDistinctCount(int[] array) {

		ArrayList<Integer> distinctElements = new ArrayList<Integer>();
		for(int ele:array){
			if(!distinctElements.contains(ele)){
				distinctElements.add(ele);
			}
		}
		return distinctElements.size();
	}
	public static void main(String[] args) {
		
		// Array Of Numbers
		int[] numbers = new int[]{2, 9, 2, 7, 1, 9, 7, 5, 1, 2};
		// How many unique i.e. distinct elements are their ?
		// 2, 9, 7, 1, 5 | 5 element which are unique :)
		
		int count = getDistinctCount(numbers);
		System.out.println("count is: "+count);


	}

}

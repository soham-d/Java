import java.util.Arrays;

public class KnapSackBruteForceApp {
	
	static int[][] getCombinations(int number){
		
		int size = (int)Math.pow(2, number);
		System.out.println("size is: "+size);
		
		int[][] combinations = new int[size][number];
		
		// Write Algo here and share it with me :)

		for(int idx = 0; idx<size; idx++){
			String bin = Integer.toBinaryString(idx);
			char[] chars = bin.toCharArray();
			int[] ints = new int[chars.length];




		}
		
		return combinations;
	}

	public static void main(String[] args) {
		
		// KnapSack :)
		// Pick up an Ornament and Put it in a bag
		//				 0    1  2  3  4  5
		int[] weights = {20, 10, 9, 4, 2, 1};
		int[] value = {4000, 3500, 1800, 400, 1000, 200};
		int capacity = 20;

		// We need to find a solution, so that we pick up those weights where we can have maximum value
		// Condition -> if we picked one weight we cannot pick it again :)
		
		// We need to work on all the combinations :)
		// Generate the Combinations
		
		// Consider for 3 weights we have 2 power 3 combinations :)
		// 20, 10, 9
		// 0   0   0
		// 0   0   1
		// 0   1   0
		// 0   1   1
		// 1   0   0
		// 1   0   1
		// 1   1   0
		// 1   1   1
		
		int[][] combinations = getCombinations(weights.length);
		
		for(int[] combination : combinations) {
			System.out.println(Arrays.toString(combination));
		}
		
	}

}

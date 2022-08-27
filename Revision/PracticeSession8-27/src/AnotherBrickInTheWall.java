public class AnotherBrickInTheWall {

	/*
	 	
	 	John & Jack construct wall of n bricks..
	 	
	 	Consider n is 9, i.e. John and Jack has to create a wall of 9 bricks..
	 	
	 			Brick Placed		Total Bricks
	 	John	1					1
	 	Jack	1*2 = 2				3
	 	John	2					5
	 	Jack	2*2 = 4				9
	 	
	 	Who placed the last brick => Jack
	 	How many bricks were placed in the last => 4
	 	
	 	---------------
	 	
	 	Consider n is 13, i.e. John and Jack has to create a wall of 13 bricks..
	
	 			Brick Placed		Total Bricks
	 	John	1					1
	 	Jack	1*2 = 2				3
	 	John	2					5
	 	Jack	2*2 = 4				9
	 	John	3					12
	 	Jack	3*2 = 6	| 1			13			
	 	
	 	Who placed the last brick => Jack
	 	How many bricks were placed in the last => 1
	 	
	 	
	 */
	
	static int[] placeBricks(int numOfBricks) {
		//		0th index:	John(1), Jack(2)
		//		1st index:	last bricks placed
		int[] result = {2, 1};
		int bricksLeft = numOfBricks;
		int john = 1;
		int jack = 1;
		//int bricksPlaced;

		while(true){
			if(bricksLeft>0 && bricksLeft >= john && bricksLeft >= jack){
				bricksLeft -= john;
				//bricksPlaced = john;
				result[1] = 1;
				result[0] = john;
				john++;
			}
			if(bricksLeft>0 && bricksLeft >= john && bricksLeft >= jack){
				bricksLeft -= (jack*2);
				result[0] = jack;
				result[1] = 2;
				jack++;
			}
			if(bricksLeft<=(2*jack) && bricksLeft>=0){
				return result;
			}

		}
	}
	
	public static void main(String[] args) {
		
		int[] result = placeBricks(13);
		System.out.println("Last Brick Placed by: "+result[0]);
		System.out.println("Last Bricks Placed: "+result[1]);

	}

}

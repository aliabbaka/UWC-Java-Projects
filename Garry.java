public class Garry {

	public static void main(String[] args) {
			
		// 2D array = an array of arrays
		
		String[][] cars = 	{	
								{"I","Love","Pizza"},
								{"hope","you","like it"},
								{"hehe","hehe","hehe"}
							};
		String[][] cars1 = 	new String[3][3];
		
		
		cars1[0][0] = "I may";
		cars1[0][1] = "agree";
		cars1[0][2] = "that";
		cars1[1][0] = "A little";
		cars1[1][1] = "bit";
		cars1[1][2] = "spicy";
		cars1[2][0] = "hehe";
		cars1[2][1] = "hehe";
		cars1[2][2] = "hehe";
		

		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars1[i][j]+" ");
				
			}
			
			
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}
		}
	}
}
public class Charlot {

	private static Object then;

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon

		
		int x = 7;
		int y = 4;
		int p = 5;
		int f = 6;
		int m = 3;
		int z = add(x,y,p,f,m);
       
		System.out.println(z);
	}
	
	static int add(int x, int y, int p, int f, int m) {

		int z = x + y * p / f - m;
		
		if( z == z) {
			System.out.print("The answer is ");
		}
		return z;
		
		
	}
	
}
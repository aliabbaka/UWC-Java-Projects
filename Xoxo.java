import java.util.ArrayList;

public class Xoxo {

	public static void main(String[] args) {
			
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable. less flexible
	
		
		String[] animals2 = {"I ","Have ","No ","Time "};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("dash");
		animals.add("dash");
		animals.add("I'm");
		animals.add("TIRED");
		animals.add("AND");
		animals.add("SLEEPY");
		
		animals.set(0, "");
		animals.set(1, "");
		for(String i : animals2) {
			System.out.print(i);
		}
		for(String i : animals) {
			System.out.println(i);
		}
		
	      }
	     
            }

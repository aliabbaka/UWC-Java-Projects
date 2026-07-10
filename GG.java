import java.util.ArrayList;

public class GG {
		public static void main(String[] args) {
			
			// ArrayList = 	a resizable array. 
			//				Elements can be added and removed after compilation phase
			//				store reference data types
			
			ArrayList<String> food = new ArrayList<String>();
			
			food.add("pizza");
			food.add("hamburger");
			food.add("hotdog");
			
			food.set(0, "sushi"); //replace the array by calling its name and change it
			food.remove(2);       //remove the array by calling its name 
			//food.clear();       //clear everything
			
			for(int i=0; i<food.size(); i++) {
				System.out.println(food.get(i));
			}
		}
	
	}



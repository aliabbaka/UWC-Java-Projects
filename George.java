import java.util.*;

public class George {

	public static void main(String[] args) {
		
	 ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		   //here we are doing a 2D arrayList that consists of different arrays in which
		  // each one stores data inside it, then we print all of them through calling
		 //  the arrayList
		
		  ArrayList<String> breakfastList = new ArrayList();
		  breakfastList.add("Eggs");
		  breakfastList.add("Bread and garlic");
		  breakfastList.add("Tea");
		
		  ArrayList<String> launchList = new ArrayList();
		  launchList.add("Burger");
		  launchList.add("Fries");
		  launchList.add("Coke");
		
		  ArrayList<String> dinnerList = new ArrayList();
		  dinnerList.add("pizza");
		  dinnerList.add("smashed potato");
		 
	   groceryList.add(breakfastList);
	   groceryList.add(launchList);
	   groceryList.add(dinnerList);

	 System.out.println(groceryList);
		
	}
}
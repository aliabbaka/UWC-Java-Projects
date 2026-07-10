
public class blah {

	public static void main(String[] arg) {
	    //string is a reference data that we use to store one or more character.
		//we can have access to them and they are useful 
		
		String name = "Ali"; 
		
		  boolean result = name.equalsIgnoreCase("aLi");
		  char result1 = name.charAt(0);
		  int result2 = name.indexOf("i");
		  boolean result3 = name.isEmpty();
		  String result4 = name.toUpperCase();
		  String result5 = name.toLowerCase();
		  String result6 = name.trim();
		  String result7 = name.replace('A', ' ');
		  
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	System.out.println(result5);
	System.out.println(result6);
	System.out.println(result7);
	}

}

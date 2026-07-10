package printF;

public class IDK {

	public static void main(String[] arg) {
	

		System.out.printf("this is your %d? or that's not ",800);
		
		boolean myBoolean = true;  //a result that can only have one of two possible values: true or false.
		char myChar = ' ';
		String myString = "or yours is ";
		int myInt = 50;
		double myDouble = 0; // primitive data type
			
		
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000

		System.out.println("");
		System.out.printf("-No bro you owe me nothing (%,f) ",myDouble);
	}

}

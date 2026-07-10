
public class Meow {

		public static void main(String[] args) {
				
				// wrapper class = 	provides a way to use primitive data types as reference data types
				//					reference data types contain useful methods
				//					can be used with collections (ex.ArrayList)
				
				//primitive		//wrapper
				//---------		        //-------
				// boolean		Boolean
				// char			Character
				// int			Integer
				// double		Double
				
				// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
				// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
				
			Boolean a = true;    //primitive data type example
			Character b = '@';
			Integer c = 123;
			Double d = 3.14;
				
				if(a == true)  {
				System.out.println("A is correct");
				 }
				
				if(b == 9)  {
				System.out.println("B is correct");
				}
				else {
					System.out.println("B is wrong ");
				}
				
				if(c == c)  {
					System.out.println("C is correct");
					}
				
				if(d == 3)  {
					System.out.println("D is correct");
					}
				else {
					System.out.println("D is wrong ");
				}
				
				
			}
			
		}
	



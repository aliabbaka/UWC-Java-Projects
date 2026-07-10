package acceptInput;

import java.util.Scanner;

public class Garden {

 public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.println("What is your name? ");
  String name = scanner.nextLine();
  
  System.out.println("How old are you? ");
  int age = scanner.nextInt();
  scanner.nextLine();
  
  System.out.println("What is your favorite food?");
  String food = scanner.nextLine();
   
  System.out.println("Hello "+name+"hope you doing well");
  System.out.println("You are "+age+" years old");
  System.out.println("You like "+food+" really good taste!");

 } 
}
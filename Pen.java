import java.util.Random;

public class Pen {
 
 Random random;
 int number;
 
 Pen(){
  random = new Random();
  roll();
 }
 
 void roll() {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}
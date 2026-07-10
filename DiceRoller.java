package variableScope;

import java.util.Random;

public class DiceRoller {
 
 Random random;
 int number;
 
 DiceRoller(){
  random = new Random();
  roll();
 }
 
 void roll() {
  number = random.nextInt(100)+1;
  System.out.println(number);
 }
}
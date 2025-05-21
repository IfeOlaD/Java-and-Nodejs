import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Random dice = new Random();

	System.out.print("Guess a number between 1 and 100: ");
	int x = input.nextInt();

	int y = dice.nextInt(100);	

	System.out.printf("%d %d", x, y);
	
	input.close();
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner num = new Scanner(System.in);

	int product;

	System.out.println("Enter a number");
	int i = num.nextInt();

	product = i * 3;

	System.out.println(product + " is the number you entered multiplied by 3.");
	num.close();
    }
}

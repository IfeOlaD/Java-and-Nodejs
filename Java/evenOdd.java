import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner num = new Scanner(System.in);

      	System.out.println("Enter the number");
	int n = num.nextInt();

	if(n % 2 == 0){
	    System.out.println("The number '" + n + "' is even");
	}
	else{
	    System.out.println("The number '" + n + "' is odd");
	}

    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner grade = new Scanner(System.in);

	System.out.println("Enter your score");
	int score = grade.nextInt();

	if(score > 100){
	    System.out.println("The score '" + score + "' is out of range");
	}
	else if(score >= 70){
	    System.out.println("Your score '" + score + "' is an grade");
	}
	else if(score >= 60){
	    System.out.println("Your score '" + score + "' is a B grade");
	}
	else if(score >= 50){
	    System.out.println("Your score '" + score + "' is a C grade");
	}
	else if(score >= 40){
	    System.out.println("Your score '" + score + "' is a D grade");
	}
	else if(score < 0){
	    System.out.println("The score '" + score + "' is out of range");
	}
	else {
	    System.out.println("Your score '" + score + "' is an F grade");
	}
    }
}

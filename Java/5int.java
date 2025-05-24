import java.util.Scanner;
public class Main{
    public static void main(String[] args){

	Scanner grade = new Scanner(System.in);

	int[] score = new int[5];

	System.out.println("Enter 5 scores");

	for(int i = 0; i < score.length; i++){
	    score[i] = grade.nextInt();
	}

	System.out.println("You entered the following:");
	for(int i = 0; i < score.length; i++){
	    System.out.println(score[i]);
	}

	grade.close();
    }
}

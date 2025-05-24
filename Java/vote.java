import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	int age;

	Scanner kage = new Scanner(System.in);

	System.out.println("What is your current age");
	age = kage.nextInt();

	int year = (18 - age) + 2025;
	
	if(age < 18 && age >= 0){
	    System.out.printf("Not eligible to vote. You will be eligible to vote in %d. \n", year);
	}
	else if(age < 0 || age > 150){
	    System.out.println("Number is out of range");
	}
	else{
	    System.out.printf("Eligible to vote. You were eligible to vote in %d. \n", year);
	}
	kage.close();
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	float length, width;
	Scanner scArea = new Scanner(System.in);

	System.out.println("Enter the length");
	length = scArea.nextFloat();

	scArea.nextLine();

	System.out.println("Enter the width");
	width = scArea.nextFloat();

	float area = length * width;

	System.out.printf("%.2f X %.2f = %.2f \n", length, width, area);
    }
}

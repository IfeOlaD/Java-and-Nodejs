import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner fibo = new Scanner(System.in);

	System.out.println("Enter nth element of the series");
	int fib = fnacci(fibo.nextInt());
	System.out.println(fib);
	fibo.close();
    }
    public static int fnacci(int i){
	if(i >= 3){
	    return fnacci(i - 1) + fnacci(i - 2);
	}
	else{
	    return 1;
       	}
    }
}

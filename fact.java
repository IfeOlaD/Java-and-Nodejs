import java.util.Scanner;
public class Fact{
    public static void main(String[] args){
	Scanner fact = new Scanner (System.in);

	System.out.println("Enter a number");
	int factos = facti(fact.nextInt());
	System.out.println(factos);
	fact.close();
    }

    public static int facti(int i){

	if(i == 0){
	    return 1;
	}
	else{
	    return i * facti(i - 1);
	}
	/**if(i < 0){
	    return 1;
	    }*/
    }
}

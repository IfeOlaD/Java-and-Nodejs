public class Main{
    public static void main(String[] args){
	int [] num = {20, 30, 40, 50};
	int i;
	int sum = 0;

	for(i = 0; i < num.length; i++){
	    sum += num[i];
	}
	System.out.println(sum);
    }
}

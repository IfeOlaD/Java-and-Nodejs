public class Main{
    public static void main(String[] args){
	int [] num = {20, 30, 40, 50};
	int i;
	int sum = 0;
	float avg;
	int lgt = num.length; //length

	for(i = 0; i < num.length; i++){
	    sum += num[1];
	}
	avg = sum/lgt;
	System.out.println(avg);
    }
}

public class Fact{
    public static void main(String[] args){
	int factos = facti(10);
	System.out.println(factos);
    }

    public static int facti(int i){

	if(i > 0){
	    return (facti * (i - 1) * (i - 2));
	}
	else{
	    return i;
	}
    }
}

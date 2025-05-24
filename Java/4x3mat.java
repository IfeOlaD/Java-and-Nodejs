public class Main{
    public static void main(String[] args){
	int [][] age = {{2,3,4,5},{6,7,8,9},{1,9,5,3}};
	int i,j;

	for(i = 0; i < age.length; i++){
	    for(j = 0; j < age[i].length; j++){
		System.out.print(age[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}

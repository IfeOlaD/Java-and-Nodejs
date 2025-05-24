public class Main{
    public static void main(String[] args){
        int num;
        int multi;

        for(num = 1; num <= 12; num++){
            System.out.println();
            for(multi = 1; multi <= 12; multi++){
                System.out.printf("%d x %d = %d \n", num, multi, num * multi);
            }
        }
    }
}

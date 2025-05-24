public class Main{
    public static void main(String[] args){
        int score = 60;
        //String scores = "A";
        switch(score){
        case int i when i >= 70 -> System.out.printf("Your grade is A \n");
        case int j when j >=  60 -> System.out.printf("Your grade is B \n");
        }
    }
}

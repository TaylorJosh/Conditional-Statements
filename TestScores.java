import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100:");
        int testScore = input.nextInt();

        //Scale: 100-90-A, 89-80-B, 79-70-C, 69-60-D, 59-below-F 

        if(testScore < 59 && testScore >= 0){
            System.out.println("I'm sorry you have failed. Your grade is 'F'." );}
        else if(testScore > 59 && testScore <= 69) {
            System.out.println("Need to study more. You passed with a 'D'." ); }
        else if(testScore > 69 && testScore <= 79) {
            System.out.println("You did okay. You passed with a 'C'." ); }
        else if(testScore > 79 && testScore <= 89) {
            System.out.println("Good Job! You got a 'B'." ); }
        else if(testScore > 100 || testScore < 0) {
                System.out.println("Invalid. Number must be between 0 and 100. " ); }
        else{System.out.println("Great Job! You got an 'A'." );}
    }
}

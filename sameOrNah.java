import java.util.Scanner;

public class sameOrNah {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = input.nextLine();

        System.out.println("Enter another word:");
        String word2 = input.nextLine();

        if(word1.equals(word2)){
            System.out.println("The words are the same" );
        }
        else {System.out.println("The words are different" ); }
    }
}


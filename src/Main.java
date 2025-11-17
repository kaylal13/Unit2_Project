import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Unscramble the Word!");
        System.out.println("Based on a random number, you will be assigned a difficulty level!");
        System.out.println("Form a word based on the random letters you receive!");
        System.out.println("--------------------------------------------------------");
        UnscrambleGame game = new UnscrambleGame();
        System.out.println("Your difficulty level is: "+game.determineLevel());
        System.out.println("Your word is: "+game.determineWord());
        System.out.println("Unscramble the word: ");
        String userAnswer = scan.next();


    }
}

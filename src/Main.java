import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to Unscramble the Word!");
        System.out.println("Based on a random number, you will be assigned a difficulty level!");
        System.out.println("Form a word based on the random letters you receive! (You do NOT need to use all letters)");
        System.out.println("--------------------------------------------------------------------------------");
        UnscrambleGame game = new UnscrambleGame();
        game.getRandNum();
        System.out.println("Your difficulty level is: "+game.determineLevel());
        System.out.println("Your random letters are: "+game.determineWord());
        System.out.println("Form a word: ");
        String userAnswer = scan.next();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Your answer is: "+game.result(userAnswer));
        game.ending();


    }
}

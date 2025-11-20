import java.util.Objects;

public class UnscrambleGame {
    private  String word;
    int randNum;
    boolean correct;
    String level= "";

    public void getRandNum (){
        randNum = (int)(Math.random()*12)+1;
    }

    public String determineLevel(){
        if (1<=randNum && randNum<=4){
            level = "Easy";
        } else if(randNum>=5 && randNum<=8){
            level = "Medium";
        } else if (randNum>=9 &&randNum<=12) {
            level = "Hard";
        }
        return level;
    }

    public String determineWord (){
        if (level.equals("Easy")) {
            word = "fureas";
        } else if (level.equals("Medium")){
            word = "ahgsertu";
        }
        else {
            word = "weoizmdflspke";
        }

        return word;
    }

    public String result (String userAnswer) {
        userAnswer = userAnswer.toLowerCase();
        String answer = "";
        String character = "";
        for (int j=0;j<word.length();j++){
            character = word.substring(j,j++);
        }
        for (int i = 0; i < userAnswer.length(); i++) {
            String current = userAnswer.substring(i, i + 1);
            if (current.contains(character)) {
                correct = true;
                answer = "Acceptable";
            } else {
                correct = false;
                answer = "Not accepted";

            }
        }
        return answer;
    }
//now everything returns accepted but it did accept user's answers that contained characters from different indices (error from before)

    public void ending (){
        if (correct){
            System.out.println("Congrats you win!");
        } else System.out.println("You lose!");
    }
}

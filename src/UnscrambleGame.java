import java.util.Objects;

public class UnscrambleGame {
    private  String word;
    int randNum;
    boolean correct;
    String level;

    public void getRandNum (){
        randNum = (int)(Math.random()*12)+1;
    }

    public String determineLevel(){
        String level = "";
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
        if (level.equals("Easy")){
            word = "f u r e a s";
        } else if (level.equals("Medium")){
            word = "a h g s e r t u";
        }
        else {
            word = "w e o i z m d f l s p k e";
        }

        return word;
    }

    public String result (String userAnswer) {
        userAnswer = userAnswer.toLowerCase();
        String answer = "";
        for (int i = 0; i < userAnswer.length(); i++) {
            String current = userAnswer.substring(i, i + 1);
            String searchWord = word.substring(i, i + 1);
            if (current.equals(searchWord)) {
                correct = true;
                answer = "Acceptable";
            } else {
                correct = false;
                answer = "Not accepted";

            }
        }
        return answer;
    }

    public void ending (){
        if (correct){
            System.out.println("Congrats you win!");
        } else System.out.println("You lose!");
    }
}

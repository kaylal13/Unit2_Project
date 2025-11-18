public class UnscrambleGame {
    private  String word;
    int randNum;
    boolean correct;

    public void getRandNum (){
        randNum = (int)(Math.random()*10)+1;
    }

    public String determineLevel(){
        String level;
        if (randNum<=5){
            level = "Easy";
        } else level = "Hard";
        return level;
    }

    public String determineWord (){
        if (randNum<=5){
            word = "fureas";
        } else {
            word = "ahgsertu";
        }

        return word;
    }

    public String result (String userAnswer) {
        userAnswer = userAnswer.toLowerCase();
        String answer = "";
        boolean correct = true;
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
    //correct needs to be brought out of method to be accessed in another to make ending work??
    //issue: ending prints you lose no matter what

    public void ending (){
        if (correct){
            System.out.println("Congrats you win!");
        } else System.out.println("You lose!");
    }
}

public class UnscrambleGame {
    private String userAnswer;
    private  String word;
    int randNum;

    public int getRandNum (){
        randNum = (int)(Math.random()*10)+1;
        return randNum;
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
            word = "now";
        } else {
            word = "ahgsertu";
        }

        return word;
    }

    public Boolean answer (String userAnswer, String word) {
        userAnswer = userAnswer.toLowerCase();
        boolean correct = false;
        for (int i = 0; i < userAnswer.length(); i++) {
            String current = userAnswer.substring(i, i + 1);
            String searchWord = word.substring(i, i + 1);
            if (current.equals(searchWord)) {
                correct = true;
            } else correct = false;
        }
        return correct;
    }

}

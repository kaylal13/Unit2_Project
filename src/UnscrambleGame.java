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
        } else level = "hard";
        return level;
    }

    public String determineWord (){
        if (randNum<=5){
            word = "now";
        } else {
            word = "silent";
        }

        return word;
    }

}

package com.opckev;

public class Compare {
    private Questions questions;
    private GiveAnswer giveAnswer;
    public String result {
        if (questions.getGoodanswer() == giveAnswer.reponse){
            System.out.println("Vous avez trouvé la bonne réponse");
        }
        else {
            System.out.println("Vous avez répondu faux");
        }
    }

    public String getResult() {
        return result;
    }
}

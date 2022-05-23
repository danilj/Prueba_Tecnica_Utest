package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterface.UtestJoinToday;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String success= Text.of(UtestJoinToday.SUCCESSFULL_BUTTON).viewedBy(actor).asString();
        if (question.equals(success)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}

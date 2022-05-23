package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Register implements Task {

    private String form;

    public Register(String form){
        this.form = form;
    }

    public static Register onPage(String form) {
        return Tasks.instrumented(Register.class, form);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Daniela").into(UtestForm.FIELD_NAME),
                Enter.theValue("Londoño").into(UtestForm.FIELD_LASTNAME),
                Enter.theValue("danielalj13@gmail.com").into(UtestForm.FIELD_EMAIL),
                SelectFromOptions.byVisibleText("July").from(UtestForm.COMBO_MONTH),
                SelectFromOptions.byVisibleText("13").from(UtestForm.COMBO_DAY),
                SelectFromOptions.byVisibleText("1991").from(UtestForm.COMBO_YEAR),
                Click.on(UtestForm.LANGUAGES),
                Click.on(UtestForm.NEXT_BUTTON),
                Click.on(UtestForm.CITY),
                Enter.theValue("Armenia").into(UtestForm.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UtestForm.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(UtestForm.ZIP),
                Enter.keyValues("6600").into(UtestForm.ZIP),
                Click.on(UtestForm.COUNTRY),
                Click.on(UtestForm.DEVICES),
                Click.on(UtestForm.MOBILE),
                Click.on(UtestForm.MODEL),
                Click.on(UtestForm.SYSTEM),
                Click.on(UtestForm.LASTSTEP),
                Enter.theValue("123Test*").into(UtestForm.PASSWORD),
                Enter.theValue("123Test*").into(UtestForm.CONFIRM),
                Click.on(UtestForm.CHECK1),
                Click.on(UtestForm.CHECK2),
                Click.on(UtestForm.CHECK3),
                Click.on(UtestForm.COMPLETE));
    }
}

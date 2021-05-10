package starter.choucair;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SearchForC {

    public static Performable term(String term) {
        return Task.where("{0} attempts to search for #term",
                Click.on(EmployeeForm.SEARCH_BUTTON)
        ).with("term").of(term);
    }
    
    public static Performable convoc(String term) {
        return Task.where("{0} attempts to click for #term",
                Click.on(EmployeeForm.SEARCH_BUTTON)
        ).with("term").of(term);
    }
}

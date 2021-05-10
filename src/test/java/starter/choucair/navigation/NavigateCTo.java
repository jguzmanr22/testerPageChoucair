package starter.choucair.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateCTo  {

    public static Performable theChucairHomePage() {
        return Task.where("{0} opens the Chucair home page",
                Open.browserOn().the(ChoucairHomePage.class)
        );
    }
    public static Performable aMissingPage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(WrongCPage.class)
        );
    }

}
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;

public class TestScenarioBuilder {

    private String searchQuery;
    private String expectedTitle;

    public TestScenarioBuilder withSearchQuery(String query) {
        this.searchQuery = query;
        return this;
    }

    public TestScenarioBuilder withExpectedTitle(String title) {
        this.expectedTitle = title;
        return this;
    }

    public void runScenario() {
        SelenideElement searchInput = Selenide.$(By.id("search"));
        searchInput.setValue(searchQuery).pressEnter();
        Selenide.title().equals(text(expectedTitle));
    }
}


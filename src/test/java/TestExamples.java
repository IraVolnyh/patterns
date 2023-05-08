import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestExamples {

    @Test
    public void testElementWidth() throws InterruptedException {
        open(PageObjects.homepageURL);
        //Example of Facade pattern usage
        Facade.closeCustomPopup();
        SelenideElement element = Selenide.$(PageObjects.headerLogo);
        //Example of Decorator pattern usage
        CustomAssertions.assertThat(element).hasWidth(170);
    }

    //Example of Builder pattern usage
    @Test
    public void testSearch() throws InterruptedException {
        open(PageObjects.homepageURL);
        Facade.closeCustomPopup();
        TestScenarioBuilder builder = new TestScenarioBuilder()
                .withSearchQuery(PageObjects.searchQuery)
                .withExpectedTitle("Search results for: 'hoodie'");
        builder.runScenario();
    }
}

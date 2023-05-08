import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

public class CustomAssertions {

    public static SelenideElementAssert assertThat(SelenideElement element) {
        return new SelenideElementAssert(element);
    }

    static class SelenideElementAssert {

        private final SelenideElement element;

        public SelenideElementAssert(SelenideElement element) {
            this.element = element;
        }

        public SelenideElementAssert hasValue(String value) {
            element.shouldHave(Condition.attribute(value));
            return this;
        }

        public SelenideElementAssert hasClass(String className) {
            element.shouldHave(Condition.attribute(className));
            return this;
        }

        // Add new assertion method for checking element's width
        public SelenideElementAssert hasWidth(int width) {
            int actualWidth = element.getSize().getWidth();
            if (actualWidth != width) {
                throw new AssertionError("Expected element width to be " + width + ", but was " + actualWidth);
            }
            return this;
        }
    }
}


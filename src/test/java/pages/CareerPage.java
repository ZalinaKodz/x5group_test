package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CareerPage {
    private final SelenideElement
            goToCareer = $(".header--active"),
            scrollToCareer = $(".text-w-media--reverse"),
            checkText = $(withText("Наша миссия — улучшать качество жизни людей"));

    public CareerPage openPage() {
        open("https://www.x5.ru/ru/");

        return this;
    }
        public CareerPage chooseSectionCareer(String value) {
            goToCareer.shouldHave(text(value)).click();

            return this;
        }

        public CareerPage scrollIntoView(Boolean value) {
            scrollToCareer.scrollIntoView(value);

            return this;
        }

        public CareerPage checkTextMission(String value) {
            checkText.shouldHave(text(value)).should(exist);

            return this;
        }
}

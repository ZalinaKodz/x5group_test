package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ConsumerPage {
    private final SelenideElement
            scrollToConsumer = $(".block-header__heading-wrap"),
            chooseSection = $(".buyer__text-content"),
            scrollToNews = $(".news-block__head"),
            goToAllPublication = $(".news-block__controlls"),
            chooseFirstPublication = $("#splide01-slide01"),
            scrollToFile = $(".docslist__docs--tile"),
            downloadFile = $(".button-link-trigger-hover");

    public ConsumerPage openPage() {
        open("https://www.x5.ru/ru/");

        return this;
    }
    public ConsumerPage scrollSectionConsumer(Boolean value) {
        scrollToConsumer.scrollIntoView(value);

        return this;
    }

    public ConsumerPage choosePlanning(String value) {
        chooseSection.shouldHave(text(value)).click();

        return this;
    }

    public ConsumerPage scrollSectionNews(Boolean value) {
        scrollToNews.scrollIntoView(value);

        return this;
    }

    public ConsumerPage clickAllPublication(String value) {
        goToAllPublication.shouldHave(text(value)).click();

        return this;
    }

    public ConsumerPage getFistPublication() {
        chooseFirstPublication.click();

        return this;
    }

    public ConsumerPage downloadingPressRelease(Boolean value) throws FileNotFoundException {
        scrollToFile.scrollIntoView(value);
        File file = downloadFile.download();
        Assertions.assertTrue(file.exists());

        return this;
    }
}

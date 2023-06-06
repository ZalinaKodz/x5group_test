package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ConsumerPage;

import static io.qameta.allure.Allure.step;
import static test.TestData.allPublication;
import static test.TestData.section;

@Tag("X5Group")
public class ConsumerPageTest extends TestBase {
    ConsumerPage consumerPage = new ConsumerPage();
    @Test
    @DisplayName("Доступность раздела 'Новости' из вкладки 'Покупателю'")
    public void checkNewsSectionTests() {
        step("Открываем главную страницу", () -> {
            consumerPage.openPage();
        });
        step("Скроллим до раздела 'Покупателю'", () -> {
            consumerPage.scrollSectionConsumer(true);
        });
        step("Выбираем 'Найти рецепт и подобрать ингредиенты'", () -> {
            consumerPage.choosePlanning(section);
        });
        step("Скроллим до раздела 'Новости'", () -> {
            consumerPage.scrollSectionNews(true);
        });
        step("Переходим в раздел 'Все публикации'", () -> {
            consumerPage.clickAllPublication(allPublication);
        });
        step("Выбираем первую статью в списке", () -> {
            consumerPage.getFistPublication();
        });
        step("Проверяем, что пресс-релиз к статье можно скачать", () -> {
            consumerPage.downloadingPressRelease(true);
        });
    }

}
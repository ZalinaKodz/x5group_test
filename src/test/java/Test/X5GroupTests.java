package Test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("X5Group")
public class X5GroupTests extends TestBase {
    @Test
    @DisplayName("Доступность раздела Новости из вкладки Покупателю ")
    public void checkNewsTests() {
        step("Открываем главную страницу", () -> {
            open("https://www.x5.ru/ru/");
        });
        step("Скроллим до раздела Покупателю", () -> {
            $(".block-header__heading-wrap").scrollIntoView(true);
        });
        step("Выбираем Найти рецепт и подобрать ингредиенты", () -> {
            $(".buyer__text-content").shouldHave(text("Найти рецепт и подобрать ингредиенты")).click();
        });
        step("Скроллим до раздела Новости", () -> {
            $(".news-block__head").scrollIntoView(true);
        });
        step("Переходим в раздел Все публикации", () -> {
            $(".news-block__controlls").shouldHave(text("Все публикации")).click();
        });
        step("Выбираем первую статью в списке", () -> {
            $("#splide01-slide01").click();
        });
        step("Проверяем, что пресс-релиз к статье можно скачать", () -> {
            $(".docslist__docs--tile").scrollIntoView(true);
            $(".button-link--hover-outer-bg-none").doubleClick();
        });
    }
}

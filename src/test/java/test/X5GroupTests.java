package test;

import org.junit.jupiter.api.*;
import pages.X5Elements;

import static io.qameta.allure.Allure.step;

@Tag("X5Group")
public class X5GroupTests extends TestBase {
    X5Elements x5Elements = new X5Elements();
    @Test
    @DisplayName("Проверка работы поиска")
    public void checkSearchResult() {
        step("Открываем главную страницу", () -> {
            x5Elements.openPage();
        });
        step("Кликаем по значку поиска", () -> {
            x5Elements.clickSearchIcon();
        });
        step("Вводим в поле поиска значение 'Открытие'", () -> {
            x5Elements.enterInSearchField("Открытие");
        });
        step("Скроллим страницу до результатов поиска", () -> {
            x5Elements.scrollToResultOfSearch(true);
        });
        step("Проверяем, что по поиску находится статья под названием 'История компании'", () -> {
            x5Elements.checkThatResultExist();
        });
    }

    @Test
    @DisplayName("Проверка, что в разделе 'Карьера' есть описание миссии компании")
    public void checkCareerSectionTest() {
        step("Открываем главную страницу", () -> {
            x5Elements.openPage();
        });
        step("Переходим в раздел 'Карьера'", () -> {
            x5Elements.chooseSectionCareer("Карьера");
        });
        step("Скроллим до раздела 'Работа в X5 Group'", () -> {
            x5Elements.scrollIntoView(true);
        });
        step("Проверяем, что на странице есть текст: 'Наша миссия — улучшать качество жизни людей'", () -> {
            x5Elements.checkTextMission("Наша миссия — улучшать качество жизни людей");
        });
    }

    @Test
    @DisplayName("Доступность раздела 'Новости' из вкладки 'Покупателю'")
    public void checkNewsSectionTests() {
        step("Открываем главную страницу", () -> {
            x5Elements.openPage();
        });
        step("Скроллим до раздела 'Покупателю'", () -> {
            x5Elements.scrollSectionConsumer(true);
        });
        step("Выбираем 'Найти рецепт и подобрать ингредиенты'", () -> {
            x5Elements.choosePlanning("Найти рецепт и подобрать ингредиенты");
        });
        step("Скроллим до раздела 'Новости'", () -> {
            x5Elements.scrollSectionNews(true);
        });
        step("Переходим в раздел 'Все публикации'", () -> {
            x5Elements.clickAllPublication("Все публикации");
        });
        step("Выбираем первую статью в списке", () -> {
            x5Elements. getFistPublication();
        });
        step("Проверяем, что пресс-релиз к статье можно скачать", () -> {
            x5Elements.downloadingPressRelease(true);
        });
    }

    @Test
    @DisplayName("Поиск несуществующей строки в разделе 'Компания'")
    public void negativeTestForSectionCompany() {
        step("Открываем главную страницу", () -> {
            x5Elements.openPage();
        });
        step("Переходим в раздел 'Компания'", () -> {
            x5Elements.chooseSectionCompany();
        });
        step("Скроллим до раздела 'Работа в X5 Group'", () -> {
            x5Elements.scrollWorkingAtX5(true);
        });
        step("Проверяем отсутствие в тексте значения '343000' как количества работников", () -> {
            x5Elements.checkNumberOfEmployees();
        });
    }

    @Test
    @Disabled
    @DisplayName("По клику на 'EN' сайт переходит на английский")
    public void skippedTestCheckingTranslation() {
        step("Открываем главную страницу", () -> {
            x5Elements.openPage();
        });
        step("Кликаем по кнопке 'EN' в главном меню справа", () -> {
            x5Elements.clickEnLang();
        });
        step("Скроллим до футера", () -> {
            x5Elements.goToFooter(true);
        });
        step("Проверяем, что на адресс компании отображается на английском", () -> {
            x5Elements.checkAddress("119049, Russia, Moscow, Koroviy Val street, 5, building 1");
        });
    }
}

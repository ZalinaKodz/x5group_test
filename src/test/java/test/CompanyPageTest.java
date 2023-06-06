package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CompanyPage;

import static io.qameta.allure.Allure.step;

@Tag("X5Group")
public class CompanyPageTest extends TestBase {
    CompanyPage companyPage = new CompanyPage();
    @Test
    @DisplayName("Поиск несуществующей строки в разделе 'Компания'")
    public void negativeTestForSectionCompany() {
        step("Открываем главную страницу", () -> {
            companyPage.openPage();
        });
        step("Переходим в раздел 'Компания'", () -> {
            companyPage.chooseSectionCompany();
        });
        step("Скроллим до раздела 'Работа в X5 Group'", () -> {
            companyPage.scrollWorkingAtX5(true);
        });
        step("Проверяем отсутствие в тексте значения '343000' как количества работников", () -> {
            companyPage.checkNumberOfEmployees();
        });
    }
}

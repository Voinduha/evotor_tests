package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ClipboardTest extends TestBase {
    @Test
    @DisabledIfSystemProperty(named = "selenide.remote", matches = "http.*", disabledReason = "Clipboard not " +
    "support on Selenium Grid yet")
    @Description("Soon to be implemented by me (or QA engineers)")
    @DisplayName("Проверяем копипасту из буфера обмена в поле ввода телефона на страницу личного кабинета")
    void clipboardLoadTest() {

        step("Открываем личный кабинет'", () ->
                open("https://market.evotor.ru/store/auth/login"));

        step("Вставляем текст в буфер обмена", () -> {
            Selenide.clipboard().setText("9256545667");
        });

        step("Вводим номер телефона в поле на странице комбинацией кнопок CTRL + v", () -> {
            $(".evo-input").sendKeys(Keys.CONTROL + "v");
        });

        step("Проверяем, что номер телефона введен в правильном формате", () -> {
            $("").shouldHave(value("(925) 654-56-67"));
        });
    }
}

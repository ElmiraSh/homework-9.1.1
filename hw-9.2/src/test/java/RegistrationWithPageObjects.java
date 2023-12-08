import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.DatePicker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithPageObjects {
    DatePicker DatePicker = new DatePicker();

    SelenideElement

            firstnameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userGender = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userDate = $("#dateOfBirthInput"),
            setUserChemistry = $("#subjectsInput"),
            userhobbies = $("#hobbiesWrapper"),
            userPicture = $("#uploadPicture"),
            userCurrentAddress = $("#currentAddress"),
            userState = $("#react-select-3-input"),
            userCity = $("#react-select-4-input"),
            userClick = $("#submit"),
            userRegistration = $("#example-modal-sizes-title-lg");
    ;


    public RegistrationWithPageObjects setFirstnameInput(String value) {
        firstnameInput.setValue(value);
        return this;
    }

    public RegistrationWithPageObjects setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationWithPageObjects setUserEmailInput(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationWithPageObjects setGender(String value) {
        userGender.$(byText(value)).click();
        return this;
    }

    public RegistrationWithPageObjects setUserNumberInput(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationWithPageObjects setDate(String day, String month, String year) {
        userDate.click();
        DatePicker.setDate(day, month, year);
        return this;
    }

    public RegistrationWithPageObjects setUserChemistry(String value) {
        setUserChemistry.setValue(value).pressEnter();
        return this;
    }

    public RegistrationWithPageObjects userhobbies(String value) {
        userhobbies.$(byText(value)).click();
        return this;
    }

    public RegistrationWithPageObjects setPicture(String value) {
        userPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationWithPageObjects setUserCurrentAddress(String value) {
        userCurrentAddress.setValue(value);
        return this;
    }

    public RegistrationWithPageObjects setState(String value) {
        userState.setValue(value).pressEnter();
        return this;
    }

    public RegistrationWithPageObjects setCity(String value) {
        userCity.setValue(value).pressEnter();
        return this;
    }

    public RegistrationWithPageObjects setClick() {
        userClick.click();
        return this;
    }

    public RegistrationWithPageObjects openBrowser() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationWithPageObjects hideFooter() {
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationWithPageObjects fixeban() {
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationWithPageObjects checkResult(String key, String value) {
        userRegistration.shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(key + " " + value));
        return this;
    }
}



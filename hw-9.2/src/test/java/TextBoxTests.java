
import org.junit.jupiter.api.Test;
import utils.UtilsFaker;


public class TextBoxTests extends TestBase {

    RegistrationWithPageObjects registrationWithPageObjects = new RegistrationWithPageObjects();
    UtilsFaker utilsFaker = new UtilsFaker();

    @Test
    void fillFormTest() {

        registrationWithPageObjects.openBrowser()
                .hideFooter()
                .fixeban()
                .setFirstnameInput(utilsFaker.userName)
                .setLastName(utilsFaker.lastName)
                .setUserNumberInput(utilsFaker.userNumber)
                .setUserEmailInput(utilsFaker.userEmail)
                .setGender(utilsFaker.userGender)
                .userhobbies(utilsFaker.userHobbies)
                .setUserCurrentAddress(utilsFaker.userCurrentAddress)
                .setDate(utilsFaker.userDate, utilsFaker.userMonth, utilsFaker.userYear)
                .setUserChemistry(utilsFaker.userSubjects)
                .setState(utilsFaker.state)
                .setCity(utilsFaker.userCity)
                .setPicture("picture.jpg")
                .setClick();

        registrationWithPageObjects.checkResult("Student Name", utilsFaker.userName + " " + utilsFaker.lastName)
                .checkResult("Student Email", utilsFaker.userEmail)
                .checkResult("Mobile", utilsFaker.userNumber)
                .checkResult("Hobbies", utilsFaker.userHobbies)
                .checkResult("Gender", utilsFaker.userGender)
                .checkResult("Address", utilsFaker.userCurrentAddress)
                .checkResult("Date of Birth", utilsFaker.userDate + " " + utilsFaker.userMonth + "," + utilsFaker.userYear)
                .checkResult("Picture", "picture.jpg");
    }

}

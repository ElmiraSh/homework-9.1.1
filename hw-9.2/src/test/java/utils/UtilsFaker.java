package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class UtilsFaker {
    public Faker faker = new Faker(new Locale("en"));

    public String userName = faker.name().firstName(),
            lastName = faker.name().firstName(),
            userEmail = faker.internet().emailAddress(),
            userGender = getRandomGender(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            userSubjects = getRandomSubjects(),
            userHobbies = getRandomHobbies(),
            userCurrentAddress = faker.address().fullAddress(),
            state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            userDate = String.valueOf(faker.number().numberBetween(1, 28)),
            userMonth = getRandomMonth(),
            userYear = String.valueOf(faker.number().numberBetween(1990, 2015)),
            userCity = setRandomCity( state);


    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
    }

    public String getRandomSubjects() {
        String[] subjects = {"Math", "Arts", "Chemistry", "Hindi", "English", "Biology", "Computer Science"};
        return faker.options().option(subjects);
    }

    public String getRandomHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }


    public String getRandomMonth() {
        String[] month = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(month);
    }

    public static String setRandomCity(String state) {
        Faker faker = new Faker();
        switch (state) {
            case "NCR":
                return faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh":
                return faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana":
                return faker.options().option("Karnal", "Panipat");
            case "Rajasthan":
                return faker.options().option("Jaipur", "Jaiselmer");
            default:
                throw new IllegalArgumentException("Invalid state: " + state);
        }
    }
}

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public abstract class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1500x1280";
        Configuration.pageLoadStrategy = "eager";
        // Configuration.headless=true;
        Configuration.holdBrowserOpen = true;

    }
}

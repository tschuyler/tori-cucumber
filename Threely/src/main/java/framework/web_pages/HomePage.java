package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By signInButton = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a");
    private By profileButton = By.xpath("//ul[@class='nav navbar-nav navbar-right']");

    public void clickOnSignInButton() { clickOn(signInButton);}

    public void clickOnProfileButton () { clickOn(profileButton); }


}

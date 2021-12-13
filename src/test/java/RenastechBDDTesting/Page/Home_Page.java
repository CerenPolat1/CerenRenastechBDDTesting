package RenastechBDDTesting.Page;

import RenastechBDDTesting.Utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page {

    public Home_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h2[@style='font-weight:300;line-height:66px;color:#555555;']")
    public WebElement sentence;

    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement price;


    public WebElement getPrice(){
        return price;

    }

    public void setSentence(WebElement sentence) {
        this.sentence = sentence;
        sentence.getText().trim();
    }


}
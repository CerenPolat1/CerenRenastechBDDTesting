package RenastechBDDTesting.Page;

import RenastechBDDTesting.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentDone_Page {

    public PaymentDone_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='card_nmuber']")
    public WebElement cardNumber;

    @FindBy(xpath = "//select[@id='month']")
    public WebElement expiryMonth;

    @FindBy(xpath = "//select[@id='year']")
    public WebElement expiryYear;

    @FindBy(xpath = "//input[@name='cvv_code']")
    public WebElement cvvCode;

    @FindBy(xpath = "//input[@type='submit']/..")
    public WebElement paybutton;

    @FindBy(xpath = "//h2[@style='font-weight:300;line-height:66px;color:#555555;']")
    public WebElement sentence;

//    public void setSentence() {
//
//        sentence.getText().trim();
//    }

    public WebElement getSentence() {
        sentence.getText().trim();
        return sentence;
    }

//    public void setExpiryYear(String year) {  //we dont need that bec. using map
//
//        Select select=new Select(expiryYear);
//        select.selectByValue(year);
//    }

}

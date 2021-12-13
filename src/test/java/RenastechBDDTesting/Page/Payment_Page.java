package RenastechBDDTesting.Page;

import RenastechBDDTesting.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payment_Page {

    public Payment_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


 @FindBy(xpath = "//select[@name='quantity']")
public WebElement quantity;

@FindBy(xpath = "//input[@value='Buy Now']/..")
public WebElement clickbutton;


    public void setQuantityButton(String quant){
        Select select=new Select(quantity);
        select.selectByValue(quant);
    }



}

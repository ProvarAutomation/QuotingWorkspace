package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="PriceOppProductLaunch"
               , namespacePrefix=""
               , object=""
               , connection="Admin"
     )             
public class PriceOppProductLaunch {

	@TextType()
	@FindBy(xpath = "//*[@id=\"10:12;a\"]")
	public WebElement lotSize;
	@ChoiceListType()
	@FindBy(xpath = "//*[@id=\"21:12;a\"]")
	public WebElement type;
	@TextType()
	@FindBy(xpath = "//*[@id=\"31:12;a\"]")
	public WebElement Quantity;
	@ButtonType()
	@FindByLabel(label = "Add")
	public WebElement add;
	@ButtonType()
	@FindByLabel(label = "Remove")
	public WebElement remove;
	@ButtonType()
	@FindByLabel(label = "Calculate")
	public WebElement calculate;
	@ButtonType()
	@FindByLabel(label = "Save Price")
	public WebElement savePrice;
	@ButtonType()
	@FindBy(xpath = "//div[5]/div[1]/input")
	public WebElement addAdjust;
	@TextType()
	@FindBy(xpath = "//div[5]/div[2]//input")
	public WebElement discountPercent;
	@TextType()
	@FindBy(id = "8:12;a")
	public WebElement LotSize;
	
}

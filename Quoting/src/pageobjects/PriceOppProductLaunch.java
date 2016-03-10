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
	@FindBy(id = "31:12;a")
	@TextType()
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
	@FindBy(id = "9:13;a")
	@ChoiceListType()
	public WebElement Dma;
	@FindBy(id = "25:13;a")
	@ChoiceListType()
	public WebElement AlphaZone;
	@FindBy(id = "44:13;a")
	@ChoiceListType()
	public WebElement Make;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	@ChoiceListType()
	@FindBy(id = "8:13;a")
	public WebElement Duration;
	
}

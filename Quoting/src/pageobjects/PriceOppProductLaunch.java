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
	@FindBy(xpath = "//label/span[text()='Lot Size']/../../input")
	public WebElement lotSize;
	
	@ChoiceListType()
	@FindBy(xpath = "//label/span[text()='Type:']/../../select")
	public WebElement type;
	
	@TextType()
	@FindBy(xpath = "//label/span[text()='Quantity:']/../../input")
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
	
	@PageWait.Timed(durationSeconds = 5)
	@TextType()
	@FindBy(xpath = "//label/span[text()='Lot Size']/../../input")
	public WebElement LotSize;
	
	@PageWait.Timed(durationSeconds = 5)
	@FindBy(xpath = "//label/span[text()='DMA:']/../../select")
	@ChoiceListType()
	public WebElement Dma;
	
	@FindBy(xpath = "//label/span[text()='Alpha Zone:']/../../select")
	@ChoiceListType()
	public WebElement AlphaZone;
	
	@FindBy(xpath = "//label/span[text()='Make:']/../../select")
	@ChoiceListType()
	public WebElement Make;
	
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	
	@ChoiceListType()
	@FindBy(xpath = "//label/span[text()='Duration:']/../../input")
	public WebElement Duration;
	
	@TextType()
	@FindBy(id = "37:13;a")
	public WebElement DMAList;
	
	@ChoiceListType()
	@FindBy(xpath = "//label/span[text()='Type:']/../../select")
	public WebElement Type;
	
}

package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
	@ButtonType()
	@FindByLabel(label = " Sync ")
	public WebElement sync;
	@ButtonType()
	@FindByLabel(label = " Done ")
	public WebElement done;
	@ButtonType()
	@FindByLabel(label = "Add Line Item")
	public WebElement addLineItem;
	@BooleanType()
	@FindBy(xpath = "//*[@id=\"01uE0000000yILK\"]")
	public WebElement select;
	@ButtonType()
	@FindByLabel(label = "Select")
	public WebElement select1;
	@TextType()
	@FindByLabel(label = "Quantity")
	public WebElement quantity;
	@TextType()
	@FindByLabel(label = "Sales Price")
	public WebElement salesPrice;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
			
}

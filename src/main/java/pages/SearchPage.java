package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import methods.TestBase;
import pageobjectlocators.SearchPageLocators;

public class SearchPage extends TestBase{
	
	/* Initializing WebDriver for the page*/
	public WebDriver driver;
	
	/* Mapping the Object locators to the page*/
	@FindBy(xpath =SearchPageLocators.clickroundTrip)
	@CacheLookup
	public WebElement clickroundTrip;
	
	@FindBy(xpath =SearchPageLocators.clickoneWay)
	@CacheLookup
	public WebElement clickoneWay;
	
	@FindBy(xpath =SearchPageLocators.fromLocation)
	@CacheLookup
	public WebElement fromLocation;
	
	@FindBy(xpath =SearchPageLocators.selectFromDropDown)
	@CacheLookup
	public WebElement selectFromDropDown;
	
		
	@FindBy(xpath =SearchPageLocators.toLocation)
	@CacheLookup
	public WebElement toLocation;
	
	@FindBy(xpath =SearchPageLocators.datesFlexible)
	@CacheLookup
	public WebElement datesFlexible;
	
	@FindBy(xpath =SearchPageLocators.selectToDropDown)
	@CacheLookup
	public WebElement selectToDropDown;
	
	@FindBy(xpath =SearchPageLocators.fromDate)
	@CacheLookup
	public WebElement fromDate;
	
	@FindBy(xpath =SearchPageLocators.toDate)
	@CacheLookup
	public WebElement toDate;
	
	@FindBy(xpath =SearchPageLocators.clickSearch)
	@CacheLookup
	public WebElement clickSearch;
	
	@FindBy(xpath =SearchPageLocators.selectAdult)
	@CacheLookup
	public WebElement selectAdult;
	
	@FindBy(xpath =SearchPageLocators.clickPlus)
	@CacheLookup
	public WebElement clickPlus;
		
	@FindBy(xpath =SearchPageLocators.clickPlusCancel)
	@CacheLookup
	public WebElement clickPlusCancel;
	
	@FindBy(xpath =SearchPageLocators.clickAllsearchOptions)
	@CacheLookup
	public WebElement clickAllsearchOptions;
	
	@FindBy(xpath =SearchPageLocators.headertext)
	@CacheLookup
	public WebElement headertext;
	
	@FindBy(xpath =SearchPageLocators.selectNonStopOne)
	@CacheLookup
	public WebElement selectNonStopOne;
	
	@FindBy(xpath =SearchPageLocators.selectNonStopTwo)
	@CacheLookup
	public WebElement selectNonStopTwo;
	
	@FindBy(xpath =SearchPageLocators.myPreference)
	@CacheLookup
	public WebElement myPreference;
	
	
	@FindBy(xpath =SearchPageLocators.addAirport)
	@CacheLookup
	public WebElement addAirport;
	
	@FindBy(xpath =SearchPageLocators.clickdropdownonAddairport)
	@CacheLookup
	public WebElement clickdropdownonAddairport;
	
	@FindBy(xpath =SearchPageLocators.flexibleFares)
	@CacheLookup
	public WebElement flexibleFares;
	
	@FindBy(xpath =SearchPageLocators.milEarning)
	@CacheLookup
	public WebElement milEarning;
	
	
	@FindBy(xpath =SearchPageLocators.searchAll)
	@CacheLookup
	public WebElement searchAll;
	
	@FindBy(xpath =SearchPageLocators.goHome)
	@CacheLookup
	public WebElement goHome;
	
	
	@FindBy(xpath =SearchPageLocators.selectTripLength)
	@CacheLookup
	public WebElement selectTripLength;
	
	@FindBy(xpath =SearchPageLocators.generalClick)
	@CacheLookup
	public WebElement generalClick;
	
	
	public SearchPage(WebDriver dr)
	{
		driver=dr;
	}
	
	public void clickroundTrips()
	{
		letsWait();
		clickroundTrip.click();
		letsWait();
	}
	
	public void clickoneWay()
	{

		clickoneWay.click();
		letsWait();
	}
	public void enterFromLocation(String location)
	{
		Actions actions = new Actions(driver);
		fromLocation.click();
		letsWait();
	
		actions.sendKeys(location);
		System.out.println("Location is " +location);
		actions.build().perform();
		letsWait();
	}
	
	public void selectFromDropDown()
	{
		selectFromDropDown.click();
	}
	
	public void enterToLocation(String location)
	{
		Actions actions = new Actions(driver);
		toLocation.click();
		letsWait();
	
		actions.sendKeys(location);
		System.out.println("Location is " +location);
		actions.build().perform();
		letsWait();
	}
	
	public void selectToDropDown()
	{
		selectToDropDown.click();
	}
	
	public void datesFlexible()
	{
		datesFlexible.click();
	}
	
	
	
	public void enterFromDate(String date)
	{
		Actions actions = new Actions(driver);
		fromDate.click();
		letsWait();
	
		actions.sendKeys(date);
		System.out.println("Date is " +date);
		actions.build().perform();
		letsWait();
	}
	
	public void enterToDate(String date)
	{
		Actions actions = new Actions(driver);
		toDate.click();
		letsWait();
	
		actions.sendKeys(date);
		System.out.println("Date is " +date);
		actions.build().perform();
		letsWait();
	}
	
	public void selectAdult()
	{

		selectAdult.click();
		letsWait();
	}
	
	public void clickCount(String num)
	{
		for(int i=1;i<Integer.parseInt(num);i++)
		{
			clickPlus.click();
		}
	}
	
	public void clickPlusCancel()
	{
		clickPlusCancel.click();
		letsWait();
	}
	
	public void clickAllsearchOptions()
	{
		clickAllsearchOptions.click();
	}
	
	public String headerText()
	{
		String text = headertext.getText();
		 letsWait();
		return text;
	}
	
	public void selectNonStop()
	{
		selectNonStopOne.click();
		 letsWait();
		 selectNonStopTwo.click();
		 letsWait();
	}
	
	public void myPreference()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(myPreference).click().perform();
	//	myPreference.click();
		letsWait();
	}
	
	public void addAirport(String name)
	{
		Actions actions = new Actions(driver);
		addAirport.click();
		letsWait();
	
		actions.sendKeys(name);
		System.out.println("Date is " +name);
		actions.build().perform();
		letsWait();
		actions.moveToElement(clickdropdownonAddairport).click().perform();
		//clickdropdownonAddairport.click();
	}
	
	public void flexibleFares()
	{
		flexibleFares.click();
		letsWait();
	}
	
	public void milEarning()
	{
		milEarning.click();
		letsWait();
	}
	
	public void searchAll()
	{
		searchAll.click();
		letsWait();
	}
	
		public void goHome()
	{
		goHome.click();
		letsWait();
	}
		public void generalClick()
		{
			generalClick.click();
			letsWait();
		}
		
		public void selectTripLength(String a)
		{
			Select oSelect = new Select(selectTripLength);
			oSelect.selectByVisibleText(a);
			letsWait();
		}
		
	
	
	public void letsWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	

}

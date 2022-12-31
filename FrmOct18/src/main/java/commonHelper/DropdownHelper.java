package commonHelper;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {

	private WebDriver driver;
	
	public DropdownHelper(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectUsingValue(WebElement element ,String value) {
		Select select= new Select(element);
		select.selectByValue(value);
	}
	
	public void selectUsingId(WebElement element ,int index) {
		Select select= new Select(element);
		select.selectByIndex(index);
	}
	
	public void deselectUsingValue(WebElement element ,String value) {
		Select select= new Select(element);
		select.selectByValue(value);
	}
	
	public void deselectUsingId(WebElement element ,int index) {
		Select select= new Select(element);
		select.selectByIndex(index);
	}
	
	public List<String> getAllDropdownData(WebElement element) {
		Select sel= new Select(element);
		List<WebElement> elements=sel.getOptions();
		List<String> valueList=new LinkedList<String>();
		for(WebElement ele:elements) {
			valueList.add(ele.getText());
		}
		return valueList;
	}
	
	
}

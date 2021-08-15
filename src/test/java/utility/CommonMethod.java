package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinition.BaseClass;

public class CommonMethod extends BaseClass {
	
	public void dropdownSelect(WebElement dropdown,WebElement dropdownValue,String selectText){
		
		dropdown.click();
		List<WebElement> dropdownAllValue=driver.findElements(By.xpath("//div[contains(@class,'dropdown second opened')]/ul/li"));
		for(WebElement value:dropdownAllValue){
			
			if(value.getText().equals(selectText)){
				
				value.click();
			}
		}
			
	}

}

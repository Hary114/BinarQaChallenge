import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.MobileElement

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

driver = MobileDriverFactory.getDriver()

String productName = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_order']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_name']"
String productPrice = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_order']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_price']"
String orderStatus = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_order']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_status']"
//String productImage = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_order']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_image']"

//List<MobileElement> productImages = driver.findElements(By.xpath(productImage))
List<MobileElement> productNames = driver.findElements(By.xpath(productName))
List<MobileElement> productPrices = driver.findElements(By.xpath(productPrice))
List<MobileElement> productStatuss = driver.findElements(By.xpath(orderStatus))


List<Integer> getSize = new ArrayList<>()

getSize.add(productPrices.size())
getSize.add(productStatuss.size())
//getSize.add(productImages.size())

if(productNames.size() > 0) {
	getSize.add(productNames.size())
	
	getMinSize = Collections.min(getSize)
	
	for(int i = 0; i < getMinSize; i++) {
		productStatuss.get(i).displayed
		Mobile.comment("Order List: \n"
			+ "Product Name :" + productNames.get(i).getText() + "\n"
			+ "Product Price :" + productPrices.get(i).getText() + "\n"
			+ "Status Order :" + productStatuss.get(i).getText())
	}
}

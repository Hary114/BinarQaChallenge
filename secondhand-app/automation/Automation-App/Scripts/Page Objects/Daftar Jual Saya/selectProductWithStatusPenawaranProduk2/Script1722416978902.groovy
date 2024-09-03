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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import java.util.List;

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver() //instantiate the driver

// Locate the product names and "Add to Cart" buttons
List<MobileElement> productNames = driver.findElementsById("id.binar.fp.secondhand:id/tv_product_name")

// Log the expected product name for debugging
Mobile.comment("Expected Product Name: " + expectedName)
Mobile.comment(productNames.size().toString())

for (int i = 0; i < productNames.size(); i++) {
	// Log the index and current product and button text for debugging
	Mobile.comment("Index: " + i)
	Mobile.comment("Product Name: " + productNames.get(i).getText())
	
	// Check if the current product matches the expected name
	if (productNames.get(i).getText().equals(expectedName)) {
		// Click the "Add to Cart" button for the matched product
		productNames.get(i).click()
		break
	}
}
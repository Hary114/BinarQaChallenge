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

import org.openqa.selenium.Keys as Keys

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver() //instantiate the driver

// Locate the product names and "Add to Cart" buttons
List<MobileElement> categoryButton = driver.findElementsById("id.binar.fp.secondhand:id/tv_category")

// Log the expected product name for debugging
Mobile.comment("Expected Category : " + expectedCategory)
Mobile.comment(categoryButton.size().toString())

for (int i = 0; i < categoryButton.size(); i++) {
    // Log the index and current product and button text for debugging
    Mobile.comment("Index: " + i)
    Mobile.comment("Category: " + categoryButton.get(i).getText())
    
    // Check if the current product matches the expected name
    if (categoryButton.get(i).getText().equals(expectedCategory)) {
        // Click the "Add to Cart" button for the matched product
        categoryButton.get(i).click()
        break
    }
}


package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.By


class ListAction2 {
	@Keyword
	void listToClickText(TestObject testObject, String textToClick) {
		WebUI.waitForElementVisible(testObject, 10)  // Wait for the element to be visible
		List<WebElement> testObjects = WebUiCommonHelper.findWebElements(testObject, 10)
		boolean found = false

		while (!found) {
			for (WebElement tO : testObjects) {
				WebUI.comment(tO.getText())

				if (tO.getText().contains(textToClick)) {
					// Scroll to the element if it is not clickable yet
					WebUI.executeJavaScript('arguments[0].scrollIntoView({behavior: "smooth", block: "center"});', Arrays.asList(tO))

					// Wait for the element to be clickable
					WebUI.waitForElementClickable(testObject, 10)

					try {
						// Attempt to click the element
						tO.click()
						found = true
						break
					} catch (Exception e) {
						// If click fails due to element not being clickable, scroll further
						WebUI.executeJavaScript('window.scrollBy(0, 400)', null)
						// Refresh the list of elements after scrolling
						testObjects = WebUiCommonHelper.findWebElements(testObject, 10)
					}
				}
			}

			// Break the loop if no element is found in the current view
			if (testObjects.isEmpty()) {
				WebUI.comment('No more elements found to click.')
				break
			}
		}
	}
}
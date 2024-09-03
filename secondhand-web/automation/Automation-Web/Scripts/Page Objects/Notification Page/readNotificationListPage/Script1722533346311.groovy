import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.WebElement
import java.util.ArrayList
import java.util.Collections

// Define TestObjects for the elements inside the parent container
TestObject notificationBodyObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[@class='p-5 notification-list']//div[contains(@class, 'notification-body fs-5')]")
TestObject notificationSubjectObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[@class='p-5 notification-list']//div[contains(@class, 'notification-subject fs-6 text-black-50')]")
TestObject notificationTimeStampObject = new TestObject().addProperty("xpath", ConditionType.EQUALS, "//*[@class='p-5 notification-list']//div[contains(@class, 'notification-timestamp fs-6 text-black-50')]")

// Find the elements
List<WebElement> notificationBodies = WebUiCommonHelper.findWebElements(notificationBodyObject, 10)
List<WebElement> notificationSubjects = WebUiCommonHelper.findWebElements(notificationSubjectObject, 10)
List<WebElement> notificationTimeStamps = WebUiCommonHelper.findWebElements(notificationTimeStampObject, 10)

// Get the sizes of the lists
List<Integer> getSize = new ArrayList<>()
getSize.add(notificationBodies.size())
getSize.add(notificationTimeStamps.size())

if (notificationSubjects.size() > 0) {
	getSize.add(notificationSubjects.size())
	
	// Find the minimum size among the lists
	int getMinSize = Collections.min(getSize)
	
	// Log the notification details
	for (int i = 0; i < getMinSize; i++) {
		boolean isBodyDisplayed = notificationBodies.get(i).isDisplayed()
		KeywordUtil.logInfo("Notification\n"
			+ "Notification Subject: " + notificationSubjects.get(i).getText() + "\n"
			+ "Notification Time Stamp: " + notificationTimeStamps.get(i).getText() + "\n"
			+ "Notification Body: " + notificationBodies.get(i).getText() + "\n"
			+ "Body Displayed: " + isBodyDisplayed)
	}
}


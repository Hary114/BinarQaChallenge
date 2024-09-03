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

driver = MobileDriverFactory.getDriver()

// Wait for the options to be visible
Thread.sleep(1000); // Adjust this wait time as needed or use explicit wait

// Locate the list of category options
List<MobileElement> productStatus = driver.findElements(By.xpath("//*[@resource-id ='id.binar.fp.secondhand:id/tv_product_status']//*[@text = 'Penawaran produk']")); // Assuming each option has the same

// Iterate through the options and select product with status "Penawaran Produk"
	for (MobileElement option : productStatus) {
		if (option.getText().equals(productStatusPenawaranProduk)) {
			option.click();
			break;
			}
		}
	

//List<MobileElement> selectKategori = driver.findElementsById("id.binar.fp.secondhand:id/text_input_end_icon")
//KeywordUtil.logInfo("Number of elements found: " + selectKategori.size());
//
//if(selectKategori.size() > 0) {
//	for (int i = 0; i < selectKategori.size(); i++) {
//	if (selectKategori.get(i).getText().equals(kategoriName)) {
//			selectKategori.get(i).click()
//			break
//		}
//		
//	}
//}
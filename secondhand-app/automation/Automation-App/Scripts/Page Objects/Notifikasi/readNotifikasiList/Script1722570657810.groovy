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

String subjectStatus = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_notification']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_status']" 
String namaProduk = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_notification']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_name']"
String hargaProduk = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_notification']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_price']"
String hargaTawar = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_notification']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_bid']"
String timeStamp = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_notification']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_time']"

//String productImage = "//*[@resource-id = 'id.binar.fp.secondhand:id/rv_order']//*[@resource-id = 'id.binar.fp.secondhand:id/tv_product_image']"

//List<MobileElement> productImages = driver.findElements(By.xpath(productImage))
List<MobileElement> namaProduks = driver.findElements(By.xpath(namaProduk))
List<MobileElement> hargaProduks = driver.findElements(By.xpath(hargaProduk))
List<MobileElement> hargaTawars = driver.findElements(By.xpath(hargaTawar))
List<MobileElement> subjectStatuss = driver.findElements(By.xpath(subjectStatus))
List<MobileElement> timeStamps = driver.findElements(By.xpath(timeStamp))

List<Integer> getSize = new ArrayList<>()

getSize.add(namaProduks.size())
getSize.add(hargaProduks.size())
getSize.add(hargaTawars.size())
getSize.add(subjectStatuss.size())
getSize.add(timeStamps.size())


//getSize.add(productImages.size())

if(namaProduks.size() > 0) {
	getSize.add(namaProduks.size())
	
	getMinSize = Collections.min(getSize)
	
	for(int i = 0; i < getMinSize; i++) {
		subjectStatuss.get(i).displayed
		Mobile.comment("Notifikasi List: \n"
			+ "Status :" + subjectStatuss.get(i).getText() + "\n"
			+ "Nama Produk :" + namaProduks.get(i).getText() + "\n"
			+ "Harga Produk :" + hargaProduks.get(i).getText() + "\n"
			+ "Harga Tawar :" + hargaTawars.get(i).getText() + "\n"
			+ "Time Stamp :" + timeStamps.get(i).getText())
			
	}
}

package stepDef
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class BerhasilBatalkanOfferStep {
	@When("User press on Status button")
	public void userPressOnStatusButton() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/tapBtnStatus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User see {string} popup status modal")
	public void userSeePopupStatusModal(String statusModalTitle) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/ModalPerbaruiStatusPenjualan/verifyModalPerbaruiStatusTitle'),
				[('expectedModalTitle') : statusModalTitle], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select Berhasil terjual option")
	public void userSelectBerhasilTerjualOption() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/ModalPerbaruiStatusPenjualan/tapBtnRadioBerhasilTerjual'), [:],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("User select Batalkan transaksi option")
	public void userSelectBatalkanTransaksiOption() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/ModalPerbaruiStatusPenjualan/tapBtnRadioBatalkanTransaksi'),
				[:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("The product status label change into {string} Berhasil terjual")
	public void theProductStatusLabelChangeIntoBerhasilTerjual(String statusBerhasilTerjual) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtBerhasilTerjualStatus'), [('expectedBerhasilTerjual') : statusBerhasilTerjual],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("The product status label change into {string} Penawaran ditolak")
	public void theProductStatusLabelChangeIntoBerhasilTerjualPenawaranDitolak(String statusPenawaranDitolak) {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/verifyTxtPenawaranDitolakStatus'), [('expectedPenawaranDitolakStatus') : statusPenawaranDitolak], 
    FailureHandling.STOP_ON_FAILURE)
	}

	@When("User press on Simpan button for confirmation")
	public void userPressOnSimpanButtonForConfirmation() {
		Mobile.callTestCase(findTestCase('Page Objects/Info Penawar/ModalPerbaruiStatusPenjualan/tapBtnSimpan'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
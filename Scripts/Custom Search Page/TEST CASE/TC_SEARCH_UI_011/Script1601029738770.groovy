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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Custom Search Page/UTILITIES/OPEN BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Search Objects/Page_diagnostics/input_Molecular diagnostic_btn-find'), 0)

WebUI.verifyElementClickable(findTestObject('Search Objects/Page_diagnostics/input_Molecular diagnostic_btn-find'))

WebUI.click(findTestObject('Search Objects/Page_diagnostics/input_Molecular diagnostic_btn-find'))

WebUI.waitForElementVisible(findTestObject('Search Objects/Page_diagnostics/div_Filter_tag'), 0)

WebUI.callTestCase(findTestCase('Custom Search Page/UTILITIES/CLOSE BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)


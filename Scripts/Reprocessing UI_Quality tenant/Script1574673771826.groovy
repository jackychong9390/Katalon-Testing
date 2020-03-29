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
import org.openqa.selenium.Keys as Keys
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.core.logging.KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('https://my300567.s4hana.ondemand.com/ui#Shell-home')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('OR_LoginPage/input_E-Mail ID or Login Name_j_username'), 5)

WebUI.setText(findTestObject('OR_LoginPage/input_E-Mail ID or Login Name_j_username'), 'C5129733')

WebUI.verifyElementPresent(findTestObject('OR_LoginPage/input_Password_j_password'), 5)

WebUI.setEncryptedText(findTestObject('OR_LoginPage/input_Password_j_password'), 'L8vIDF3wRknc7UCCZmhhew==')

WebUI.delay(20)

WebUI.click(findTestObject('OR_LoginPage/button_Log On'))

WebUI.delay(20)

// WebUI.acceptAlert()

KeywordLogger log = new KeywordLogger()
log.logInfo("login successfull")

WebUI.delay(120)

WebUI.mouseOver(findTestObject('Object Repository/Reprocessing UI/Page_Home/span_'))

WebUI.click(findTestObject('Object Repository/Reprocessing UI/Page_Home/span_'))

WebUI.sendKeys(findTestObject('Reprocessing UI/Page_Home/input_All_search'), 'Centralized Log Application')

WebUI.sendKeys(findTestObject('Reprocessing UI/Page_Home/input_All_search'), Keys.chord('', Keys.ENTER))

WebUI.delay(90)

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Reprocessing UI/Page_Application Log/File Upload tab/Page_Application Log/Page_Application Log/span__sapUiIcon sapTntNavLIGroupIcon sapUiIconMirrorInRTL'))

yesterday = new Date().minus(10).format('dd MMM YYYY')

today = new Date().format('dd MMM YYYY')

WebUI.sendKeys(findTestObject('Object Repository/Reprocessing UI/Page_Application Log/File Upload tab/Page_Application Log/Input Date'), 
    (yesterday + ' - ') + today)

WebUI.click(findTestObject('Reprocessing UI/Page_Application Log/File Upload tab/Page_Application Log/Search'))

WebUI.click(findTestObject('Reprocessing UI/Page_Application Log/File Upload tab/FileUpload tab_after fileter date/clickIfHasFile'))

if (WebUI.verifyElementClickable(findTestObject('Object Repository/Reprocessing UI/Page_Application Log/File Upload tab/FileUpload tab_after fileter date/clickIfHasFile'), 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Reprocessing UI/Page_Application Log/File Upload tab/FileUpload tab_after fileter date/clickIfHasFile'))

    WebUI.closeBrowser()
} else {
    WebUI.closeBrowser()
}


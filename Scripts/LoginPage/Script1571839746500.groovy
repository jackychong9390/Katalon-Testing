import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://my300567.s4hana.ondemand.com/ui#Shell-home')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('OR_LoginPage/input_E-Mail ID or Login Name_j_username'),	5)

WebUI.setText(findTestObject('OR_LoginPage/input_E-Mail ID or Login Name_j_username'), 'C5129733')

WebUI.verifyElementPresent(findTestObject('OR_LoginPage/input_Password_j_password'), 5)

WebUI.setEncryptedText(findTestObject('OR_LoginPage/input_Password_j_password'), 'L8vIDF3wRkmq1QXPaBKv2Q==')

WebUI.delay(5)

WebUI.click(findTestObject('OR_LoginPage/button_Log On'))


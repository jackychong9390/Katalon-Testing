import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Test Cases/HomePageApps_CommonPage'), null)
WebUI.delay(5)

//WebUI.click(findTestObject('null'))
//WebUI.delay(5)

WebUI.click(findTestObject('null'))
WebUI.delay(5)

WebUI.click(findTestObject('null'))
WebUI.delay(20)

WebUI.click(findTestObject('null'))
WebUI.delay(15)

WebUI.click(findTestObject('null'))
WebUI.delay(5)

WebUI.setText(findTestObject('null'), 
    '18486')
WebUI.delay(2)

WebUI.sendKeys(findTestObject('null'), 
    Keys.chord(Keys.ENTER))
WebUI.delay(45)

WebUI.click(findTestObject('null'))
WebUI.delay(45)

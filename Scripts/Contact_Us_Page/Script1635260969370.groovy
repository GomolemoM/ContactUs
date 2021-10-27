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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement


WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sovtech.co.za/contact-us/')

WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/Page_ContactUS/a_hellosovtech.com_meanmenu-reveal'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_ContactUS/i_Staff Augmentation_fa fa-angle-down'),10)
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))

ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_ContactUS/i_Staff Augmentation_fa fa-angle-up'),10)
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(ele))

WebUI.click(findTestObject('Object Repository/Page_ContactUS/i_Capabilities_fa fa-angle-down'))
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/Page_ContactUS/i_Capabilities_fa fa-angle-up'))

WebUI.delay(10)
ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_ContactUS/span_Blog'),10)
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(ele))

WebUI.click(findTestObject('Object Repository/Page_ContactUS/div_What We DoSoftware DevelopmentMobile De_afe0b4'))
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/Page_ContactUS/span'))
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/Page_ContactUS/i_Partners_fa fa-angle-down'))
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/Page_ContactUS/i_Partners_fa fa-angle-up'))
WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/Page_ContactUS/a_Contact Us'))

WebUI.setText(findTestObject('Object Repository/Page_ContactUS/input__your_name'), 'Gomolemo')

WebUI.setText(findTestObject('Object Repository/Page_ContactUS/input__email'), 'gmolotsane@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ContactUS/input__mobilephone'), '+27836670527')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ContactUS/select_Please Select1-55-2525-5050-100100-5_e31775'),  '100-500', true)

WebUI.setText(findTestObject('Object Repository/Page_ContactUS/textarea_How can we help you_message'), 
'Hi, can you kindly contact me regarding your website qoutes. Thank in advance.')

WebUI.click(findTestObject('Object Repository/Page_ContactUS/input_How can we help you_LEGAL_CONSENT.sub_9d5c24'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_ContactUS/Submit_form'))



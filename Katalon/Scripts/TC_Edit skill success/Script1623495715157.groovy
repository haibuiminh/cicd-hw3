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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
WebUI.callTestCase(findTestCase('TC_Login success'), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_React App/div_Skills Management'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_List Skills'))

DriverFactory.getWebDriver().findElement(By.xpath("//tbody[@class='ant-table-tbody']/tr[1]/td[2]/span/i[@title='edit skill']")).click();

TestObject inputSkill = new TestObject().addProperty("xpath", ConditionType.EQUALS,"//input[@placeholder='Skill']");

WebUI.setText(inputSkill, 'Lập trình web nâng cao');

DriverFactory.getWebDriver().findElement(By.xpath("//div[@class='ant-modal-footer']/button[2]")).click()

WebUI.verifyElementText(findTestObject('Object Repository/Page_React App/strong_LP TRNH WEB NNG CAO'), 'LẬP TRÌNH WEB NÂNG CAO', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser();
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

WebUI.click(findTestObject('Object Repository/Page_React App/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input__ant-input'), 'Express JS')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Save'))

List<WebElement> itemPagination = DriverFactory.getWebDriver().findElements(By.xpath("//ul[contains(@class,'ant-table-pagination mini')]/li"))

int lastMember = itemPagination.size() - 1;

String xpath = "//ul[contains(@class,'ant-table-pagination mini')]/li["+lastMember+"]";

DriverFactory.getWebDriver().findElement(By.xpath(xpath)).click();

List<WebElement> itemTr = DriverFactory.getWebDriver().findElements(By.xpath("//tr[contains(@class,'ant-table-row')]"))

int lastTrSize = itemTr.size();

String lastTrXpath = "(//tr[contains(@class,'ant-table-row')])["+lastTrSize+"]/td[1]/span/strong"

TestObject lastTr = new TestObject().addProperty("xpath", ConditionType.EQUALS,lastTrXpath);

WebUI.verifyElementText(lastTr, 'EXPRESS JS', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser();
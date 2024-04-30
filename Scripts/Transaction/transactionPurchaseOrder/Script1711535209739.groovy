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

/*Windows.startApplicationWithTitle('C:\\Users\\0763\\AppData\\Local\\Apps\\2.0\\ZTGJB69O.6D0\\0619G7T3.CD2\\erpdh18_10143d40e66e15a7_0003.0003_cf2d45f845234fbe\\MgxpaRIA.exe', 
    'ERP Iglo')*/
Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Button'))

Windows.delay(3)

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/TreeItem'))

Windows.delay(1)

Windows.click(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Button(1)'))

/*Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit'), 'PEG101')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit'), Keys.chord(Keys.TAB))*/
Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(1)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/PanelPopupForm'), Keys.chord(Keys.DOWN, Keys.ENTER))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox'), Keys.chord(Keys.ALT, Keys.DOWN))

Windows.delay(0)

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox'), Keys.chord(Keys.DOWN, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(1)'), Keys.chord(Keys.ALT, Keys.ARROW_DOWN))

Windows.delay(0)

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(1)'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(1)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(3)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(4)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/PanelPopupForm'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(2)'), Keys.chord(Keys.ALT, Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(2)'), Keys.chord(Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(2)'), Keys.chord(Keys.TAB, Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(6)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/PanelPopupForm'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), '28032024')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), '28032024')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), '28032024')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(3)'), Keys.chord(Keys.ALT, Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(3)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), 'JNE')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(5)'), Keys.chord(Keys.TAB, Keys.TAB, 
        Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(7)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(8)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/PanelPopupForm'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(7)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(9)'), '15')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(10)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(11)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(12)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Pane(3)'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(13)'), '2')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(13)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(14)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(15)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/PanelPopupForm'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(14)'), 'Ini Komentar')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(14)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(16)'), '9000')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(16)'), Keys.chord(Keys.TAB))

Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(16)'), '10')

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(16)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(4)'), Keys.chord(Keys.ALT, Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(4)'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrder/ComboBox(4)'), Keys.chord(Keys.TAB, Keys.TAB))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(17)'), Keys.chord(Keys.F5))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(18)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/PanelPopupForm'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

Windows.sendKeys(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(17)'), Keys.chord(Keys.TAB))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/PanelTable'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_UP))

Windows.click(findWindowsObject('menuTransactionPurchaseOrderNew/ComboNarahubung'), FailureHandling.STOP_ON_FAILURE)

Windows.setText(findWindowsObject('menuTransactionPurchaseOrderNew/ComboNarahubung'), '-')

Windows.click(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), FailureHandling.STOP_ON_FAILURE)

Windows.setText(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), '4')

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), Keys.chord(Keys.TAB))

/*Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboNarahubung'), Keys.chord(Keys.ALT, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboNarahubung'), Keys.chord(Keys.DOWN, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), Keys.chord(Keys.ALT, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), Keys.chord(Keys.DOWN, Keys.DOWN))

Windows.sendKeys(findWindowsObject('menuTransactionPurchaseOrderNew/ComboCashBasis'), Keys.chord(Keys.TAB))*/
Windows.setText(findWindowsObject('Object Repository/menuTransactionPurchaseOrderNew/Edit(19)'), 'Ini Juga Komentar')

Windows.click(findWindowsObject('menuTransactionPurchaseOrderNew/btnSave'))

Windows.click(findWindowsObject('menuTransactionPurchaseOrderNew/btnYesSave'))

Windows.click(findWindowsObject('menuTransactionPurchaseOrderNew/Button(4)'))

Windows.delay(5)


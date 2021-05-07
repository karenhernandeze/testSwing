package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSwingApplicationTests {
	
	TestSwingApplication application = new TestSwingApplication();
	
	@Test
	void givenTwoIntegers_WhenSum_ThenCorrectResult() {
		// Given 5 and 7
		application.numberOneTextField.setText("5");
		application.numberTwoTextField.setText("7");
		String expectedResult = "12";
		
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is 12
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenTwoInvalidInputs_WhenSum_ThenClearInput() {
		
		// Given invalid inputs
		application.numberOneTextField.setText("kar");
		application.numberTwoTextField.setText("en");
		String expectedResultOneTextField = "";
		String expectedResultTwoTextField = "";
		String expectedResult = "";
		
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is ""
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
		
		String actualResultOneTextField = application.numberOneTextField.getText();
		assertEquals(expectedResultOneTextField, actualResultOneTextField);
		
		String actualResultTwoTextField = application.numberTwoTextField.getText();
		assertEquals(expectedResultTwoTextField, actualResultTwoTextField);
	}
	
	@Test
	void givenOneInvalidInputLeft_WhenSum_ThenClearInput() {
		
		// Given invalid input kar and 5
		application.numberOneTextField.setText("kar");
		application.numberTwoTextField.setText("5");
		String expectedResultOneTextField = "";
		String expectedResultTwoTextField = "5";
		String expectedResult = "";
		
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is ""
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
		
		String actualResultOneTextField = application.numberOneTextField.getText();
		assertEquals(expectedResultOneTextField, actualResultOneTextField);
		
		String actualResultTwoTextField = application.numberTwoTextField.getText();
		assertEquals(expectedResultTwoTextField, actualResultTwoTextField);
	}

	@Test
	void givenOneInvalidInputRight_WhenSum_ThenClearInput() {
		
		// Given invalid input en and 5
		application.numberOneTextField.setText("5");
		application.numberTwoTextField.setText("en");
		String expectedResultOneTextField = "5";
		String expectedResultTwoTextField = "";
		String expectedResult = "";
		
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is ""
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
		
		String actualResultOneTextField = application.numberOneTextField.getText();
		assertEquals(expectedResultOneTextField, actualResultOneTextField);
		
		String actualResultTwoTextField = application.numberTwoTextField.getText();
		assertEquals(expectedResultTwoTextField, actualResultTwoTextField);
	}

}

package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.pages.CalculatorPage;

public class PertambahanSteps {

    @Steps
    CalculatorPage calculatorPage;

    protected static Integer firstNumber;
    protected static Integer secondNumber;
    protected static Integer result;

    @Given("user on calculator page")
    public void userOnCalculatorPage(){
        Assert.assertTrue(calculatorPage.isOnCalculatorPage());
    }

    @And("user tap {string}")
    public void userTap(String sign){
        calculatorPage.tapSign(sign);
    }

    @Then("user see the result of sum")
    public void userSeeTheResultOfSum() {
        result=firstNumber+secondNumber;
        Assert.assertEquals(result, calculatorPage.getValueOfResult(String.valueOf(result)));
        System.out.println(result);
    }

    @And("user choose first number {int}")
    public void userChooseFirstNumber(int number) {
        calculatorPage.tapNumber(number);
        firstNumber=number;
    }

    @And("And user choose second number {int}")
    public void andUserChooseSecondNumber(int number) {
        calculatorPage.tapNumber(number);
        secondNumber=number;
    }
}

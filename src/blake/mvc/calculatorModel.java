package blake.mvc;
/*******************************************************************
 *  calculatorModel class
 *  Description: The model component of a calculator program
 *  I used ideas and layout from:
 *  http://www.newthinktank.com/2013/02/mvc-java-tutorial/
 *******************************************************************/

// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists

public class calculatorModel {

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){
        return calculationValue;
    }

}

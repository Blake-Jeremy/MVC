package blake.mvc;
/*******************************************************************
 *  calculatorController class
 *  Description: The controller component of a calculator program
 *  I used ideas and layout from:
 *  http://www.newthinktank.com/2013/02/mvc-java-tutorial/
 *******************************************************************/

// The Controller coordinates interactions
// between the View and Model

// Swift specific code that must be commented out to switch the view
/*
// Imported Libraries
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 */

public class calculatorController {

    // Change the view reference here to calculatorView2
    private calculatorView2 myView;
    private calculatorModel myModel;

    // Change the view reference here to calculatorView2
    public calculatorController(calculatorView2 myView, calculatorModel myModel) {
        this.myView = myView;
        this.myModel = myModel;

        // Swift specific code that must be commented out to switch the view
        /*
        this.myView.addCalculateListener(new CalculateListener());

         */

        // Console specific code that must be commented out to switch the view
        int firstNumber, secondNumber = 0;
        try{
            firstNumber = myView.getFirstNumber();
            secondNumber = myView.getSecondNumber();
            myModel.addTwoNumbers(firstNumber, secondNumber);
            myView.setCalcSolution(myModel.getCalculationValue());
        } catch(NumberFormatException ex) {
            System.out.println(ex);
        }
    }

    /*
    // Swift specific code that must be commented out to switch the view
    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            try{
                firstNumber = myView.getFirstNumber();
                secondNumber = myView.getSecondNumber();
                myModel.addTwoNumbers(firstNumber, secondNumber);
                myView.setCalcSolution(myModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                myView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }

     */

}

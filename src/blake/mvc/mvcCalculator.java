package blake.mvc;
/*******************************************************************
 *  mvcCalculator with main class
 *  Description: The executable part of the calculator program
 *  I used ideas and layout from:
 *  http://www.newthinktank.com/2013/02/mvc-java-tutorial/
 *******************************************************************/

public class mvcCalculator {
    public static void main(String[] args) {

        // Change the view reference here to calculatorView2
        calculatorView2 myView = new calculatorView2();

        calculatorModel myModel = new calculatorModel();

        calculatorController myController = new calculatorController(myView,myModel);

        /*
        // Swift specific code that must be commented out to switch the view
        myView.setVisible(true);
         */

    }

}

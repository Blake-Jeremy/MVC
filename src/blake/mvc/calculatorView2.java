package blake.mvc;
/*******************************************************************
 *  calculatorView2 class
 *  Description: The 2nd view component of a calculator program that
 *  uses the console to display a calculator prompt
 *  I used ideas and layout from:
 *  http://www.newthinktank.com/2013/02/mvc-java-tutorial/
 *******************************************************************/

// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it.

// Imported Libraries
import java.util.InputMismatchException;
import java.util.Scanner;

public class calculatorView2 {

    private int firstNumber;
    private int secondNumber;
    private int calcSolution;

    calculatorView2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator");
        try {
            System.out.println("Please enter the two numbers you want to add:");
            System.out.print("Enter the first number: ");
            int xx = input.nextInt();
            System.out.print("Enter the second number: ");
            int yy = input.nextInt();
            // set the values
            setFirstNumber(xx);
            setSecondNumber(yy);
            input.close();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Values must be Integers!");
            System.exit(1);
        }
    }

    public int getFirstNumber(){
        return firstNumber;
    }

    public void setFirstNumber(int first){
        firstNumber = first;
    }

    public int getSecondNumber(){
        return secondNumber;
    }

    public void setSecondNumber(int second){
        secondNumber = second;
    }

    public void setCalcSolution(int solution){
        calcSolution = solution;
        System.out.println("Total is " + solution);
    }

}

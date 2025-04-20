package SimpleCalculator;

public class Calculator {

    // write code here
    private double firstNumber;
    private double secondNumber ;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(double firstNumber){
        return secondNumber;
    }
    public double getSubtractionResult() {
        return secondNumber - firstNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber != 0){
            return firstNumber / secondNumber;
        }
            return secondNumber;
    }

}


package be.intecbrussel;

public class Calculations {

    public String NegativeOrPositive(int inputNumber){
        if (inputNumber > 0){
            return "positive";
        } else if (inputNumber < 0){
            return "negative";
        } else return "zero";
    }


    public String OddOrEven(int inputNumber){
        if(inputNumber % 2 == 0){
            return "even";
        } else return "odd";
    }




}

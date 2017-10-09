package com.example;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result );

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result );

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result );

        result = result + 1;
        System.out.println("result = " + result );
        result++;
        System.out.println("result = " + result );
        result--;
        System.out.println("result = " + result );

        result += 2;
        System.out.println("result = " + result );
        result *= 10;
        System.out.println("result = " + result );
        result -= 10;
        System.out.println("result = " + result );
        result /= 10;
        System.out.println("result = " + result );

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 90;
        if (topScore >= 100)
            System.out.println("You've got the high score!");

        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and lesser than 100");

        if ((topScore > 90) || (secondTopScore <=80))
            System.out.println("One of this tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = true;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("was car is true");

        //exercise
        double firstNumber = 20;
        double secondNumber = 80;
        double sum = (firstNumber + secondNumber) * 25;
        sum = sum % 40;
        if (sum <= 20)
            System.out.println("Total was over the limit");
    }
}

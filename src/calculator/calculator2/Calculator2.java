package calculator.calculator2;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        CalculatorAssistant calculatorAssistant= new CalculatorAssistant();

        System.out.println("😀Hello, Calculator!😀");


        System.out.print("숫자를 입력하세요.    [종료:exit] :");
        Scanner scanner = new Scanner(System.in);

        double num1 = calculatorAssistant.checkInputNumber(scanner);
        loop:
        while (true) {
//            System.out.println();
            System.out.print("{ + , - , * , / }  [종료:exit] :");
            String operator = calculatorAssistant.checkInputOperator(scanner);
//            System.out.println();


            System.out.print("계산할 값을 넣으세요   [종료:exit] :");
            double num2 = calculatorAssistant.checkInputNumber(scanner);



            double result = calculatorAssistant.calculate(num1, operator, num2);
            num1 = result;

        }
    }
}



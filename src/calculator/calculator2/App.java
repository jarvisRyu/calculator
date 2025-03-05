package calculator.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculatorAssistant = new Calculator();

        System.out.println("😀Hello, Calculator!😀");

        while (true) {
            System.out.print("숫자를 입력하세요.      :");
            Scanner scanner = new Scanner(System.in);
            double num1 = calculatorAssistant.checkInputNumber(scanner);


            while (true) {
//            System.out.println();
                System.out.print("연산자를 입력하세요.    :");
                String operator = calculatorAssistant.checkInputOperator(scanner);
                if (!calculatorAssistant.inputKeyword(operator)){  //reset,ret 키워드확인
                    break ; //false면 탈출
                }


                System.out.print("계산할 값을 넣으세요.   :");
                double num2 = calculatorAssistant.checkInputNumber(scanner);
                num1 = calculatorAssistant.calculate(num1, operator, num2);
                calculatorAssistant.setResult(num1);


            }
        }
    }
}



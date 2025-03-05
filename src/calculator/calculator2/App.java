package calculator.calculator2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculatorAssistant = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("😀Hello, Calculator!😀");


        while(true) {
            System.out.print("숫자를 입력하세요.      :");
            double num1 = calculatorAssistant.getValidNumberInput(scanner); //입력값 확인

            while (true) {
                System.out.print("연산자를 입력하세요.    :");
                String operator = calculatorAssistant.getValidOperatorInput(scanner); //연산자 확인
                if (!calculatorAssistant.handleSpecialCommand(operator)) {  //reset,ret 키워드확인
                    break; // false 면 탈출
                }

                System.out.print("계산할 값을 넣으세요.   :");
                double num2 = calculatorAssistant.getValidNumberInput(scanner);
                num1 = calculatorAssistant.calculate(num1, operator, num2); //결과값 누적
                calculatorAssistant.storeResult(num1);//

            }
        }
    }
}



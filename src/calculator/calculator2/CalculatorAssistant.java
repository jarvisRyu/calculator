package calculator.calculator2;

import java.util.Scanner;

class CalculatorAssistant {
    public double checkInputNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNext("exit")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("올바른 숫자를 입력하세요:");
                scanner.next();
            }
        }
    }

    //메서드명 동사로 적기 , del 기능 만들기
    //문자열 아닐때
    public String checkInputOperator(Scanner scanner) { //
        while (true) {
            if (scanner.hasNext("exit")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            String var3 = scanner.next();
            if (("+".equals(var3) || "-".equals(var3) || "*".equals(var3) || "/".equals(var3))) {
                return var3;
            } else {
                System.out.print("올바른 연산자를 입력하세요:");
            }
        }
    }

    public double calculate(double var1, String var2, double var3) {

        double result = 0;
        while (true) {
            switch (var2) {
                case "+":
                    result = var1 + var3;
                    break;
                case "-":
                    result = var1 - var3;
                    break;
                case "*":
                    result = var1 * var3;
                    break;
                case "/":
                    if (var3 == 0) {
                        System.out.println("----------------------------------");
                        System.out.println("0으로 나눌수 없습니다.");
                        return var1/1;
                    } else {
                        result = var1 / var3;
                        break;
                    }
            }
            System.out.println("==============계산결과==============");
            System.out.printf("연산결과 = %s %s %s = %.2f%n", var1, var2,var3, result);
            System.out.println("===================================");
            return result;
        }
    }
}




package calculator.calculator1;

import java.util.Scanner;

public class CalculatorStage1 {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        loop1:
        while (true) {
            System.out.print("숫자를 입력하세요: //[종료:exit] ");
            Scanner scanner = new Scanner(System.in);
            String num1 = scanner.next();
            if ((num1).equals("exit")) {
                break;

            }
            double cal1 = Double.parseDouble(num1);
            loop2:
            while (true) {
                System.out.print("덧셈(+),뺄셈(-),곱셉(*),나눗셈(/) // [종료:exit] ");
                String operator = scanner.next();

                if (operator.equals("exit")) {
                    break loop1;
                }
                System.out.print("연산할 숫자를 입력하세요: //[종료:exit]");
                String num2 = scanner.next();

                if (num2.equals("exit")) {
                    break loop1;
                }

                double cal2 = Double.parseDouble(num2);

                switch (operator) {
                    case "+": {
                        System.out.println(cal1 + " + " + cal2 + " = " + (cal1 + cal2));
                        cal1 = cal1 + cal2;
                        break;
                    }
                    case "-": {
                        System.out.println(cal1 + " - " + cal2 + " = " + (cal1 - cal2));
                        cal1 = cal1 - cal2;
                        break;
                    }
                    case "*": {
                        System.out.println(cal1 + " * " + cal2 + " = " + (cal1 * cal2));
                        cal1 = cal1 * cal2;
                        break;
                    }
                    case "/": {
                        if (cal2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                        } else {
                            System.out.println(cal1 + " / " + cal2 + " = " + (cal1 / cal2));
                            cal1 = cal1 / cal2;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("계산을 종료합니다");
    }
}
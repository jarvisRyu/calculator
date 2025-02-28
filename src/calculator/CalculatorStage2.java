package calculator;

import java.util.Scanner;

public class CalculatorStage2 {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
//        loop1:
//        while (true) {
        System.out.print("숫자를 입력하세요: //[종료:exit] ");
        Scanner scanner = new Scanner(System.in);
        double num1 = CalAssistant.scanChecker(scanner);
        System.out.println(num1);

        System.out.print("더하기(+),빼기(-),곱하기(*),나누기(/) // [종료:exit] ");
        String operator = CalAssistant.Operator(scanner);
        System.out.println(operator);

        System.out.print("계산할 값을 넣으세요: //[종료:exit]");
        double num2 = CalAssistant.scanChecker(scanner);
        System.out.println(num2);

//            if ((num1).equals("exit")) {
//                break;
//
//            }
//            double cal1 = Double.parseDouble(num1);
//            loop2:
//            while (true) {
//                System.out.print("덧셈(+),뺄셈(-),곱셉(*),나눗셈(/) // [종료:exit] ");
//                String operator = scanner.next();
//
//                if (operator.equals("exit")) {
//                    break loop1;
//                }
//                System.out.print("연산할 숫자를 입력하세요: //[종료:exit]");
//                String num2 = scanner.next();
//
//                if (num2.equals("exit")) {
//                    break loop1;
//                }
//
//                double cal2 = Double.parseDouble(num2);
//
//                switch (operator) {
//                    case "+": {
//                        System.out.println(cal1 + " + " + cal2 + " = " + (cal1 + cal2));
//                        cal1 = cal1 + cal2;
//                        break;
//                    }
//                    case "-": {
//                        System.out.println(cal1 + " - " + cal2 + " = " + (cal1 - cal2));
//                        cal1 = cal1 - cal2;
//                        break;
//                    }
//                    case "*": {
//                        System.out.println(cal1 + " * " + cal2 + " = " + (cal1 * cal2));
//                        cal1 = cal1 * cal2;
//                        break;
//                    }
//                    case "/": {
//                        if (cal2 == 0) {
//                            System.out.println("0으로 나눌 수 없습니다.");
//                        } else {
//                            System.out.println(cal1 + " / " + cal2 + " = " + (cal1 / cal2));
//                            cal1 = cal1 / cal2;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("계산을 종료합니다");
    }
}

//숫자만 받기 ,exit
class CalAssistant {
    public static double scanChecker(Scanner scanner) {
        while (true) {
            if (scanner.hasNext("exit")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("잘못된 입력.숫자를 입력하세요:");
                scanner.next();
            }
        }
    }


    //문자열 아닐때
    public static String Operator(Scanner scanner) {
        while (true) {
            if (scanner.hasNext("exit")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            String var3 = scanner.next();
            if (("+".equals(var3) || "-".equals(var3) || "*".equals(var3) || "/".equals(var3))) {
                return var3;
            } else {
                System.out.print("잘못된 입력.연산자를 입력하세요:");
            }
        }
    }
}

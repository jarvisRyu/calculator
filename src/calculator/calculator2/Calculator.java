package calculator.calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Calculator {
    private final List<Double> calculationHistory = new ArrayList<>();

    //결과값 리스트 저장
    public void storeResult(double result) {
        calculationHistory.add(result);
        int maxSize = 10;    //저장리스트 값 10개
        if (calculationHistory.size() > maxSize) {
            calculationHistory.remove(0);  //저장갯수 초과시 0번째 기록삭제
        }
    }

    //결과리스트 출력
    void printCalculationHistory() {
        System.out.println("==============연산이력==============");
        for (int i = 0; i < calculationHistory.size(); i++) {
            System.out.println("연산이력 (" + i + ") :" + calculationHistory.get(i));
        }
        System.out.println("===================================");
    }

    //reset,ret 키워드 입력확인
    boolean handleSpecialCommand(String operator) {
        if (operator.equals("reset")) {
            calculationHistory.clear();
            System.out.println("========값이 초기화 되었습니다.========");
            return false;
        } else if (operator.equals("ret")) {
            printCalculationHistory();
            return false;
        }
        return true;
    }

    //숫자 입력확인
    public double getValidNumberInput(Scanner scanner) {

        while(true){
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

    //연산자 입력확인
    public String getValidOperatorInput(Scanner scanner) { //
        while (true) {
            if (scanner.hasNext("exit")) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }
            String input = scanner.next();
            if (("+".equals(input) || "-".equals(input) || "*".equals(input) || "/".equals(input))) {
                return input;
            } else if ("reset".equals(input) || "ret".equals(input)) {
                return input;
            } else {
                System.out.print("올바른 연산자를 입력하세요:");
            }
        }

    }

    //계산하기
    public double calculate(double var1, String operator, double var2) {

        double result = 0;

        switch (operator) {
            case "+":
                result = var1 + var2;
                break;
            case "-":
                result = var1 - var2;
                break;
            case "*":
                result = var1 * var2;
                break;
            case "/":
                if (var2 == 0) {
                    System.out.println("=================0으로 나눌수 없습니다.=================");
                    return var1;
                } else {
                    result = var1 / var2;
                    break;
                }
        }
        System.out.println("=====================계산결과=====================");
        System.out.printf("👉 %.2f  %s %.2f  = %.2f%n", var1, operator, var2, result);
        System.out.println("=================================================");
        System.out.println("[종료 : exit] // [초기화 : reset] // [결과보기 : ret]");
        System.out.println();
        return result;
    }
}





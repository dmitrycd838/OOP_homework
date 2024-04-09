package Task7.functions;

import java.util.Scanner;

import Task7.domen.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ComplexNumber num1 = new ComplexNumber(2.0, 5.0); 
        ComplexNumber num2 = new ComplexNumber(2.0, 10.0); 

        Calculator calculator = new Calculator(); 

        Logger.log("Выберите операцию:");
        Logger.log("1 - Сложение");
        Logger.log("2 - Вычитание");
        Logger.log("3 - Умножение");
        Logger.log("4 - Деление");

        int choice = input.nextInt(); 

        switch (choice) { 
            case 1 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.add(num2);
                }
            });
            case 2 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.subtract(num2);
                }
            });
            case 3 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.multiply(num2);
                }
            });
            case 4 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.divide(num2);
                }
            });
            default -> Logger.log("Неверный выбор операции.");
        }
        calculator.executeOperation(num1, num2);
        input.close();
    }
}

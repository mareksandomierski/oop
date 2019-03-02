package task2;

public class CalculatorApp {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(2,5);

        System.out.println(calculator.add(2,5));

        System.out.println("===========================");

        calculator.add(1);
        calculator.add(2);
        calculator.add(3);

        System.out.println("result = " + calculator.result);

        System.out.println("===========================");

        Calculator calculator2 = new Calculator();
        calculator2.add(8);
        calculator2.add(10);

        System.out.println("result = " + calculator2.getresult());

    }
}

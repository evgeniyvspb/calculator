package decorator.factory.calculator;

import decorator.factory.calculator.dec.CalculableVisLoggerFactory;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableVisLoggerFactory();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}

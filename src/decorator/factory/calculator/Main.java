package decorator.factory.calculator;

import decorator.factory.calculator.dec.CalculableVisLoggerFactory;
import decorator.factory.calculator.dec.iCalculatorView;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableVisLoggerFactory();
        iCalculatorView view = new iCalculatorView(calculableFactory);
        view.run();
    }
}

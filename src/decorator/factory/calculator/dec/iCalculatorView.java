package decorator.factory.calculator.dec;

import java.util.Scanner;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.ICalculableFactory;

public class iCalculatorView {
    private final ICalculableFactory icalculableFactory;

    public iCalculatorView(ICalculableFactory icalculableFactory) {
        this.icalculableFactory = icalculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            Calculable calculator = icalculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, *, /, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.division(arg);
                    continue;
                }

                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

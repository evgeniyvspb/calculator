package builder;

import builder.item.Characteristic;
import builder.item.impl.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(Characteristic.builder()
                .brand("Apple")
                .color("White").build());
        System.out.println(laptop.toString());
    }
}

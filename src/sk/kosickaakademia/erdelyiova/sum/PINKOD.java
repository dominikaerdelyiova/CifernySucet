package sk.kosickaakademia.erdelyiova.sum;

import java.util.Random;

public class PINKOD {
    public static void main(String[] args) {
        int random = new Random().nextInt(10_0000);
                String pin = String.format("%04d", random);
        System.out.println(pin);
    }
}

package sk.kosickaakademia.erdelyiova.sum;

import javax.swing.*;

public class CifernySucetPokusCislo3 {
    public static void main(String[] args) {
        int x = 94;
        int pd = 0; //pd-pocet delitelov
        int y = 1;

        while (y <= x) {

            if (x % y == 0) ;
            pd = pd + y;

            y = y + 1;
        }
        if (pd == 2)
        System.out.println("ANO");
        else
        System.out.println("NIE");
    }

}

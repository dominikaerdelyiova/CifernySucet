package sk.kosickaakademia.erdelyiova.sum;

import java.util.Scanner;

public class TestKeyboard {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int m=sc.nextInt();
        int x = 292;
        int r = 0; int i = 0;
        while (x>0){
            int z = x%2;
            r = (int) (z * Math.pow(10, i)+ r);
            i = i+1;
            x = x/2;


        }
        System.out.println("Nieco");




    }
}

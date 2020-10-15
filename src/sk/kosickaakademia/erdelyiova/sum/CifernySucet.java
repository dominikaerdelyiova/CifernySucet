package sk.kosickaakademia.erdelyiova.sum;

public class CifernySucet {
    public static void main(String[] args) {
        int cislo = 4378;
        int sucet = 0;

        while (sucet!=0){
            sucet=sucet+(cislo%10);
            cislo = cislo/10;


        }

        System.out.println("sucet");


    }
}

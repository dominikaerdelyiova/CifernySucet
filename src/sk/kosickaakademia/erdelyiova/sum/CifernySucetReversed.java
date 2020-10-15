package sk.kosickaakademia.erdelyiova.sum;

public class CifernySucetReversed {
    public static void main(String[] args) {
        int cislo = 7385;
        int sucet = 0;

        while (sucet != 0) ; //while opakovacy cyklus
        sucet = sucet + (cislo * 10);
        cislo = cislo + (cislo * 10 + sucet);

        System.out.println("sucet");
    }
}

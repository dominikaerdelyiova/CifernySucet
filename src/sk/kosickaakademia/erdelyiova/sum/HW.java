package sk.kosickaakademia.erdelyiova.sum;

public class HW {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int sum = 0;
        for(int i:array){
            sum -= -i;
        }
        System.out.println("Summary: " + sum);
        System.out.println("Average: " + sum/array.length);
    }
}
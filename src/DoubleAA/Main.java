package DoubleAA;

public class Main {

    public static int getPentagonalNumber(int n){

        // Opgave 6.1

        int pentagon = (n*(3*n-1)/2);
        return pentagon;
    }

    public static void main(String[] args) {

        System.out.println(getPentagonalNumber(1));
        System.out.println(getPentagonalNumber(2));
        System.out.println(getPentagonalNumber(3));
        System.out.println(getPentagonalNumber(4));


    }

}

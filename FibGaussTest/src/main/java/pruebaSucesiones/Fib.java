package pruebaSucesiones;

import java.util.ArrayList;


public class Fib {

    public static final int NUMVUELTAS = 10000;

    public Fib() {
    }



    public static int fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static long tiempoFibIt(int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            fibonacciIterativo(n);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static long tiempoFibRec(int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
            fibonacciRecursivo(n);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int fibConLista(int n) {
        ArrayList<Integer> listaFib = new <Integer> ArrayList<Integer>();
        listaFib.add(1);
        listaFib.add(1);
        listaFib.add(2);
        listaFib.add(3);
        listaFib.add(5);
        listaFib.add(8);
        listaFib.add(13);
        listaFib.add(21);
        listaFib.add(34);
        listaFib.add(55);
        listaFib.add(89);
        listaFib.add(144);
        listaFib.add(233);
        listaFib.add(377);
        listaFib.add(610);
        listaFib.add(987);
        listaFib.add(1597);
        listaFib.add(2584);
        listaFib.add(4181);
        listaFib.add(6765);
        listaFib.add(10946);
        listaFib.add(17711);
        listaFib.add(28657);
        listaFib.add(46368);
        listaFib.add(75025);
        listaFib.add(121393);
        listaFib.add(196418);
        listaFib.add(317811);
        listaFib.add(514229);
        listaFib.add(832040);
        int resultado;
        resultado = listaFib.get(n - 1);
        return resultado;
    }

    public static long tiempoFibLista(int n) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < NUMVUELTAS; i++) {
             fibConLista(n);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}

package pruebaSucesiones;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import org.junit.Test;


import java.util.ArrayList;


public class TestFib {
    private static ArrayList <Integer> listaFib = new <Integer> ArrayList();
    public TestFib() {
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
    }

    @Test
    public void fibIt1(){
        int resultadoCorrecto = listaFib.get(0);
        int resultadoCalculado = Fib.fibonacciIterativo(1);
        assertThat(resultadoCalculado, is (resultadoCorrecto));
    }

    @Test
    public void fibIt20(){
        int resultadoCorrecto = listaFib.get(19);
        int resultadoCalculado = Fib.fibonacciIterativo(20);
        assertThat(resultadoCalculado, is (resultadoCorrecto));
    }

    @Test
    public void fibItConBucle(){
        for(int i=0;i<20;i++){
            int resultadoCorrecto = listaFib.get(i);
            int resultadoCalculado = Fib.fibonacciIterativo(i+1);
            assertThat(resultadoCalculado,is(resultadoCorrecto));
        }
    }

    @Test
    public void fibRec1(){
        int resultadoCorrecto = listaFib.get(0);
        int resultadoCalculado = Fib.fibonacciRecursivo(1);
        assertThat(resultadoCalculado, is (resultadoCorrecto));
    }

    @Test
    public void fibRec20(){
        int resultadoCorrecto = listaFib.get(19);
        int resultadoCalculado = Fib.fibonacciRecursivo(20);
        assertThat(resultadoCalculado, is (resultadoCorrecto));
    }

    @Test
    public void fibRecConBucle(){
        for(int i=0;i<20;i++){
            int resultadoCorrecto = listaFib.get(i);
            int resultadoCalculado = Fib.fibonacciRecursivo(i+1);
            assertThat(resultadoCalculado,is(resultadoCorrecto));
        }
    }

    @Test
    public void fibConListaBucle(){
        for(int i=0;i<20;i++){
            int resultadoCorrecto = listaFib.get(i);
            int resultadoCalculado = Fib.fibConLista(i+1);
            assertThat(resultadoCalculado,is(resultadoCorrecto));
        }
    }

    @Test
    public void fibConLista1(){
        for(int i=0;i<20;i++){
            int resultadoCorrecto = listaFib.get(0);
            int resultadoCalculado = Fib.fibConLista(1);
            assertThat(resultadoCalculado,is(resultadoCorrecto));
        }
    }

    @Test
    public void fibConLista20(){
        for(int i=0;i<20;i++){
            int resultadoCorrecto = listaFib.get(19);
            int resultadoCalculado = Fib.fibConLista(20);
            assertThat(resultadoCalculado,is(resultadoCorrecto));
        }
    }
}

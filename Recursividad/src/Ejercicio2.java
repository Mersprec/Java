import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int base, exponente;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        base = teclado.nextInt();
        System.out.print("Introduzca el exponente: ");
        exponente = teclado.nextInt();
        System.out.print("El resultado de elevar " + base + " a " + exponente + " es " + calcularPotencia(base, exponente));
    }

    private static int calcularPotencia(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return calcularPotencia(base, exponente + 1 / base);
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }

    }
}

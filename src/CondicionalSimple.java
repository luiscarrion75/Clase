import java.util.Scanner;

public class CondicionalSimple {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar mayoria de edad");
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        boolean evaluacion = (edad >= 18);
        if (evaluacion)
            System.out.println("Eres mayor de edad");
        System.out.println("Estas casi listo para ir a la Universidad");
    }
}
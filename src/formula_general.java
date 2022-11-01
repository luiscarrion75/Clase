import java.util.Scanner;

public class formula_general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        double x0,x1;
        System.out.println("Valor a: ");
        a = sc.nextDouble();
        System.out.println("Valor b: ");
        b = sc.nextDouble();
        System.out.println("Valor c: ");
        c = sc.nextDouble();
        double numero = (b*b) - (4*a*c);
        if (numero >0) {
            x0 = (-b + Math.sqrt(numero)) / 2 * a;
            x1 = (-b - Math.sqrt(numero)) / 2 * a;
            System.out.println("La ecuacion tiene dos soluciones");
            System.out.println("x0: " + x0);
            System.out.println("x1: " + x1);
        } else
        if(numero == 0) {
            x0 = (-b) / 2 * a;
            System.out.println("La ecuacion tiene una solucion");
            System.out.println("x0: " + x0);
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}

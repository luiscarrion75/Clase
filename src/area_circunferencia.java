import java.util.Scanner;

public class area_circunferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double area, radio;
        System.out.println("Ingresar radio: ");
        radio = entrada.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es: " + area);
    }
}
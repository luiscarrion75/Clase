package condicional_tarea;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la tolerancia: ");
        double tol= teclado.nextDouble();
        if (tol<0.1){
            System.out.println("Exploracion espacial");
        }else if ((tol>= 0.1)&&(tol < 1)){
            System.out.println("Grado Militar");
        }else if ((tol >= 1) && (tol < 10)){
            System.out.println("Grado comercial");
        }else if (tol>=10) {
            System.out.println("Grado juguete");
        }
    }
}
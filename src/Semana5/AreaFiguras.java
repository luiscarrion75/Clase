package SegundoBimestre.Semana5;

import java.util.Scanner;

public class AreaFiguras {

    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA OBTENER EL AREA DE FIGURAS GEOMETRICAS");
        System.out.println("Ingrese 1 para calcular area circunferencia: ");
        System.out.println("Ingrese 2 para calcular area cuadrado: ");
        System.out.println("Ingrese 3 para calcular area cilindro: ");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        seleccionar_figura(opcion);
    }
public static void seleccionar_figura(int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor de radio: ");
                double radio = teclado.nextInt();
                double area =(radio);
                System.out.println("El area es: "+area);
                break;
            case 2:

        }
}
    /**
     * Metodo para obtener el area de una circunferencia
     * @param radio
     * @return
     */
    public double obtener_area_circunferencia(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * Metodo para obtener el area de un cuadrado
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado(double lado){
        double area = lado * lado;
        return area;
    }
    public void obtener_area_cilindro(){

    }
}

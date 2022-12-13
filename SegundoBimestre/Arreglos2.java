package SegundoBimestre;

public class Arreglos2 {
    public static void main(String[] args) {
        //creacion de arreglos, sin valores predefinidos
        String universidades [] = new String[5];
        System.out.println("Arreglo universidades: ");
        for (int indice = 0; indice < universidades.length; indice++) {
            System.out.print(universidades[indice] + "\t");
        }
        int notas [] = new int[4];
        System.out.println("Arreglo notas: ");
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.print(notas[indice] + "\t");
        }
        boolean valores [] = new boolean[10];
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.print(valores[indice] + "\t");
        }
        //creacion de un arreglo cuando en un inicio no conocemos su tamaño
        String nombres []; //declaracion de un arreglo llamado nombres
        nombres = new String[10];//creacion
    }
}

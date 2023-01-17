package SegundoBimestre.Semana5;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        //crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoValor llamada = new ClaseConMetodoSinRetornoValor();
        //llamada.saludar();
        saludar_con_nombre("Richar");
    }
    public static void saludar(){
        System.out.println("BIENVENIDO A LA CREACION DE METODOS");
        System.out.println("metodo creado en java");
    }
    public static void saludar(String nombre){
        System.out.println("BIENVENIDO A LA CREACION DE METODOS");
        System.out.println("metodo creado en java");
    }
    public static void saludar(String nombre, String apellido){
        System.out.println("BIENVENIDO A LA CREACION DE METODOS");
        System.out.println("metodo creado en java");
    }
    public static void saludar(String nombre, int edad){
        System.out.println("BIENVENIDO A LA CREACION DE METODOS");
        System.out.println("metodo creado en java");
    }
 public static void saludar_con_nombre(String nombre){
     System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CREACION DE METODOS");
     System.out.println("metodo creado en java");
 }
}
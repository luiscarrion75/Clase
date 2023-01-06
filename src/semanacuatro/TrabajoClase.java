package semanacuatro;

import java.util.Scanner;

/**
 * Programa para crear una matriz con valores recibidos desde el teclado y luego poder realizar operaciones de:
 *1. Busqueda
 *2. Modificacion
 *3. Eliminacion
 *4. Visualizacion
 *5. Salida
 */
public class TrabajoClase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int cols = teclado.nextInt();
        teclado.nextLine();
        String marcas [][] = new String[filas][cols]; //establecemos dimension de la matriz
        //llenado de la matriz: OPERACION ESCRITURA
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Ingrese valor para posicion ["+fila+"]["+col+"]");
                marcas[fila][col] = teclado.nextLine().toLowerCase();
            }
        }
        boolean salir = false;
        while(!salir){ //salir == false
            System.out.println("Digite 1 para realizar una busqueda: ");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar un valor: ");
            System.out.println("Digite 4 para visualizar la matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("HAS SELECCIONADO LA OPERACION BUSQUEDA");
                    System.out.println("¿Que marca busca: ?");
                    String marca_buscada = teclado.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if( marcas[fila][col].equals(marca_buscada)){
                                System.out.println("Si se encontro la marca: "+marca_buscada);
                                System.out.println("en la posicion: ["+fila+"]["+col+"]");
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (encontrado == false)
                        System.out.println("MARCA NO ENCONTRADA");
                    break;
                case 2:
                    System.out.println("HAS SELECCIONADO LA OPERACION DE MODIFICACION");
                    System.out.println("Ingrese que fila desea modificar: ");
                    int fila_cambio = teclado.nextInt();
                    System.out.println("Ingrese que columna desea modificar: ");
                    int col_cambio = teclado.nextInt();
                    System.out.println("Cual es la nueva marca a ingresar: ");
                    String nueva_marca = teclado.nextLine();
                    marcas[fila_cambio][col_cambio] = nueva_marca;
                    break;
                case 3:
                    System.out.println("HAS SELECCIONADO LA OPERACION DE ELIMINACION");
                    System.out.println("¿Que marca desea eliminar?: ");
                    String marca_a_eliminar = teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_a_eliminar)){
                                marcas[fila][col] = "";
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("HAS SELECCIONADO LA OPERACION LECTURA");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.println(marcas[fila][col] + "\t");
                        }
                        System.out.println("\t");
                    }
                    break;
                case 5:
                    System.out.println("HASTA PRONTO");
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        }
    }
}

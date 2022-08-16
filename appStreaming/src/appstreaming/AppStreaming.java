//App Streaming - Examen I Parcial 
//Programación II
//Carlos Edgardo Sagastume Chávez - 61721058

package appstreaming;
//

import java.util.Scanner;

public abstract class AppStreaming {

    String genero;
    int pelicula, serie, extra, capitulo;
    String nombreContenido;
    Scanner entrada = new Scanner(System.in);

    public void Seleccion() {

        int seleccion, comodin = 0;

        System.out.println("Que Genero Desea: ");
        genero = entrada.nextLine();

        do {
            do {
                System.out.println("Porfavor seleccione una opcion:");
                System.out.println("    1. Series");
                System.out.println("    2. Peliculas");
                System.out.println("    3. Extras");
                System.out.println("    4. Salir del Sistema.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    comodin = 1;
                } else {
                    System.out.println("------------------------------------------");
                    System.out.println("Opcion No Disponible, Vuelva a intentar");
                    System.out.println("------------------------------------------");
                }
            } while (comodin == 0);

            if (seleccion == 1) {

//                Operaciones mensajero = new consulta();
//                mensajero.Transaccion();
            } else if (seleccion == 2) {

//                Operaciones mensajero = new Retiro();
//                mensajero.Transaccion();
            } else if (seleccion == 3) {

//                Operaciones mensajero = new Deposito();
//                mensajero.Transaccion();
            } else if (seleccion == 4) {
                System.out.println("-------------------------------------------");
                System.out.println("Muchas Gracias por usar nuestros servicios");
                System.out.println("-------------------------------------------");
                comodin = 2;
            }

        } while (comodin != 2);

    }

    public void Series() {
        //serie = entrada.nextInt();
    }

    public void Pelicula() {
        //pelicula = entrada.nextInt();

    }

    public void Extra() {
        //extra = entrada.nextInt();

    }

    public abstract void Selecionado();

    public int getCapitulo() {
        return capitulo;
    }
    public void setCapitulo(int capitulo2) {
    this.capitulo = capitulo2;
    
    }}

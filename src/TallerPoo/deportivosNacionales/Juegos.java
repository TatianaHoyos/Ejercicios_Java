package TallerPoo.deportivosNacionales;

import java.util.ArrayList;
import java.util.Scanner;

public class Juegos {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Natacion>registroNata=new ArrayList<>();
    static ArrayList<Baloncesto>registroBalon=new ArrayList<>();
    static ArrayList<Equitacion>registroEquita=new ArrayList<>();

    public static int menuJuegos() {
        int opc;
        System.out.println("""
                1. Registrar la información de un equipo deportivo determinado
                2. Listar la información registrada de un equipo deportivo determinado
                3. Modificar la información de un equipo deportivo determinado
                4. Eliminar la información de un equipo deporte determinado
                5. Cantidad Natación: Permite conocer la cantidad de equipos deportivos por cada categoría.
                6. Baloncesto puntuación: Permite conocer el equipo con la mejor puntuación registrada.
                7. Equitación promedio: Permite conocer el promedio de velocidad entre los equipos registrados.
                               
                ingrese una opcion del menú:
                """);
        opc = input.nextInt();
        return opc;
    }

    public static void registrarEquipo() {
        System.out.println("ingrese que equipo desea registrar: 1.Natacion, 2.Baloncesto, 3.Equitacion: ");
        int registrar = input.nextInt();
        if (registrar == 1) {
            System.out.println("cuantos equipos de natacion desea registar: ");
            int natac = input.nextInt();
            for (int i = 0; i <= natac; i++) {
                System.out.println("ingrese los siguientes datos de equipo #" + (i + 1));
                System.out.println("numero de referencia del equipo de natacion");
                int referencia= input.nextInt();
                System.out.println("nombre del equipo:");
                String nombreDeporte= input.next();
                System.out.println("departamento");
                String departamento= input.next();
                System.out.println("numero de integrantes individual o por equipo:");
                int numeroIntegrantes = input.nextInt();
                System.out.println("tiempo estimado (minutos y segundos): ");
                double tiempoEstimado = input.nextDouble();
                System.out.println("categoria: 1.libre,2.espalda o 3.pecho.): ");
                int categoria = input.nextInt();
                Natacion nata= new Natacion(referencia,tiempoEstimado,categoria,numeroIntegrantes,
                        departamento,nombreDeporte);
                registroNata.add(nata);
                System.out.println("equipo registrado con exito");
            }
        } else if (registrar == 2) {
            System.out.println("cuantos equipos de Baloncesto desea registar: ");
            int balonc = input.nextInt();
            for (int i = 0; i <= balonc; i++) {
                System.out.println("ingrese los siguientes datos de equipo #" + (i + 1));
                System.out.println("numero de integrantes del equipo:");
                int nIntegrantes = input.nextInt();
                System.out.println("numero de referencia del equipo de baloncesto");
                int referencia= input.nextInt();
                System.out.println("puntuación: ");
                double puntuacion = input.nextDouble();
                System.out.println("nombre del equipo: ");
                String nombreDeporte= input.next();
                System.out.println("departamento");
                String departamento= input.next();
                Baloncesto balon=new Baloncesto(nIntegrantes,puntuacion,referencia,departamento,nombreDeporte);
                registroBalon.add(balon);
                System.out.println("equipo registrado con exito:");
            }
        } else if (registrar == 3) {
            System.out.println("cuantos equipos de Equitacion desea registar: ");
            int equita = input.nextInt();
            for (int i = 0; i <= equita; i++) {
                System.out.println("ingrese los siguientes datos de equipo #" + (i + 1));
                System.out.println("nombre  del equipo:");
                String nombreEquipo = input.next();
                System.out.println("nombre del deporte");
                String nombreDeporte=input.next();
                System.out.println("numero de referencia del equipo de baloncesto");
                int referencia= input.nextInt();
                System.out.println("departamento");
                String departamento= input.next();
                System.out.println("velocidad del equipo: ");
                float velocidad = input.nextFloat();
                System.out.println("categoria: 1.demostracion y 2.obstáculos");
                int categoria = input.nextInt();
                Equitacion equitacion=new Equitacion(nombreEquipo,velocidad,categoria,referencia,
                        departamento,nombreDeporte);
                registroEquita.add(equitacion);
                System.out.println("equipo registrado con exito:");
            }

        }
    }
    public static void listaE(){

    }
}

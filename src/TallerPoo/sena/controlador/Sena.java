package TallerPoo.sena.controlador;

import TallerPoo.sena.modelo.Aprendiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Sena {
    static Scanner input =new Scanner(System.in);

        static ArrayList<Aprendiz> registrarAprendiz = new ArrayList<>();
        public static int menuA () {
        int opcion;
        System.out.println("""
                1. Registrar un aprendiz
                2. Listar los aprendices registrados
                3. Buscar un aprendiz determinado (Búsquedas por la Identificación)
                4. Modificar el registro de un aprendiz
                5. Eliminar el registro de un aprendiz.
                6. Promedio de ICFES por Programa
                7. Número de aprendices por programa
                ingrese una opcion del menu.                
                """);
        opcion = input.nextInt();
        return opcion;
    }
        public static void registrarA () {
        System.out.println("Identificación");
        int identificacion = input.nextInt();
        System.out.println("Nombres ");
        String nombre = input.next();
        System.out.println("Apellidos");
        String apellido = input.next();
        System.out.println("Genero (Hombre o Mujer)");
        String genero = input.next();
        System.out.println("Puntaje ICFES");
        double puntaje = input.nextDouble();
        System.out.println("seleccione un Programa (1.Sistemas, 2.Contabilidad o 3.Deportes)");
        int programa = input.nextInt();

        Aprendiz aprendizS = new Aprendiz(identificacion, nombre, apellido, genero, programa, puntaje);
        System.out.println("Aprendiz registrado con exito");
        registrarAprendiz.add(aprendizS);
    }
        public static void listarA () {
        for (Aprendiz listAprendiz : registrarAprendiz) {
            System.out.println(listAprendiz.toString());
        }
    }
        public static void buscarA () {
        int buscar = 0;
        System.out.println("ingrese la id del aprendiz a consultar.");
        int consultar = input.nextInt();
        for (Aprendiz listAprendiz : registrarAprendiz) {
            if (listAprendiz.getIdentificacion() == consultar) {
                System.out.println("aprendiz encontrado " + listAprendiz.toString());
                buscar = 1;
                break;
            }
        }
        if (buscar == 0) {
            System.out.println("aprendiz " + consultar + "no encontrado.");
        }
    }
        public static void modificarA () {
        int buscar = 0;
        System.out.println("ingrese la id del aprendiz a modificar.");
        int consultar = input.nextInt();
        for (Aprendiz listAprendiz : registrarAprendiz) {
            if (listAprendiz.getIdentificacion() == consultar) {
                System.out.println("nueva Identificación");
                int identificacion = input.nextInt();
                System.out.println(" nuevos Nombres ");
                String nombre = input.next();
                System.out.println("nuevos Apellidos");
                String apellido = input.next();
                System.out.println("nuevo Genero (Hombre o Mujer)");
                String genero = input.next();
                System.out.println("nuevo Puntaje ICFES");
                double puntaje = input.nextDouble();
                System.out.println("nuevo Programa (1.Sistemas , 2.Contabilidad o 3.Deportes)");
                int programa = input.nextInt();

                listAprendiz.setIdentificacion(identificacion);
                listAprendiz.setNombre(nombre);
                listAprendiz.setApellido(apellido);
                listAprendiz.setGenero(genero);
                listAprendiz.setPuntajeIcfes(puntaje);
                listAprendiz.setPrograma(programa);

                System.out.println("aprendiz modificado con exito");
                buscar = 1;
            }

        }
        if (buscar == 0) {
            System.out.println("aprendiz " + consultar + "no encontrado.");
        }
    }
        public static void eliminarA () {
        int buscar = 0;
        System.out.println("ingrese la id del aprendiz a eliminar.");
        int consultar = input.nextInt();
        for (Aprendiz listAprendiz : registrarAprendiz) {
            if (listAprendiz.getIdentificacion() == consultar) {
                System.out.println("esta seguro de eliminar al aprendiz: s/n");
                String eliminar = input.next();

                if ("s".equals(eliminar)) {
                    registrarAprendiz.remove(listAprendiz);
                    buscar = 1;
                    System.out.println("Aprendiz eliminado con exito.");
                } else {
                    System.out.println("opcion anulada");
                }
                break;
            }
        }
        if (buscar == 0) {
            System.out.println("aprendiz " + consultar + "no encontrado.");
        }
    }
        public static void promedioIcfA () {
        int sistemas = 0, contabilidad = 0, deportes = 0;
        double sumaSistema = 0, sumaContabilidad = 0, sumaDeprtes = 0;
        for (Aprendiz aprendiz : registrarAprendiz) {
            if (aprendiz.getPrograma() == 1) {
                sistemas = sistemas + 1;
                sumaSistema = sumaSistema + aprendiz.getPuntajeIcfes();
            } else if (aprendiz.getPrograma() == 2) {
                contabilidad = contabilidad + 1;
                sumaContabilidad = sumaContabilidad + aprendiz.getPuntajeIcfes();
            } else if (aprendiz.getPrograma() == 3) {
                deportes = deportes + 1;
                sumaDeprtes = sumaDeprtes + aprendiz.getPuntajeIcfes();

            }

        }
        double promedio = sumaSistema / sistemas;
        double promedioC = sumaContabilidad / contabilidad;
        double promedioD = sumaDeprtes / deportes;

        System.out.println("el promedio de Icfs para el programa de sistemas es de " + promedio);
        System.out.println("el promedio de Icfs para el programa de contabilidad es de " + promedioC);
        System.out.println("el promedio de Icfs para el programa de deportes es de " + promedioD);

    }
        public static void numerodeA () {
        int nAs = 0, nAc = 0, nAd = 0;
        for (Aprendiz aprendiz : registrarAprendiz) {
            if (aprendiz.getPrograma() == 1) {
                nAs = nAs + 1;

            } else if (aprendiz.getPrograma() == 2) {
                nAc = nAc + 1;
            } else if (aprendiz.getPrograma() == 3) {
                nAd = nAd + 1;
            }

        }


        System.out.println("el numero de Aprendiz para el programa de sistemas es de " + nAs);
        System.out.println("el numero de Aprendiz para el programa de contabilidad es de " + nAc);
        System.out.println("el numero de Aprendiz para el programa de deportes es de " + nAd);

    }

}

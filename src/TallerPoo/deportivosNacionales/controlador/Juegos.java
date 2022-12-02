package TallerPoo.deportivosNacionales.controlador;

import TallerPoo.deportivosNacionales.modelo.Baloncesto;
import TallerPoo.deportivosNacionales.modelo.Equitacion;
import TallerPoo.deportivosNacionales.modelo.Natacion;

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
                5. conocer la cantidad de equipos deportivos de Natación:  por cada categoría.
                6. conocer el equipo con la mejor puntuación registrada en el deporte de Baloncesto.
                7. Permite conocer el promedio de velocidad entre los equipos registrados de Equitación.         
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
            for (int i = 0; i < natac; i++) {
                System.out.println("ingrese los siguientes datos de equipo  #" + (i + 1)+ " de natacion");
                System.out.println("numero de referencia del equipo de natacion");
                int referencia= input.nextInt();
                System.out.println("departamento");
                String departamento= input.next();
                System.out.println("numero de integrantes individual o por equipo:");
                int numeroIntegrantes = input.nextInt();
                System.out.println("tiempo estimado (minutos y segundos): ");
                double tiempoEstimado = input.nextDouble();
                System.out.println("categoria: 1.libre,2.espalda o 3.pecho.): ");
                int categoria = input.nextInt();
                Natacion nata= new Natacion(numeroIntegrantes,tiempoEstimado,categoria,referencia,
                        departamento,1);
                registroNata.add(nata);
                System.out.println("equipo registrado con exito");
            }
        } else if (registrar == 2) {
            System.out.println("cuantos equipos de Baloncesto desea registar: ");
            int balonc = input.nextInt();
            for (int i = 0; i < balonc; i++) {
                System.out.println("ingrese los siguientes datos de equipo #" + (i + 1)+ " de baloncesto");
                System.out.println("numero de integrantes del equipo:");
                int nIntegrantes = input.nextInt();
                System.out.println("numero de referencia del equipo de baloncesto");
                int referencia= input.nextInt();
                System.out.println("puntuación: ");
                double puntuacion = input.nextDouble();
                System.out.println("departamento");
                String departamento= input.next();
                Baloncesto balon=new Baloncesto(nIntegrantes,puntuacion,referencia,departamento,2);
                registroBalon.add(balon);
                System.out.println("equipo registrado con exito:");
            }
        } else if (registrar == 3) {
            System.out.println("cuantos equipos de Equitacion desea registar: ");
            int equita = input.nextInt();
            for (int i = 0; i < equita; i++) {
                System.out.println("ingrese los siguientes datos de equipo #" + (i + 1)+" de equitación");
                System.out.println("nombre  del equipo:");
                String nombreEquipo = input.next();
                System.out.println("numero de referencia del equipo de equitacion");
                int referencia= input.nextInt();
                System.out.println("departamento");
                String departamento= input.next();
                System.out.println("velocidad del equipo: ");
                float velocidad = input.nextFloat();
                System.out.println("categoria: 1.demostracion y 2.obstáculos");
                int categoria = input.nextInt();
                Equitacion equitacion=new Equitacion(nombreEquipo,velocidad,categoria,referencia,
                        departamento,3);
                registroEquita.add(equitacion);
                System.out.println("equipo registrado con exito:");
            }

        }else {
            System.out.println("opcion no valida.");
        }
    }
    public static void listarEquipos(){

        System.out.println("ingrese que equipo desea ver la informacion: 1.Natacion, 2.Baloncesto, 3.Equitacion: ");
        int verI= input.nextInt();
        if(verI==1) {
            int buscar=0;
            System.out.println("ingrese la referencia del equipo de natacion a buscar");
            int buscarEquipo= input.nextInt();
            for (Natacion natacion : registroNata) {
                if(natacion.getReferencia()==buscarEquipo){
                System.out.println(natacion.toString());
                buscar=1;
                break;
                }
            }
            if (buscar==0){
                System.out.println("equipo de natacion no encontrado.");
            }
        }else if(verI==2) {
            int buscar=0;
            System.out.println("ingrese la referencia del equipo de baloncesto a buscar");
            int buscarEquipo= input.nextInt();
            for (Baloncesto baloncesto : registroBalon) {
                if(baloncesto.getReferencia()==buscarEquipo){
                    System.out.println(baloncesto.toString());
                    buscar=1;
                    break;
                }
            }
            if (buscar==0) {
                System.out.println("equipo de baloncesto no encontrado.");
            }
            }else if(verI==3) {
                int buscar=0;
                System.out.println("ingrese la referencia del equipo de equitacion a buscar");
                int buscarEquipo= input.nextInt();
                for (Equitacion equitacion : registroEquita) {
                    if(equitacion.getReferencia()==buscarEquipo){
                        System.out.println(equitacion.toString());
                        buscar=1;
                        break;
                    }
                }
                if (buscar==0){
                    System.out.println("equipo de equitacion no encontrado.");
                }
            }else {
            System.out.println("opcion no valida.");
        }
        }
        public static void modificarequipo(){
            System.out.println("ingrese que equipo desea modificar la informacion: 1.Natacion, 2.Baloncesto, 3.Equitacion: ");
            int verI= input.nextInt();
            if(verI==1) {
                int buscar=0;
                System.out.println("ingrese la referencia del equipo de natacion a modificar");
                int buscarEquipo= input.nextInt();
                for (Natacion natacion : registroNata) {
                    if(natacion.getReferencia()==buscarEquipo){
                        System.out.println("numero de referencia del equipo de natacion");
                        int referencia= input.nextInt();
                        System.out.println("departamento");
                        String departamento= input.next();
                        System.out.println("numero de integrantes individual o por equipo:");
                        int numeroIntegrantes = input.nextInt();
                        System.out.println("tiempo estimado (minutos y segundos): ");
                        double tiempoEstimado = input.nextDouble();
                        System.out.println("categoria: 1.libre,2.espalda o 3.pecho.): ");
                        int categoria = input.nextInt();

                        natacion.setReferencia(referencia);
                        natacion.setDepartamento(departamento);
                        natacion.setNumeroIntegrantes(numeroIntegrantes);
                        natacion.setTiempoEstimado(tiempoEstimado);
                        natacion.setCategoria(categoria);
                        System.out.println("equipo modificado con exito:");
                        System.out.println(natacion.toString());
                        buscar=1;
                        break;
                    }
                }
                if (buscar==0){
                    System.out.println("equipo de natacion no encontrado.");
                }
            }else if(verI==2) {
                int buscar=0;
                System.out.println("ingrese la referencia del equipo de baloncesto a modificar");
                int buscarEquipo= input.nextInt();
                for (Baloncesto baloncesto : registroBalon) {
                    if(baloncesto.getReferencia()==buscarEquipo){
                        System.out.println("numero de integrantes del equipo:");
                        int nIntegrantes = input.nextInt();
                        System.out.println("numero de referencia del equipo de baloncesto");
                        int referencia= input.nextInt();
                        System.out.println("puntuación: ");
                        double puntuacion = input.nextDouble();
                        System.out.println("departamento");
                        String departamento= input.next();

                        baloncesto.setnIntegrantes(nIntegrantes);
                        baloncesto.setReferencia(referencia);
                        baloncesto.setPuntuacion(puntuacion);
                        baloncesto.setDepartamento(departamento);
                        System.out.println("equipo modificado con exito:");
                        System.out.println(baloncesto.toString());

                        buscar=1;
                        break;
                    }
                }
                if (buscar==0) {
                    System.out.println("equipo de baloncesto no encontrado.");
                }
            }else if(verI==3) {
                int buscar=0;
                System.out.println("ingrese la referencia del equipo de equitacion a buscar");
                int buscarEquipo= input.nextInt();
                for (Equitacion equitacion : registroEquita) {
                    if(equitacion.getReferencia()==buscarEquipo){
                        System.out.println("nombre  del equipo:");
                        String nombreEquipo = input.next();
                        System.out.println("numero de referencia del equipo de baloncesto");
                        int referencia= input.nextInt();
                        System.out.println("departamento");
                        String departamento= input.next();
                        System.out.println("velocidad del equipo: ");
                        float velocidad = input.nextFloat();
                        System.out.println("categoria: 1.demostracion y 2.obstáculos");
                        int categoria = input.nextInt();

                        equitacion.setNombreEquipo(nombreEquipo);
                        equitacion.setReferencia(referencia);
                        equitacion.setDepartamento(departamento);
                        equitacion.setVelocidad(velocidad);
                        equitacion.setCategoria(categoria);

                        System.out.println("equipo modificado con exito:");
                        System.out.println(equitacion.toString());
                        buscar=1;
                        break;
                    }
                }
                if (buscar==0){
                    System.out.println("equipo de equitacion no encontrado.");
                }
            }else {
                System.out.println("opcion no valida.");
            }
        }

        public static void eliminarinfoEquipo(){
            System.out.println("ingrese a que equipo desea eliminar la informacion: 1.Natacion, 2.Baloncesto, 3.Equitacion: ");
            int verI= input.nextInt();
            if(verI==1) {
                int buscar=0;
                System.out.println("ingrese la referencia del equipo de natacion a eliminar");
                int buscarEquipo= input.nextInt();
                for (Natacion natacion : registroNata) {
                    if(natacion.getReferencia()==buscarEquipo){
                        registroNata.remove(natacion);
                        buscar=1;
                        System.out.println("equipo de natacion eliminado con exito.");
                        break;
                    }
                }
                if (buscar==0){
                    System.out.println("equipo de natacion no encontrado.");
                }
            }else if(verI==2) {
                int buscar=0;
                System.out.println("ingrese la referencia del equipo de baloncesto a eliminar");
                int buscarEquipo= input.nextInt();
                for (Baloncesto baloncesto : registroBalon) {
                    if(baloncesto.getReferencia()==buscarEquipo){
                        registroBalon.remove(baloncesto);
                        System.out.println("equipo de baloncesto eliminado con exito.");
                        buscar=1;
                        break;
                    }

                }
                if (buscar==0) {
                    System.out.println("equipo de baloncesto no encontrado.");
                }
            }else if(verI==3) {
                int buscar = 0;
                System.out.println("ingrese la referencia del equipo de equitacion a eliminar");
                int buscarEquipo = input.nextInt();
                for (Equitacion equitacion : registroEquita) {
                    if (equitacion.getReferencia() == buscarEquipo) {
                        registroEquita.remove(equitacion);
                        System.out.println("equipo de equitacion eliminado con exito.");
                        buscar = 1;
                        break;
                    }
                }
                if (buscar == 0) {
                    System.out.println("equipo de equitacion no encontrado.");
                }
            }
        }
        public static void natacionCategorias(){
        int cateLibre=0, cateEpalda=0,catePecho=0;
            for (Natacion natacion:registroNata ) {
                if (natacion.getCategoria()==1){
                    cateLibre=cateLibre+1;
                } else if (natacion.getCategoria()==2) {
                   cateEpalda=cateEpalda+1;
                } else if (natacion.getCategoria()==3) {
                    catePecho=catePecho+1;
                }
            }
            System.out.println("el numero de nadadores para la categoria libre es de " + cateLibre);
            System.out.println("el numero de nadadores para la categoria espalda es de " + cateEpalda);
            System.out.println("el numero de nadadores para la categoria pecho es de " + catePecho);
        }
        public static void mejorPuntuacionBaloncesto(){
            double mejorP=registroBalon.get(0).getPuntuacion();
            for (Baloncesto baloncesto:registroBalon) {
                if (baloncesto.getPuntuacion()<mejorP){
                    mejorP= baloncesto.getPuntuacion();
                }

            }
            System.out.println("el mejor equipo de baloncesto con mejor puntuacion es "+mejorP);
        }
        public static void promedioEquiposEquitacion(){
            double promedio=0,suma=0;
            for (Equitacion equitacion:registroEquita) {
                suma=suma+equitacion.getVelocidad();
            }
            promedio=suma/registroEquita.size();
            System.out.println("el promedio de la velocidad entre los equipos de equitacion es de "+promedio);
        }

    }

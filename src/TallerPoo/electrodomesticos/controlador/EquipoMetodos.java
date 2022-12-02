package TallerPoo.electrodomesticos.controlador;

import TallerPoo.electrodomesticos.modelo.EquipoSonidoCons;


import java.util.ArrayList;
import java.util.Scanner;

public class EquipoMetodos {
static Scanner input=new Scanner(System.in);

static ArrayList<EquipoSonidoCons>equiposRegistrados=new ArrayList<>();
   static int precioVenta=0;

    public static int menu(){
    int opcEquipo;
    System.out.println("""
            1. Registrar un equipo de sonido.
            2. Listar los equipos registrados de sonido.
            3. Modificar el registro de un equipo de sonido.
            4. Eliminar el registro de un equipo de sonido.
            5. vender equipo
            elija una opcion del menu:
            """);
    opcEquipo=input.nextInt();
    return opcEquipo;
    }

    public static void registrarEquipo(){
        System.out.println("ingrese Referencia");
        int referencia= input.nextInt();
        System.out.println("ingrese marca");
        String marca= input.next();
        System.out.println("ingrese modelo");
        int modelo=input.nextInt();
        System.out.println("ingrese color");
        String color= input.next();
        System.out.println("ingrese precio:");
        precioVenta= input.nextInt();
        System.out.println("ingrese consumo energetico(kilowatts)");
        float consumo= input.nextFloat();
        System.out.println("ingrese peso del producto:");
        float pesokg= input.nextFloat();
        EquipoSonidoCons equipo= new EquipoSonidoCons(precioVenta,consumo,pesokg,referencia,marca,modelo,color);
        equiposRegistrados.add(equipo);
        System.out.println("electrodomestico registrado con exito");
    }
    public static void mostrarEquipos(){
        for (EquipoSonidoCons equipo:equiposRegistrados) {
            System.out.println(equipo.toString());
        }

    }
    public static void modificarEquipos(){
        int buscar=0;
        System.out.println("ingrese referencia a modificar.");
        int buscarReferencia= input.nextInt();
        for (EquipoSonidoCons equipo:equiposRegistrados) {
            if (equipo.getReferencia()==buscarReferencia){
                System.out.println("equipo encontrado "+ equipo);
                buscar=1;
                System.out.println("ingrese nueva Referencia");
                int referencia= input.nextInt();
                System.out.println("ingrese nueva marca");
                String marca= input.next();
                System.out.println("ingrese nuevo modelo");
                int modelo=input.nextInt();
                System.out.println("ingrese nuevo color");
                String color= input.next();
                System.out.println("ingrese nuevo precio:");
                int precioventa= input.nextInt();
                System.out.println("ingrese consumo energetico(kilowatts)");
                float consumo= input.nextFloat();
                System.out.println("ingrese peso del producto:");
                float pesokg= input.nextFloat();
                System.out.println("electrodomestico registrado con exito");

                equipo.setReferencia(referencia);
                equipo.setMarca(marca);
                equipo.setModelo(modelo);
                equipo.setColor(color);
                equipo.setPrecioVenta(precioventa);
                equipo.setConsumoEnergetico(consumo);
                equipo.setPesoKg(pesokg);

                System.out.println("Equipo actualizado con exito.");
            }
        }
        if (buscar==0){
            System.out.println("equipo "+buscarReferencia+" No fue encontrado\n");
        }
    }
    public static void eliminarEquipo(){
        int buscar=0;
        System.out.println("ingrese referencia a eliminar.");
        int buscarReferencia= input.nextInt();
        for (EquipoSonidoCons equipo:equiposRegistrados) {
            if (equipo.getReferencia()==buscarReferencia){
                System.out.println("seguro de que desea eliminar: s/n");
                String eliminar= input.next();

                if ("s".equals(eliminar)){
                    equiposRegistrados.remove(equipo);

                    buscar=1;
                    System.out.println("equipo eliminado exitosamenete.");
                    break;
                }else {
                    System.out.println("opcion anulada");
                    break;
                }
            }
        }
        if (buscar==0){
            System.out.println("equipo "+buscarReferencia+" No fue encontrado\n");
        }
    }
    public static void venderEquipo(){
        int buscar=0;
        System.out.println("ingrese referencia a vender.");
        int buscarReferencia= input.nextInt();
        for (EquipoSonidoCons equipo:equiposRegistrados) {
            if (equipo.getReferencia()==buscarReferencia){
                System.out.println("ingrese cuantos equipo va a vender");
                int vender= input.nextInt();
                buscar=1;
                if (vender==1){
                   double totalV=precioVenta*0.15;
                    System.out.println("el valor del equipo de sonido tiene un costo de "+ (precioVenta+totalV));


                    System.out.println("equipo de sonido vendido exitosamenete.");
                    break;
                }else {
                    System.out.println("el valor de los equipos de sonido tiene un costo de "+(precioVenta*vender));
                    System.out.println("equipo de sonido vendido exitosamenete #"+ vender);
                    break;
                }
            }

        }
        if (buscar==0){
            System.out.println("equipo "+buscarReferencia+" No fue encontrado\n");
        }
    }

}

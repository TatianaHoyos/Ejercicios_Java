package TallerPoo.electrodomesticos.controlador;

import TallerPoo.electrodomesticos.modelo.EquipoSonidoCons;
import TallerPoo.electrodomesticos.modelo.TelevisorCons;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisorMetodos {
    static Scanner input = new Scanner(System.in);
    static ArrayList<TelevisorCons> televisoresRegistrados = new ArrayList<>();

    public static int menuTelevi() {
        int opcTele;
        System.out.println("""
                ::::::Televisor:::::::
                1. Registrar un televisor.
                2. Listar los televisores registrados.
                3. Modificar el registro de un televisor.
                4. Eliminar el registro de un televisor.
                5. Regresar
                elija una opcion del menu:
                """);
        opcTele = input.nextInt();
        return opcTele;
    }

    public static void registrarTele() {
        System.out.println("ingrese Referencia");
        int referencia = input.nextInt();
        System.out.println("ingrese marca");
        String marca = input.next();
        System.out.println("ingrese modelo");
        int modelo = input.nextInt();
        System.out.println("ingrese color");
        String color = input.next();
        System.out.println("ingrese precio:");
        int precioVenta = input.nextInt();
        System.out.println("ingrese consumo energetico(kilowatts)");
        float consumo = input.nextFloat();
        System.out.println("ingrese peso del producto:");
        float pesokg = input.nextFloat();
        TelevisorCons televisor = new TelevisorCons(precioVenta, consumo, pesokg, referencia, marca, modelo, color);
        televisoresRegistrados.add(televisor);
        System.out.println("televisor registrado con exito");
    }

    public static void mostrarTele() {
        for (TelevisorCons televisor : televisoresRegistrados) {
            System.out.println(televisor.toString());
        }

    }

    public static void modificarTele() {
        int buscar = 0;
        System.out.println("ingrese referencia a modificar.");
        int buscarReferencia = input.nextInt();
        for (TelevisorCons televisor : televisoresRegistrados) {
            if (televisor.getReferencia() == buscarReferencia) {
                System.out.println("televisor encontrado " + televisor);
                buscar = 1;
                System.out.println("ingrese nueva Referencia");
                int referencia = input.nextInt();
                System.out.println("ingrese nueva marca");
                String marca = input.next();
                System.out.println("ingrese nuevo modelo");
                int modelo = input.nextInt();
                System.out.println("ingrese nuevo color");
                String color = input.next();
                System.out.println("ingrese nuevo precio:");
                int precioVenta = input.nextInt();
                System.out.println("ingrese consumo energetico(kilowatts)");
                float consumo = input.nextFloat();
                System.out.println("ingrese peso del producto:");
                float pesokg = input.nextFloat();


                televisor.setReferencia(referencia);
                televisor.setMarca(marca);
                televisor.setModelo(modelo);
                televisor.setColor(color);
                televisor.setPrecioVenta(precioVenta);
                televisor.setConsumoEnergetico(consumo);
                televisor.setPesoKg(pesokg);

                System.out.println("televisor actualizado con exito.");
            }
        }
        if (buscar == 0) {
            System.out.println("televisor " + buscarReferencia + " No fue encontrado\n");
        }
    }

    public static void eliminarTele() {
        int buscar = 0;
        System.out.println("ingrese referencia a eliminar.");
        int buscarReferencia = input.nextInt();
        for (TelevisorCons televisor : televisoresRegistrados) {
            if (televisor.getReferencia() == buscarReferencia) {
                System.out.println("seguro de que desea eliminar: s/n");
                String eliminar = input.next();

                if ("s".equals(eliminar)) {
                    televisoresRegistrados.remove(televisor);
                    buscar = 1;
                    System.out.println("televisor eliminado exitosamenete.");
                } else {
                    System.out.println("opcion anulada");
                }
                break;
            }
        }
        if (buscar == 0) {
            System.out.println("televisor " + buscarReferencia + " No fue encontrado\n");
        }
    }

    public static double venderTele() {
        int buscar = 0;
        double ventaTotal = 0;
        System.out.println("ingrese referencia del TV a vender.");
        int buscarReferencia = input.nextInt();
        for (TelevisorCons televisor : televisoresRegistrados) {
            if (televisor.getReferencia() == buscarReferencia) {
                System.out.println("ingrese cuantos televisores va a vender de la referencia: "+ televisor.getReferencia());
                int vender = input.nextInt();
                buscar = 1;
                if (vender == 1) {
                    double totalV = televisor.getPrecioVenta() * 0.10;
                    ventaTotal = televisor.getPrecioVenta() + totalV;
                    System.out.println("el valor del televisor tiene un costo de " + ventaTotal);
                    System.out.println("televisor vendido exitosamenete.");
                } else {
                    ventaTotal=televisor.getPrecioVenta() * vender;
                    System.out.println("el valor de los televisores es de " + ventaTotal);
                    System.out.println("televisores vendidos exitosamenete " + vender);
                }
                break;
            }
        }
        if (buscar == 0) {
            System.out.println("televisor  " + buscarReferencia + " No fue encontrado\n");
        }
        return ventaTotal;
    }
}

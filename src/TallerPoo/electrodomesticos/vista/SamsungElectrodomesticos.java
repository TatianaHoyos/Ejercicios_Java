package TallerPoo.electrodomesticos.vista;

import java.util.Scanner;

import static TallerPoo.electrodomesticos.controlador.EquipoMetodos.venderEquipo;
import static TallerPoo.electrodomesticos.controlador.InicioEquipo.menuEquipos;
import static TallerPoo.electrodomesticos.controlador.InicioTele.menuTele;
import static TallerPoo.electrodomesticos.controlador.TelevisorMetodos.venderTele;

public class SamsungElectrodomesticos {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int opcion;

        do{
            System.out.println("""
                    :::Menú Electrodomesticos:::
                    1.Equipos de Sonidos
                    2.Televisores
                    3.venta
                    elija una opcion:
                    """);
            opcion=input.nextInt();

            switch (opcion){

                case 1:
                    menuEquipos();
                    break;
                case 2:
                    menuTele();
                    break;
                case 3:
                    double totalVenta=0;
                    while (true){
                        System.out.println("""
                                :::ventas::::
                                1.Vender equipo de sonido
                                2.Vender televisores
                                3.Finalizar venta - Generar factura
                                ingrese una opcion:
                                """);
                        int ventas=input.nextInt();

                        switch (ventas){
                            case 1:
                                totalVenta = totalVenta + venderEquipo();
                                break;
                            case 2:
                                totalVenta = totalVenta + venderTele();
                                break;
                            case 3:
                                System.out.println("Total de la venta realizada: "+ totalVenta);
                                break;
                            default:
                                System.out.println("Opción de venta no válida");
                                break;
                        }

                        if (ventas==3){
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("ingrese una opcion valida");
            }

        }while (opcion!=0);

    }
}

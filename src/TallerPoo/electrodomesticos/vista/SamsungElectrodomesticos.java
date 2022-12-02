package TallerPoo.electrodomesticos.vista;

import java.util.Scanner;

import static TallerPoo.electrodomesticos.controlador.EquipoMetodos.venderEquipo;
import static TallerPoo.electrodomesticos.modelo.InicioEquipo.menuEquipos;
import static TallerPoo.electrodomesticos.controlador.InicioTele.menuTele;

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
                    while (true){
                        System.out.println("""
                                :::ventas::::
                                1.equipo de sonido
                                2.televisores
                                3.regresar
                                ingrese una opcion:
                                """);
                        int ventas=input.nextInt();
                        if (ventas==3){
                            break;
                        }
                        switch (ventas){
                            case 1:
                                venderEquipo();
                                break;
                            case 2:
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

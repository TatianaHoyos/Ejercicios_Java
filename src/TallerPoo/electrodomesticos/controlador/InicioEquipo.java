package TallerPoo.electrodomesticos.controlador;

import static TallerPoo.electrodomesticos.controlador.EquipoMetodos.*;

public class InicioEquipo {
    public static void menuEquipos(){
        int opcion=0;
        do {
            opcion=menu();
            if(opcion==5){
                break;
            }
            switch (opcion){
                case 1:
                    registrarEquipo();
                    break;
                case 2:
                    mostrarEquipos();
                    break;
                case 3:
                    modificarEquipos();
                    break;
                case 4:
                    eliminarEquipo();
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

        }while (opcion!=0);
    }



}

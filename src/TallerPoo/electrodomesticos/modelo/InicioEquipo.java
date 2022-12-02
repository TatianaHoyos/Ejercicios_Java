package TallerPoo.electrodomesticos.modelo;

import static TallerPoo.electrodomesticos.controlador.EquipoMetodos.*;

public class InicioEquipo {
    public static void menuEquipos(){
        int opcion=0;
        do {
            opcion=menu();
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
                case 5:
                    venderEquipo();

            }

        }while (opcion!=0);
    }
}

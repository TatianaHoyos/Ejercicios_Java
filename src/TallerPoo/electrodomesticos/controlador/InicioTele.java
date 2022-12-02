package TallerPoo.electrodomesticos.controlador;

import static TallerPoo.electrodomesticos.controlador.TelevisorMetodos.*;

public class InicioTele {
    public static void menuTele(){
        int opcion=0;
        do {
            opcion=menuTelevi();
            switch (opcion){
                case 1:
                    registrarTele();
                    break;
                case 2:
                    mostrarTele();
                    break;
                case 3:
                    modificarTele();
                    break;
                case 4:
                    eliminarTele();
                    break;
                case 5:
                    venderTele();


            }

        }while (opcion!=0);

    }
}

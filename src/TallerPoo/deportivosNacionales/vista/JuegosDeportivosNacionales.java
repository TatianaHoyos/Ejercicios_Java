package TallerPoo.deportivosNacionales.vista;

import static TallerPoo.deportivosNacionales.controlador.Juegos.*;

public class JuegosDeportivosNacionales {
    public static void main(String[] args) {
        try {


        int opcion;

        do {

            opcion=menuJuegos();
            switch (opcion){
                case 1:
                    registrarEquipo();
                    break;
                case 2:
                    listarEquipos();
                    break;
                case 3:
                    modificarequipo();
                    break;
                case 4:
                    eliminarinfoEquipo();
                    break;
                case 5:
                    natacionCategorias();
                    break;
                case 6:
                    mejorPuntuacionBaloncesto();
                    break;
                case 7:
                    promedioEquiposEquitacion();
                    break;
                default:
                    System.out.println("opcion no valida");
            }

        }while (opcion!=0);
        }catch (Exception e){
            System.out.println("Ha ocurrido un error inesperado. Intente de nuevo.");
        }
    }
}

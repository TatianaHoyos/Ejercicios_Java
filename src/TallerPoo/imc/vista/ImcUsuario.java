package TallerPoo.imc.vista;

import static TallerPoo.imc.modelo.ImcUsuarioMet.*;

public class ImcUsuario {


    public static void main(String[] args) {
        int opcion;
        do{
            opcion=menu();
            switch (opcion){
                case 0:
                    break;
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    listaUsuarios();
                    break;
                case 3:
                    buscarUsuario();
                    break;
                case 4:
                    modificarUsuario();
                break;
                case 5:
                    eliminarUsuario();
                    break;
                case 6:
                    imcUsuario();
                    break;
                case 7:
                    usuariosMenoresyMayores();
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
            }

        }while (opcion!=0);
       
    }
}

package TallerPoo.sena.vista;

import static TallerPoo.sena.controlador.Sena.*;

public class AprendizSena {
    public static void main(String[] args) {
        try {


        int opcionA=0;
        do {
          opcionA=menuA();
          switch (opcionA){
              case 1:
                  registrarA();
                  break;
              case 2:
                  listarA();
                  break;
              case 3:
                  buscarA();
                  break;
              case 4:
                  modificarA();
                  break;
              case 5:
                  eliminarA();
                  break;
              case 6:
                  promedioIcfA();
                  break;
              case 7:
                  numerodeA();
                  break;
          }
        }while (opcionA!=0);
    }catch (Exception e){
            System.out.println("Ha ocurrido un error insperado.\n intente de nuevo");
        }
    }
}

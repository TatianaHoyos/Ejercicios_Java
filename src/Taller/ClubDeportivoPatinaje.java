package Taller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClubDeportivoPatinaje {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Double manualTiempos[]= new Double []{30.50 , 29.89, 27.45, 33.56, 20.78, 45.73, 33.56,
                45.33, 23.89, 20.78, 45.73, 36.89, 34.56, 39.45};
        System.out.println(Arrays.toString(manualTiempos));
        double suma=0;
        for (int i = 0; i < manualTiempos.length; i++) {
            suma+=manualTiempos[i];
        }
        double promedio=suma/manualTiempos.length;

       while (true){

           System.out.print("""
                a. La sumatoria de tiempos de los patinadores
                b. El promedio de tiempos de los patinadores
                c. El tiempo del patinador más veloz
                d. El tiempo del patinador más lento
                e. Cantidad tiempos registrados de los patinadores.
                f. Ordenamiento de los tiempos de los patinadores.
                g. Notificación de alerta para los patinadores
                s.salir
                elija una opción:
                """);

           String opcion= input.next();
           if (opcion.equals("s")){
               break;
           }

           switch (opcion){

               case "a":

                   System.out.printf("la suma de todos los patinadores es de: %.2f %n ", suma);
                   break;
               case "b":

                   System.out.printf("El promedio de tiempos de los patinadores es de: %.2f %n ", promedio);
                   break;
               case "c":
                   Arrays.sort(manualTiempos);
                 double veloz= manualTiempos[0];

                   System.out.println("El tiempo del patinador más veloz es: "+ veloz);
                   break;
               case "d":
                   double lento= manualTiempos[manualTiempos.length-1];
                   System.out.println("El tiempo del patinador más lento es: "+ lento);
                   break;
               case "e":
                  int cantidad= manualTiempos.length;
                   System.out.println("Cantidad tiempos registrados de los patinadores es de: "+ cantidad);
                   break;
               case "f":
                   Arrays.sort(manualTiempos);
                   System.out.println(Arrays.toString(manualTiempos));
               case "g":
                   if (promedio>=00.00 && (promedio<=25.00)){
                       System.out.println("Vamos bien – Posibilidades de medalla de Oro");
                   }
                   if(promedio>=25.01 &&(promedio<=30.00)){
                       System.out.println("Continuemos trabajando – Posibilidades de medalla de Plata");
                   }
                   if (promedio>=30.01 && (promedio<=40.00)){
                       System.out.println("Debemos mejorar más – Posibilidades de medalla de Bronce");
                   }
                   if (promedio>=40.01){
                       System.out.println("Alerta máxima – No realizaremos una buena representación");
                   }
                   break;

               default:
                   System.out.println("opcion no valida");
                   break;

           }
       }


    }
}

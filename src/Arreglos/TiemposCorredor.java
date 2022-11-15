package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class TiemposCorredor {
    public static void  main (String[] args){
        Scanner input=new Scanner(System.in);
        int opcion, tiempo, i=0;
        double corredor[] = new double[0];

        do {
            System.out.print("""
                        ::Menu de opciones::
                        1.guardar numero determinado de tiempos
                        2.visualizar los tiempos del corredor
                        3.actualizar uno de los tiempos del corredor
                        4.mostrar el promedio de los tiempo del corredor
                        5.mostrar el tiempo maximo y minimo del corredor
                        6.salir
                        ingrese una opcion del menu:
                        """);
            opcion=input.nextInt();
            switch (opcion){
                case 6:
                    break;
                    case 1:
                        System.out.print("cuantos tiempo del corredor va a ingresar:");
                        tiempo = input.nextInt();
                        corredor = new double[tiempo];
                        for ( i=0;i<tiempo;i++){
                            System.out.println("ingrese tiempo #"+(i+1));
                            double totalTiempo=input.nextDouble();
                            corredor[i]=totalTiempo;
                        }
                        break;
                    case 2:
                        if (corredor.length > 0){
                            System.out.println("los tiempos del corredor son: "+ Arrays.toString(corredor));
                        }
                        break;
                case 3:
                    System.out.println("ingrese una opción de los siguientes tiempos a actualizar:");
                    for ( i=0;i<corredor.length;i++){
                        System.out.println("timpo #"+(i+1)+ ": "+ corredor[i]);
                    }
                    int opcionactualizar=input.nextInt();
                    if (opcionactualizar <= corredor.length) {
                        System.out.println("Ingrese el nuevo tiempo");
                        corredor[opcionactualizar-1] = input.nextDouble();
                    }else {
                        System.out.println("opción no valida");
                    }
                  break;
                case 4:
                    double suma= Arrays.stream(corredor).sum();
                    double promedio= suma/ corredor.length;
                    System.out.printf("el promedio del corredor es de: %.2f %n", promedio);
                    break;
                case 5:
                    Arrays.sort(corredor);
                    System.out.println("N min = "+ corredor[0]);
                    System.out.println("N max = "+ corredor[corredor.length-1]);
                    break;
                }

        }while (opcion<=5);


    }
}

package Arreglos;

import java.util.Scanner;

public class Multidimencional {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       String nombre;
        int valorDia[]=new int[0];

        System.out.print("""
                :::opciones:::
                1.nombre de los empleados
                2.valor dia trabajado
                3.valor calculado en el mes
                4.determinar el empleado mas econico y el empleado con valor de pago mas costoso
                5.salir
                ingrese una opcion del menu:
                """);
        int opcion= input.nextInt();
        switch (opcion){
            case 1:
            System.out.print("cuantos empleados desea registrar:");
            int empleados=input.nextInt();
            for(int i=0; i<empleados;i++){
                System.out.print("ingrese nombre del empleado #"+(i+1));
                nombre= input.next();

            }
            break;
            case 2:
                System.out.println("ingrese dias trabajado del empleado #"+(8));
                int diasTrabajados=input.nextInt();
        }



    }
}

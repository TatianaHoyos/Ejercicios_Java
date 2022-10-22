package ejercicios.switchcase;

import java.io.BufferedReader;
import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                    :::Días de semana:::
                    1.Lunes
                    2.Martes
                    3.Miercoles
                    4.Jueves
                    5.Viernes
                    6.Sabado
                    7.Domingo
                    Escoja un día de semana que este en el menú:
                    """);
        int días= input.nextInt();
        switch (días){
            case 1:
                System.out.println("Feliz inicio de SEMANA");
                break;

            case 2: case 3: case 4:
                System.out.println("Estoy trabajando fuertemente");
                break;
            case 5:
                System.out.println("Iniciando el fin de semana");
                break;
            case 6: case 7:
                System.out.println("Feliz Fin de SEMANA");
                break;
            default:
                System.out.println("opcion no valida ");
        }
    }
}

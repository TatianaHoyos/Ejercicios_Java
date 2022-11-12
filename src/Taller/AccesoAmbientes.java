package Taller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AccesoAmbientes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double entrada=12.00, salida=6.00, entradaEstudiante;

        String nombre, programa;

        System.out.print("""
                ::::::Programa de asistencia:::::::
                El programa está configurado en hora militar
                Hora de inicio:12:00
                Hora de salida:18:00
                cuantos Estudiantes van a ingresar:
                """);
        int usuarios= input.nextInt();
        ArrayList<String>nombresApellidos=new ArrayList<>();
        ArrayList<String>progamaFormacion=new ArrayList<>();
        ArrayList<Double>entradaPuntual=new ArrayList<>();
        ArrayList<Double>horaSalida=new ArrayList<>();

        for (int i=0; i<usuarios;i++){
            System.out.println("Hora de ingreso del Estudiante (Formato 24h) #"+(i+1));
            entradaEstudiante= input.nextDouble();
            System.out.println("Hora de salida de la jornada estudiante (Formato 24h) #"+(i+1));
            salida= input.nextDouble();
           entradaPuntual.add(entrada);
           horaSalida.add(salida);
            if (entrada==entradaEstudiante || entradaEstudiante <= (entrada+0.30)){
                System.out.println("Ingrese su Nombre y Apellido:");
                nombre = input.next();
                nombresApellidos.add(nombre);
            }
            else {
                System.out.println("Ingrese su programa de formación:");
                programa= input.next();
                progamaFormacion.add(programa);
            }
        }

        Arrays.sort(nombresApellidos.toArray());
        for (int i=0;i<nombresApellidos.size();i++){
            System.out.println("Nombres de los estudiantes: "+nombresApellidos.get(i));
        }
        System.out.println("Numero total de estudiantes que ingresaron a tiempo: "+nombresApellidos.size());

        for (String programaE: progamaFormacion ) {
            System.out.println("Programas de formacion : "+programaE);
        }
        System.out.println("Total de programas de formacion : "+progamaFormacion.size());

        int totalIngreso=progamaFormacion.size()+nombresApellidos.size();
        System.out.println("El total de Estudiantes que ingresaron a la jornada academica: "+totalIngreso);





    }
}

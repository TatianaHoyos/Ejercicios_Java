package ejercicios.switchcase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumeroTrimestre {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print(""" 
                            :::Menú de trimestre:::
                            1.Primer trimestre
                            2.Segundo trimestre
                            3.Tercer trimestre
                            4.Cuarto trimestre
                            5.Quinto trimestre
                            6.Sexto trimestre
                            7.Septimo trimestre
                            Escoja un opción del menú:
                            """);
        int opcion= input.nextInt();
        switch (opcion){
            case 1 : System.out.println("""
                    :::1.Primer trimestre:::
                    * Fundamentos de Ficha + calidad 1
                    * Algoritmos con PYTHON
                    * BD Relacionales
                    """);
                break;
            case 2 : System.out.println("""
                    :::2.Segundo trimestre:::
                    * Java (POO + Web)
                    * CSS, Html
                    * Requisitos
                    """);
                break;
            case 3 : System.out.println("""
                    :::3.Tercer trimestre:::
                    * Analisis mas Refinamiento de Requisitos
                    * PHP
                    * JavaScript
                    """);
                break;
            case 4 : System.out.println("""
                    :::4.Cuarto trimestre:::
                    * Modelado de Artefactos
                    * BD NoSQL + Node JS                  
                    """);
                break;
            case 5 : System.out.println("""
                    :::5.Quinto trimestre:::
                    * .Net 
                    * Moviles (Nativo e Hibrido)
                    """);
                break;
            case 6 : System.out.println("""
                    :::6.Sexto trimestre:::
                    * Proyecto 1 + Manual tecnico +Calidad 2
                    * Phyton (Machine Learning + Big Data)
                    * Negociación
                    """);
                break;
            case 7 : System.out.println("""
                    :::7.Septimo trimestre:::
                    * Proyecto 2 + Calidad 3
                    * Pruebas + Implantación
                    * Manuales + Capacitación
                    """);
                break;

            default : System.out.println("Opción no valida");
        }

    }

}

package EjerciciosRecuperacion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FederacionAgricola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> litrosPesticida = new ArrayList<>(Arrays.asList(5.7, 4.90, 12.45, 5.23, 7.89, 9.34, 8.67));
        try {
            do {
                System.out.print("""
                        ::::MENU:::::
                        1. Agregar litros de pesticida
                        2. Mostrar medidas de tendencia central
                        3. Mostrar alertas
                        0. salir
                        elija una opcion:
                        """);

                int opcion = input.nextInt();
                if (opcion == 0) {
                    break;
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese una nueva cantidad de pesticida");
                        Double cantidad = input.nextDouble();
                        litrosPesticida.add(cantidad);
                        break;
                    case 2:
                        System.out.print("a. Valor promedio");
                        Double suma = litrosPesticida.stream().mapToDouble(Double::doubleValue).sum();
                        double promedio = suma / litrosPesticida.size();
                        System.out.println(" es de : " + promedio);

                        Collections.sort(litrosPesticida);
                        System.out.println("b. Valor mínimo: " + litrosPesticida.get(0)
                                + " y valor máximo: " + litrosPesticida.get(litrosPesticida.size() - 1));

                        System.out.println("c. La Sumatoria de los pesticidas almacenados en la lista es de: " + suma);
                        break;
                    case 3:
                        Double sumaAlerta = litrosPesticida.stream().mapToDouble(Double::doubleValue).sum();
                        double promedioAlerta = sumaAlerta / litrosPesticida.size();

                        if (promedioAlerta <= 20) {
                            System.out.println("Existe una eficiencia en el uso de los Insumos");
                        } else if (promedioAlerta <= 40) {
                            System.out.println("Existe un uso moderado de los Insumos");
                        } else if (promedioAlerta > 40) {
                            System.out.println("Existe un uso inadecuado de los Insumos");
                        }
                        System.out.println("Con un promedio de " + promedioAlerta + " litros de pesticidas");
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;

                }
            } while (true);
            System.out.println("""
                    Tatiana Hoyos
                    tihoyos4@misena.edu.co
                    Hasta Pronto
                    """);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado. Intente de nuevo.");
        }
    }
}

package EjerciciosRecuperacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SistemaMetro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> estudiantes = new ArrayList<>();
        ArrayList<Double> nacional = new ArrayList<>();
        ArrayList<Double> internacional = new ArrayList<>();

        double costoTicket = 0, sumaE = 0, sumaN = 0, sumaI = 0;
        try {
            do {
                System.out.println("""
                        :::Tipo de usuario:::
                        1.Estudiante 
                        2.Nacional 
                        3.Internacional
                        :::Otras opciones:::
                        4.siguiente menú
                        0. salir
                        elija una opcion:
                        """);
                int opcion = input.nextInt();

                if (opcion == 0) {
                    break;
                }
                int numeroTi;
                switch (opcion) {
                    case 1:
                        System.out.println("numero de tickest a comprar:");
                        numeroTi = input.nextInt();
                        costoTicket = 1.500;
                        double totalE = numeroTi * costoTicket;
                        estudiantes.add(totalE);
                        System.out.printf(" el total de la compra para el estudiante es de : %.3f %n", totalE);
                        break;
                    case 2:
                        System.out.println("numero de tickest a comprar:");
                        numeroTi = input.nextInt();
                        costoTicket = 2.500;
                        double totalN = numeroTi * costoTicket;
                        System.out.printf(" el total de la compra para el nacional es de : %.3f %n", totalN);
                        nacional.add(totalN);
                        break;
                    case 3:
                        System.out.println("numero de tickest a comprar:");
                        numeroTi = input.nextInt();
                        costoTicket = 4.500;
                        double totalI = numeroTi * costoTicket;
                        internacional.add(totalI);
                        System.out.printf(" el total de la compra para el internacional es de : %.3f %n", totalI);
                        break;
                    case 4:
                        while (true) {
                            System.out.println("""
                                    1.promedio entre las ventas registradas de cada una de las listas
                                    2.mostrar lista de mayor recaudo en el sistema metro
                                    3.valor más económico y costoso entre las compras almacenadas en las listas.
                                    4. regresar
                                    elija una opcion:
                                    """);
                            int opcion2 = input.nextInt();

                            if (opcion2 == 1) {
                                sumaE = estudiantes.stream().mapToDouble(Double::doubleValue).sum();
                                double promedioE = sumaE / estudiantes.size();
                                System.out.println("el promedio de las ventas de los estudiantes es de: " + promedioE);
                                sumaN = nacional.stream().mapToDouble(Double::doubleValue).sum();
                                double promedioN = sumaN / nacional.size();
                                System.out.println("el promedio de las ventas nacional es de: " + promedioN);
                                sumaI = internacional.stream().mapToDouble(Double::doubleValue).sum();
                                double promedioI = sumaI / internacional.size();
                                System.out.println("el promedio de las ventas internacional es de: " + promedioI);
                            } else if (opcion2 == 2) {
                                if (sumaE > sumaN && sumaE > sumaI) {
                                    System.out.printf("la lista de mayor recaudo es la de estudiantes" +
                                            " con un total de : %.3f %n", sumaE);
                                } else if (sumaN > sumaE && sumaN > sumaI) {
                                    System.out.printf("la lista de mayor recaudo es la nacional con un total de : %.3f %n", sumaN);
                                } else {
                                    System.out.printf("la lista de mayor recaudo es la internacional " +
                                            "con un total de : %.3f %n", sumaI);
                                }
                            } else if (opcion2 == 3) {
                                Collections.sort(estudiantes);
                                System.out.println(estudiantes);
                                System.out.printf("el valor mas economico de los estudiantes es : %.3f %n", estudiantes.get(0));
                                System.out.printf("el valor mas costoso de los" +
                                        " estudiantes es : %.3f %n", estudiantes.get(estudiantes.size() - 1));

                                Collections.sort(nacional);
                                System.out.println(nacional);
                                System.out.printf("el valor mas economico nacional es : %.3f %n", nacional.get(0));
                                System.out.printf("el valor mas costoso nacional " +
                                        "es : %.3f %n", nacional.get(nacional.size() - 1));

                                Collections.sort(internacional);
                                System.out.println(internacional);
                                System.out.printf("el valor mas economico internacional es : %.3f %n", internacional.get(0));
                                System.out.printf("el valor mas costoso internacional " +
                                        "es : %.3f %n", internacional.get(internacional.size() - 1));

                            } else if (opcion2 == 4) {
                                break;
                            } else {
                                System.out.println("ingrese una opcion valida.");

                            }
                        }
                        break;
                    default:
                        System.out.println("opcion no valida.");
                        break;
                }


            } while (true);
            System.out.println("""
                    Tatiana Hoyos
                    tihoyos4@misena.edu.co
                    """);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado. Intente de nuevo.");
        }
    }


}
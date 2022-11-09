package Taller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JuegosOlimpicos {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ArrayList<Double>Colombia=new ArrayList<>();
        ArrayList<Double>Brasil=new ArrayList<Double>();
        ArrayList<Double>Mexico=new ArrayList<Double>();
        ArrayList<Double>EstadosUnidos=new ArrayList<Double>();
        int pais;
        double tiempo;
        do {
            System.out.print("""
                    :::Menú paises de los nadadores:::
                    1.Colombia
                    2.Brasil
                    3.mexico
                    4.Estados Unidos
                    5. mostrar siguiente menu
                    6.salir
                    Elija a que pais corresponde el nadador olimpico:
                    """);
            pais=input.nextInt();

            switch (pais){
                case 1:
                    while (true){
                        System.out.println("ingrese el número de tiempos del nadador en minutos:");
                        tiempo=input.nextFloat();
                        if (tiempo==0){
                            break;
                        }
                        Colombia.add(tiempo);
                    }

                    System.out.println(Colombia);

                    break;
                case 2:
                    while (true){
                        System.out.println("ingrese el número de tiempos del nadador en minutos:");
                        tiempo=input.nextFloat();
                        if (tiempo==0){
                            break;
                        }
                        Brasil.add(tiempo);
                    }
                    break;
                case 3:
                    while (true){
                        System.out.println("ingrese el número de tiempos del nadador en minutos:");
                        tiempo=input.nextFloat();
                        if (tiempo==0){
                            break;
                        }
                        Mexico.add(tiempo);
                    }
                    break;
                case 4:
                    while (true){
                        System.out.println("ingrese el número de tiempos del nadador en minutos:");
                        tiempo=input.nextFloat();
                        if (tiempo==0){
                            break;
                        }
                        EstadosUnidos.add(tiempo);
                    }
                    break;
                case 5:
                    boolean bandera=true;

                    while (bandera){
                        System.out.print("""
                                1. El tiempo promedio de los nadadores de COLOMBIANOS.
                                2. El tiempo Mínimo y el tiempo Máximo entre los nadadores de BRASILEROS.
                                3. Ordenar de Mayor a Menor los tiempos de los nadadores MEXICANOS.
                                4. El promedio de tiempo de los nadadores de ESTADOS UNIDENSES
                                ingrese una opcion:
                                """);
                        int opcion= input.nextInt();
                        switch (opcion){
                            case 1:
                                if(Colombia.size()>0){
                                    Double suma= Colombia.stream().mapToDouble(Double::doubleValue).sum();
                                    double promedio=suma/Colombia.size();
                                    System.out.printf("el promedio de nadadores colombianos es de: %.2f %n",promedio);
                                }else {
                                    System.out.println("colombia no tiene registro");
                                }
                                break;
                            case 2:
                                if(Brasil.size()>0) {
                                    Brasil.stream().sorted();
                                    System.out.println("n min = " + Brasil.get(0));
                                    System.out.println("n max = " + Brasil.get(Brasil.size()));
                                }else {
                                    System.out.println("Brasil no tiene registro");
                                }
                                break;
                            case 3:
                                if(Mexico.size()>0) {
                                    Mexico.stream().sorted(Comparator.reverseOrder());
                                    System.out.println("los tiempos de los nadadores mexicanos " +
                                            "de mayor a menor son: " + Mexico);
                                }else {
                                    System.out.println("Mexico no tiene registro");
                                }

                                break;
                            case 4:

                                break;
                            default:
                                bandera=false;
                                break;
                        }
                    }



            }

        }while (pais<=5);
        }

    }


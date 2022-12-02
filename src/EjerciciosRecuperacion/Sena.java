package EjerciciosRecuperacion;


import java.util.*;

public class Sena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        float sumaAdso = 0, promedioAdso = 0, sumaContabilidad = 0, sumaAdministracion = 0, promedioC = 0, promedioA = 0;
        ArrayList<Float> Adso = new ArrayList<>();
        ArrayList<Float> Cocina = new ArrayList<>();
        ArrayList<Float> Contabilidad = new ArrayList<>();
        ArrayList<Float> Administracion = new ArrayList<>();
        try {
            do {
                System.out.println("""
                        "":::rango de calificaciones entre 0.0 y 5.0 puntos:::
                        :::examenes de admision:::""");
                System.out.println("""
                        1.ADSO
                        2.COCINA
                        3.CONTABILIDAD 
                        4.ADMINISTRACION
                        5. MOSTRAR MEJOR RESULTADO (ADMIN Y CONT)
                        elija una opcion:
                        """);
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        while (true) {
                            System.out.println(" 0 para dejar de ingresar calificaciones");
                            System.out.println("ingrese sus calificaciones optenidas:");
                            float notasAdso = input.nextFloat();
                            if (notasAdso == 0) {
                                break;
                            }
                            Adso.add(notasAdso);
                            sumaAdso += notasAdso;
                        }
                        promedioAdso = sumaAdso / Adso.size();
                        System.out.println("su promedio es de " + promedioAdso);
                        if (promedioAdso >= 0.0 && promedioAdso <= 3.9) {
                            System.out.println("NO SUPERO la Prueba su promedio es " + promedioAdso);
                        } else if (promedioAdso >= 4.0 && promedioAdso <= 5.0) {
                            System.out.println("SUPERO la Prueba su promedio es " + promedioAdso);
                        }
                        break;
                    case 2:

                        while (true) {
                            System.out.println(" 0 para dejar de ingresar calificaciones");
                            System.out.println("ingrese sus calificaciones optenidas:");
                            float notasCocina = input.nextFloat();
                            if (notasCocina == 0) {
                                break;
                            }
                            Cocina.add(notasCocina);
                        }
                        Collections.sort(Cocina);
                        System.out.println(Cocina);
                        System.out.println("La nota mas Baja es " + Cocina.get(0));
                        System.out.println("La nota mas Alta es " + Cocina.get(Cocina.size() - 1));
                        break;
                    case 3:
                        while (true) {
                            System.out.println(" 0 para dejar de ingresar calificaciones");
                            System.out.println("ingrese sus calificaciones optenidas:");
                            float notasContabilidad = input.nextFloat();
                            if (notasContabilidad == 0) {
                                break;
                            }
                            Contabilidad.add(notasContabilidad);
                            sumaContabilidad += notasContabilidad;
                        }
                        promedioC = sumaContabilidad / Contabilidad.size();
                        System.out.println("El promedio de las calificaciones es de " + promedioC);
                        break;
                    case 4:
                        while (true) {
                            System.out.println(" 0 para dejar de ingresar calificaciones");
                            System.out.println("ingrese sus calificaciones optenidas:");
                            float notasAdninistracion = input.nextFloat();
                            if (notasAdninistracion == 0) {
                                break;
                            }
                            Administracion.add(notasAdninistracion);
                            sumaAdministracion += notasAdninistracion;
                        }
                        promedioA = sumaAdministracion / Administracion.size();
                        System.out.println("El promedio de las calificaciones es de " + promedioA);
                        break;

                    case 5:
                        if (Contabilidad.size() < 0) {
                            System.out.println("debe primero ingresar datos en contabilidad.");
                            return;
                        }
                        if (Administracion.size() < 0) {
                            System.out.println("debe primero ingresar datos en Administracion.");
                            return;
                        }

                        if (promedioA > promedioC) {
                            System.out.println(" presenta mejores resultados entre los estudiantes de Administracion " + promedioA);
                        } else {
                            System.out.println(" presenta mejores resultados entre los estudiantes de Contabilidad " + promedioC);
                        }
                        break;
                    default:
                        System.out.println("Elija una opcion correcta");
                }
            } while (opcion <= 4);
            System.out.println("Tatiana Hoyos " +
                    "Ficha #2559202");


        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado. Intente de nuevo.");
        }
    }
}

package Taller;

import java.util.*;

public class CentroUniversitario {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int menu, programa, creditos;
        int matricula[][];

        System.out.println("¿ Cuántos estudiantes desea matricular ?" );
        int cantidadE= input.nextInt();
        matricula=new int[cantidadE][3];


        for (int i=0; i<cantidadE;i++ ){
            System.out.println("Estudiante #"+(i+1 )+" elija a que programa desea matricularse:");
            System.out.println("""
                                :::::Centro Universitario:::::
                                ******Registro Matriculas****
                                1.Ingenieria de Sistemas
                                2.Ingenieria Electronica
                                3.Ingenieria Civil
                                4.Salir
                                """);
            programa=input.nextInt();
            System.out.println("¿Cuántos creditos desea matricular?");
            creditos=input.nextInt();
            matricula[i][programa-1]=creditos;

            System.out.println("el estudiante #"+(i+1)+ " pagará: "+ obtenerValorCredito(creditos));
        }
        System.out.println(":::Reporte Financiero:::");
        int maxCredito;
        int minCredito;
        int num;
        int [] array = new int[matricula.length];

        //se recorre todas las filas de la matrix
        //para crear array de 1D
        for (int i = 0; i < matricula.length; i++) {
            num = Arrays.stream(matricula[i]).max().getAsInt();
            array[i] = num;
        }
        Arrays.sort(array);

        maxCredito = array[array.length-1];
        minCredito = array[0];


        System.out.println("Matricula mas costosa del sistema es de : "+ maxCredito + " créditos");
        System.out.println("Con un costo de: "+ obtenerValorCredito(maxCredito));
        System.out.println("Matricula mas economica del sistema es: " + minCredito + " créditos");
        System.out.println("Con un costo de: "+ obtenerValorCredito(minCredito));

        //obtener valores de la faculdad de Sistemas
        int costoCreditoSistema = 0;
        for (int i = 0; i < matricula.length; i++) {
            costoCreditoSistema += obtenerValorCredito(matricula[i][0]);
        }
        int costoCreditoElectronica = 0;
        for (int i = 0; i < matricula.length; i++) {
            costoCreditoElectronica += obtenerValorCredito(matricula[i][1]);
        }
        int costoCreditoCivil= 0;
        for (int i = 0; i < matricula.length; i++) {
            costoCreditoCivil += obtenerValorCredito(matricula[i][2]);
        }

        System.out.println("El valor total recaudado por todos los estudiantes matriculados en el Programa de Ingeniería\n" +
                "de Sistemas es de: "+ costoCreditoSistema);
        System.out.println("El valor total recaudado por todos los estudiantes matriculados en el Programa de Ingeniería\n" +
                "Electronica es de: "+ costoCreditoElectronica);
        System.out.println("El valor total recaudado por todos los estudiantes matriculados en el Programa de Ingeniería\n" +
                "Civil es de: "+ costoCreditoCivil);


        int totalRecaudo=costoCreditoCivil+costoCreditoSistema+costoCreditoElectronica;
        System.out.println(" El valor total recaudado por todos los estudiantes matriculados " +
                "en la facultad es de:\n"+totalRecaudo);


    }

    static int obtenerValorCredito(int creditos){
        int valorCredito=35000,sobreCostoCredito=15000,totalCredito, sobreCreditos;
        if (creditos>17){
            sobreCreditos=creditos-17;
            totalCredito=(sobreCreditos*sobreCostoCredito);
            totalCredito+=valorCredito*17;
        }else {
            totalCredito=valorCredito*creditos;
        }
        return totalCredito;
    }
}

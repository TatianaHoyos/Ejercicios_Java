package poo.calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public void iniciar(){
        Calculadora calculadora=new Calculadora();
        Scanner input = new Scanner(System.in);
        System.out.println("::::menu de operaciones matematicas::::");
        System.out.println("1.sumas");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division ");
        System.out.println("escoja una opcion:");
        int operacionMatematica=input.nextInt();

        if(operacionMatematica==1){
            System.out.println("digite el primer numero: ");
            int numero1= input.nextInt();
            System.out.println("digite el segundo numero: ");
            int numero2= input.nextInt();
            int resultadoSuma= calculadora.sumar(numero1,numero2);
            System.out.println("el resultado es "+resultadoSuma);

        } else if (operacionMatematica==2) {
            //resta
            System.out.println("digite el primer numero: ");
            int numero1= input.nextInt();
            System.out.println("digite el segundo numero: ");
            int numero2= input.nextInt();
            int resultadoresta= calculadora.restar(numero1,numero2);
            System.out.println("el resultado es "+resultadoresta);
        } else if (operacionMatematica==3) {
            //multiplicacion
            System.out.println("digite el primer numero: ");
            int numero1= input.nextInt();
            System.out.println("digite el segundo numero: ");
            int numero2= input.nextInt();
            int resultadomultiplicacion = calculadora.multiplicar(numero1,numero2);
            System.out.println("el resultado es "+resultadomultiplicacion);
        } else if (operacionMatematica==4) {
            //divide
            System.out.println("digite el primer numero: ");
            int numero1= input.nextInt();
            System.out.println("digite el segundo numero: ");
            int numero2= input.nextInt();
            int resultadodivision= calculadora.dividir(numero1,numero2);
            System.out.println("el resultado es "+resultadodivision);

        }
    }
}

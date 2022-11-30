package EjerciciosRecuperacion;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CasaDeCambio {
    public static void main(String[] args) {

        Float dolar[];
        Float euros[];
        Float yenes[];
       try {

        String n_cambio = JOptionPane.showInputDialog(null, "cuantos cambios de moneda desea realizar:",
                "numero de cambio", 1);
        JOptionPane.showMessageDialog(null, "numero de cambios a realizar " + n_cambio,
                "numero de cambios", 2);
        int n_cambios = Integer.parseInt(n_cambio);
        int contador_dolar = 0, contador_euros = 0, contador_yenes = 0;
        dolar = new Float[n_cambios];
        euros = new Float[n_cambios];
        yenes = new Float[n_cambios];

        for (int i = 1; i <= n_cambios; i++) {
            String[] botones = {"dolar", "euros", "yenes"};
            int opcion = JOptionPane.showOptionDialog(null, "Cambio # " + i + " \n que opcion de " +
                            "moneda decea convertir a pesos",
                    "opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
            switch (opcion) {
                case 0:
                    String n_dolares = JOptionPane.showInputDialog(null, "cuantos dolares vas a " +
                                    "convertir a pesos:",
                            "numero de dolares", 1);
                    JOptionPane.showMessageDialog(null, "Se cambiaran " + n_dolares + " dolares",
                            "numero de dolares", 2);
                    int n_dolar = Integer.parseInt(n_dolares);
                    float totalDolar = (n_dolar * 4800);
                    dolar[contador_dolar] = totalDolar;
                    contador_dolar = contador_dolar +1;
                    break;
                case 1:
                    String n_euros = JOptionPane.showInputDialog(null, "cuantos euros vas" +
                                    " a convertir a pesos:",
                            "numero de euros", 1);
                    JOptionPane.showMessageDialog(null, "Se cambiaran " + n_euros + " euros",
                            "numero de euros", 2);
                    int n_euro = Integer.parseInt(n_euros);
                    float totaleuros = (n_euro * 4950);
                    euros[contador_euros] = totaleuros;
                    contador_euros = contador_euros+1;
                    break;
                case 2:
                    String n_yenes = JOptionPane.showInputDialog(null, "cuantos yenes vas a " +
                                    "convertir a pesos:",
                            "numero de yenes", 1);
                    JOptionPane.showMessageDialog(null, "Se cambiaran " + n_yenes + " yenes",
                            "numero de yenes", 2);
                    int n_yen = Integer.parseInt(n_yenes);
                    float totalyenes = (n_yen * 7800);
                    yenes[contador_yenes] = totalyenes;
                    contador_yenes = contador_yenes+1;
                    break;
                default:
                    break;

            }
        }

        while (true) {
            String opcMenu = JOptionPane.showInputDialog(null, "MENU" +
                            "\n1.Promeedio de cambio de Dolares  Pesos" +
                            "\n2.Valor de cambio mas economico y mas costoso de euros a pesos" +
                            "\n3.valores de cambio de yenes a pesos ordenados de mayor a menor" +
                            "\n4.comparar las listas " +
                            "\n5.salir",
                    "menu", 1);
            int opcion_m = Integer.parseInt(opcMenu);
            if (opcion_m == 5) {
                break;
            }

            switch (opcion_m) {
                case 1:
                    float sumaDolar = 0;
                    for (int i=0;i<n_cambios;i++) {
                        float valor = 0;
                        if (dolar[i] != null){
                            valor = dolar[i];
                        }
                        sumaDolar = Float.sum(valor, sumaDolar);
                    }
                    float promedioDolar = sumaDolar / contador_dolar;

                    JOptionPane.showMessageDialog(null, "El promedio de dolares es : " + promedioDolar,
                            "numero de dolares", 2);
                    break;
                case 2:
                    var eurosSinNulos = Arrays.stream(euros).filter(number -> number!=null).toArray(Float[]::new);
                    Arrays.sort(eurosSinNulos);
                    JOptionPane.showMessageDialog(null,"El valor minimo de Euros es: "+eurosSinNulos[0]+
                            " y el mayor es de: "+eurosSinNulos[eurosSinNulos.length-1]);
                    break;
                case 3:
                    var yenesSinNulos = Arrays.stream(yenes).filter(number -> number!=null).toArray(Float[]::new);
                    Arrays.sort(yenesSinNulos,Collections.reverseOrder() );
                    JOptionPane.showMessageDialog(null,"los valores ordenados de mayor " +
                            "a menor son "+ Arrays.toString(yenesSinNulos));
                    break;
                case 4:
                    float sumaD = 0;
                    for (int i=0;i<n_cambios;i++) {
                        float valor = 0;
                        if (dolar[i] != null){
                            valor = dolar[i];
                        }
                        sumaD = Float.sum(valor, sumaD);
                    }
                    float sumaE = 0;
                    for (int i=0;i<n_cambios;i++) {
                        float valor = 0;
                        if (euros[i] != null){
                            valor = euros[i];
                        }
                        sumaE = Float.sum(valor, sumaE);
                    }
                    float sumaY = 0;
                    for (int i=0;i<n_cambios;i++) {
                        float valor = 0;
                        if (yenes[i] != null){
                            valor = yenes[i];
                        }
                        sumaY = Float.sum(valor, sumaY);
                    }
                    if (sumaD>sumaE && sumaD>sumaY){
                        JOptionPane.showMessageDialog(null,"la moneda con mayor recaudo es dolar "+ sumaD);
                    }else if (sumaE>sumaD && sumaE>sumaY){
                        JOptionPane.showMessageDialog(null,"la moneda con mayor recaudo es euros "+ sumaE);
                    }else {
                        JOptionPane.showMessageDialog(null,"la moneda con mayor recaudo es yenes "+ sumaY);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    break;

            }
        }

           JOptionPane.showMessageDialog(null,"Tatiana Hoyos" +
                   "\n cel:3117788511" +
                   "\nHasta pronto");


        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Opcion no valida",
                   "Error", JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
       }

    }

}

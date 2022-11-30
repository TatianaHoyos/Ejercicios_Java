package EjerciciosRecuperacion;
import javax.swing.*;
import java.util.*;
public class Examen {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        try {
            int cantidadCambios=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de cambios que va a hacer: "));
            int opcion=0, cantidadvecesDolares=0,cantidadvecesEuros=0,cabtidadDolares=0,totalDolarescambiados=0,cantidadEuros=0;
            int totalEuroscambiados=0,cantidadvecesYenes=0,cantidadYenes=0,totalYenescambiados=0,promDolares=0,sumaDolares=0;
            int mayorD=0,mayorE=0, mayorY=0,sumaYenes=0,sumaEuros=0,opciondos=0;
            int [] Dolares =new int[cantidadCambios];
            int [] Euros =new int[cantidadCambios];
            int [] Yenes =new int[cantidadCambios];
            ArrayList<Integer> EurosLista=new ArrayList<Integer>();
            ArrayList<Integer> YenesLista=new ArrayList<Integer>();
            for(int i=0; i<cantidadCambios;i++){

                opcion =Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n" +"1:Dolares a pesos\n" +
                        "2:Euros a pesos\n" +
                        "3:Yenes a pesos"));


                if (opcion==1){
                    cabtidadDolares=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Dolares que va a cambiar: "));
                    totalDolarescambiados=cabtidadDolares*4800;
                    Dolares[i]=totalDolarescambiados;
                } else if (opcion==2) {
                    cantidadEuros=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Euros que va a cambiar: "));
                    totalEuroscambiados=cantidadEuros*4950;
                    Euros[i]=totalEuroscambiados;
                    EurosLista.add(totalEuroscambiados);
                }else if(opcion==3){
                    cantidadYenes=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Yenes que va a cambiar: "));
                    totalYenescambiados=cantidadYenes*7800;
                    Yenes[i]=totalYenescambiados;
                    YenesLista.add(totalYenescambiados);
                }

            }
            sumaYenes=Arrays.stream(Yenes).sum();
            sumaDolares=Arrays.stream(Dolares).sum();
            sumaEuros=Arrays.stream(Euros).sum();
            promDolares=sumaDolares/Dolares.length;
            Collections.sort(EurosLista);
            Collections.sort(YenesLista,Collections.reverseOrder());
            do {
                opciondos=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n" +
                        "0:Salir\n" +
                        "1:promedio dolares cambiados\n" +
                        "2:menor y maximo de euros\n" +
                        "3:Ordenados mayor a menor los yenes cambiados"));

                switch (opciondos){
                    case 1:
                        JOptionPane.showMessageDialog(null,"El valor promedio de dolares es de "+promDolares+" $");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"El valor minimo de Euros es: "+EurosLista.get(0)+" y el mayor es de: "+EurosLista.get(EurosLista.size()-1));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Los Yenes ordenados: "+YenesLista);
                        break;
                    default:
                }
            }while (opciondos!=0);


            if (sumaDolares>sumaYenes){
                if (sumaDolares>sumaEuros){
                    JOptionPane.showMessageDialog(null,"El mayor recaudo fue los Dolares con un total de: "+sumaDolares);
                }

            } else if (sumaYenes>sumaDolares) {
                if (sumaYenes>sumaEuros){
                    JOptionPane.showMessageDialog(null,"El mayor recaudo fue  Yenes con un total: "+sumaYenes);
                }

            }else {
                JOptionPane.showMessageDialog(null,"El mayor recaudo es Euros con un total de: "+sumaEuros);
            }
            JOptionPane.showMessageDialog(null,"El creador fue el mejor\n" +
                    "Hugo Esteban Garzon Velandia\n" +
                    "3132798825\n" +
                    "Profe paseme ");
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe ingresar un numero: ");
        }

    }
}

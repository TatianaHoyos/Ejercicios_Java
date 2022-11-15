package Taller;

import java.util.Objects;
import java.util.Scanner;

public class AbarrotesMedellin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

            int suma=0, iva=0, descuento=0, totalPagar=0;
            System.out.println("cuantos produtos deseas comprar: ");
            int compraProducto= input.nextInt();
            String factura[][]=new String[compraProducto][4];
            for (int i=0; i<compraProducto; i++){
                System.out.println("digita el nombre de tu produto "+(i+1)+":");
                String nombreProducto= input.next();
                factura[i][0]=nombreProducto;
                System.out.println("digita la cantida de producto que esta comprando: ");
                int cantidadProducto=input.nextInt();
                factura[i][1]=Integer.toString(cantidadProducto);
                System.out.println("digita el valor de tu procduto por unida: ");
                int valorProcduto=input.nextInt();
                factura[i][2]=Integer.toString(valorProcduto);
                int totalProcduto=cantidadProducto*valorProcduto;
                factura[i][3]=Integer.toString(totalProcduto);
                suma+=totalProcduto;
                iva=suma*19/100;
            }
            System.out.println("PROCD |" + " CA.P | " + " VA.P |" + "  TO.P  |");
            for (int i=0; i<factura.length; i++){
                for (int j=0; j<factura[0].length; j++){
                    System.out.print(factura[i][j] +"  "+"  ");
                }
                System.out.println(" ");
            }
            System.out.println("El total de tus procdutos compradados es: "+suma);
            System.out.println("le iva esta al 19% de tu compra: "+iva);
            int totalIva=iva+suma;
            if (totalIva>=0 && totalIva<=100000){
                System.out.println("lo siento no tienes descuento");
                System.out.println("tu total a pagar es: "+totalIva);
            } else if (totalIva>100000 && totalIva<=500000){
                System.out.println("tiene un descuento del 20%");
                descuento=totalIva*20/100;
                totalPagar=totalIva-descuento;
                System.out.println("tu total a pagar despues del descuento es: "+totalPagar);
            } else if (totalIva>500000 && totalIva<=1000000) {
                System.out.println("tiene un descuento del 35%");
                descuento=totalIva*35/100;
                totalPagar=totalIva-descuento;
                System.out.println("tu total a pagar despues del descuento es: "+totalPagar);
            }
        }
    }



package TallerPoo.imc.modelo;

import TallerPoo.imc.controlador.ImcUsuarioCons;

import java.util.ArrayList;
import java.util.Scanner;

public class ImcUsuarioMet {
   static Scanner input=new Scanner(System.in);
   static ArrayList<ImcUsuarioCons>usuariosRegistrados=new ArrayList<>();
public static float peso=0,altura;
   public static int menu(){
       int opcion;
       System.out.println("""
               1. Registrar un usuario
               2. Listar los usuarios registrados
               3. Buscar un usuario determinado (Búsquedas por la
               Identificación)
               4. Modificar el registro de un usuario
               5. Eliminar el registro de un usuario.
               6. Calcular IMC: Importante informarle al usuario cuál es
               su clasificación según la tabla de IMC.
               7.cantidad de usuarios que son mayores de edad y cuantos son menores de edad.
               elija una opcion del menu:
               """);
       opcion= input.nextInt();
       return opcion;
   }
  public static void registrarUsuario(){

           System.out.println("ingrese nombres del usuario:");
           String nombre= input.next();
           System.out.println("ingresee apellidos del usuario:");
           String apellido= input.next();
           System.out.println("ingrese su numero de identificacion:");
           String identidad= input.next();
           System.out.println("ingrese su genero: Hombre o Mujer.");
           String genero= input.next();
           System.out.println("ingrese su edad:");
           int edad= input.nextInt();
           System.out.println("ingrese su peso:");
           peso= input.nextFloat();
           System.out.println("ingrese su altura:");
           altura= input.nextFloat();

           ImcUsuarioCons usuario = new ImcUsuarioCons(identidad,nombre,apellido,genero,edad,peso,altura);
       usuariosRegistrados.add(usuario);
       System.out.println("usuario registrado con exito.");
   }
  public static void listaUsuarios(){

       for (ImcUsuarioCons usuario: usuariosRegistrados) {
           System.out.println(usuario.toString());
       }
   }
  public static void buscarUsuario(){
    String buscar="0";
       System.out.println("ingrese la identificacion para buscar ususario.");
       String buscarIdenti= input.next();
       for (ImcUsuarioCons usuario:usuariosRegistrados) {
        if (usuario.getIdentidad().equals(buscarIdenti)){
            System.out.println("usuario encontrado "+ usuario.toString());
            buscar="1";
        }
       }
       if (buscar.equals("0")){
            System.out.println("usuario "+buscarIdenti+" No fue encontrado\n");
       }
   }
   public static void modificarUsuario(){
       String buscar="0";
       System.out.println("ingrese la identificacion para modificar un ususario.");
       String buscarIdenti= input.next();
       for (ImcUsuarioCons usuario:usuariosRegistrados) {
           if (usuario.getIdentidad().equals(buscarIdenti)){
               System.out.println("usuario encontrado "+ usuario.toString());
               buscar="1";
               System.out.println("ingrese nuevos nombres del usuario:");
               String nombre= input.next();
               System.out.println("ingrese nuevos apellidos del usuario:");
               String apellido= input.next();
               System.out.println("ingrese nuevo numero de identificacion:");
               String identidad= input.next();
               System.out.println("ingrese su genero: Hombre o Mujer.");
               String genero= input.next();
               System.out.println("ingrese su edad:");
               int edad= input.nextInt();
               System.out.println("ingrese su peso:");
               float peso= input.nextFloat();
               System.out.println("ingrese su altura:");
               float altura= input.nextFloat();

               usuario.setNombre(nombre);
               usuario.setApellido(apellido);
               usuario.setIdentidad(identidad);
               usuario.setGenero(genero);
               usuario.setEdad(edad);
               usuario.setPeso(peso);
               usuario.setAltura(altura);

               System.out.println("usuario actualizado con exito.");
           }
       }
       if (buscar.equals("0")){
           System.out.println("usuario "+buscarIdenti+" No fue encontrado\n");
       }
   }
   public static void eliminarUsuario(){
       String buscar="0";
       System.out.println("ingrese la identificacion para eliminar un ususario.");
       String buscarIdenti= input.next();
       for (ImcUsuarioCons usuario:usuariosRegistrados) {
           if (usuario.getIdentidad().equals(buscarIdenti)){
               System.out.println("usuario encontrado "+ usuario.toString());

               System.out.println("esta seguro de elimar el usuario: si/no");
               String opc=input.next();
               String eliminar=opc.toUpperCase();
                if ("si".equals(eliminar)){
                    usuariosRegistrados.remove(usuario);
                    buscar="1";
                    System.out.println("usuario eliminado exitosamenete.");
                    break;

                }else {
                    System.out.println("opcion anulada.");
                }
           }
       }
       if (buscar.equals("0")){
           System.out.println("usuario "+buscarIdenti+" No fue encontrado\n");
       }
   }
   public static void imcUsuario(){
       String buscar="0";
       System.out.println("ingrese la identificacion para imc de un ususario.");
       String buscarIdenti= input.next();
       for (ImcUsuarioCons usuario:usuariosRegistrados) {
           if (usuario.getIdentidad().equals(buscarIdenti)){
               System.out.println("usuario encontrado "+ usuario.toString());
               double imc=(peso/altura);
               System.out.printf("su IMC es de : %.1f %n", imc);
              buscar="1";
              if (imc<18.5){
                  System.out.println("usted se encuentra bajo de peso.");
              } else if (imc>=18.5 && imc<24.9) {
                  System.out.println("su peso es normal");
              }else if (imc>=25 && imc<29.9){
                  System.out.println("ustd se encuentra en sobrepeso");
              }else if (imc>=30 && imc<34.9){
                  System.out.println("ustd se encuentra en obecidad TIPO 1");

              }else if (imc>=35 && imc<=39.9){
                  System.out.println("ustd se encuentra en obecidad TIPO 2");
              }else if (imc>=40){
                  System.out.println("ustd se encuentra en obecidad TIPO 3");
              }
           }
           }
       if (buscar.equals("0")){
           System.out.println("usuario "+buscarIdenti+" No fue encontrado\n");
       }
    }
    public static void usuariosMenoresyMayores(){
        int contadorMenor=0,contadorMayor=0;
        for (ImcUsuarioCons usuario:usuariosRegistrados) {
            if (usuario.getEdad()<18){
                contadorMenor=contadorMenor+1;
            }else {
                contadorMayor=contadorMayor+1;
            }
        }
        System.out.println("usuarios menores de edad : "+contadorMenor + " usuarios");
        System.out.println("usuarios mayores de edad : "+contadorMayor + " usuarios");
    }
}




package poo.carro;

public class Carro {
    Motor motor=new Motor();
    Rueda rueda1= new Rueda();
    Rueda rueda2= new Rueda();
    Rueda rueda3= new Rueda();
    Rueda rueda4= new Rueda();
    Puerta puerta1= new Puerta();
    Puerta puerta2= new Puerta();

    void carroParadoConLlantaDesinflada(){
        motor.apagar();
        puerta1.cerrar();
        puerta2.cerrar();
        puerta1.ventana.abrir();
        puerta2.ventana.abrir();
        rueda1.inflar();
        rueda2.desinflar();
        rueda3.inflar();
        rueda4.inflar();
    }

}

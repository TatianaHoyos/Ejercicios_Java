package poo;

import poo.calculadora.MainCalculadora;
import poo.carro.MainCarro;

public class Main {
    public static void main(String[] args) {
        MainCalculadora mainCalculadora= new MainCalculadora();
        mainCalculadora.iniciar();
        MainCarro mainCarro= new MainCarro();
        mainCarro.iniciar();
    }

}
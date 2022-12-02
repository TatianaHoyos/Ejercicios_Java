package TallerPoo.electrodomesticos.modelo;

import TallerPoo.electrodomesticos.modelo.ElectrodomesticosCons;

public class TelevisorCons extends ElectrodomesticosCons {
    private  int precioVenta;
    private float consumoEnergetico, pesoKg;

    public TelevisorCons(int precioVenta, float consumoEnergetico, float pesoKg, int referencia, String marca, int modelo, String color) {
        super(referencia,modelo,marca,color);
        this.precioVenta = precioVenta;
        this.consumoEnergetico = consumoEnergetico;
        this.pesoKg = pesoKg;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(float consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public String toString() {
        return "" +
                "precioVenta=" + precioVenta +"\n"+
                "consumoEnergetico=" + consumoEnergetico + "\n"+
                "pesoKg=" + pesoKg +"\n"+
                super.toString() +
                "";
    }
}

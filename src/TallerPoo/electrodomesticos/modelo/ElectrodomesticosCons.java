package TallerPoo.electrodomesticos.modelo;

public class  ElectrodomesticosCons{
   private int referencia,modelo ;
   private String marca, color;

    public ElectrodomesticosCons(int referencia, int modelo, String marca, String color) {
        this.referencia = referencia;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "" +
                "referencia=" + referencia +  "\n" +
                " modelo=" + modelo +  "\n"+
                " marca='" + marca +  "\n" +
                " color='" + color +  "\n" +
                "";
    }
}

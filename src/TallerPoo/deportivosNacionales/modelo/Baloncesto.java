package TallerPoo.deportivosNacionales.modelo;

public class Baloncesto extends Deportes {
    private int nIntegrantes;
    private double puntuacion;

    public Baloncesto(int nIntegrantes, double puntuacion,int referencia, String departamento, int nombreDeporte) {
        super(referencia,departamento,nombreDeporte);
        this.nIntegrantes = nIntegrantes;
        this.puntuacion = puntuacion;
    }

    public int getnIntegrantes() {
        return nIntegrantes;
    }

    public void setnIntegrantes(int nIntegrantes) {
        this.nIntegrantes = nIntegrantes;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "" +
                "nIntegrantes=" + nIntegrantes +'\n' +
                "puntuacion=" + puntuacion +'\n' +
                super.toString() +
                "";
    }
}

package TallerPoo.deportivosNacionales;

public class Natacion extends Deportes {
    private int numeroIntegrantes;
    private double tiempoEstimado;
    private int categoria;

    public Natacion(int numeroIntegrantes, double tiempoEstimado, int categoria,
                    int referencia, String departamento, String nombreDeporte) {
        super(referencia,departamento,nombreDeporte);
        this.numeroIntegrantes = numeroIntegrantes;
        this.tiempoEstimado = tiempoEstimado;
        this.categoria = categoria;
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }

    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    public double getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(double tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "" +
                "numeroIntegrantes=" + numeroIntegrantes +'\n' +
                "tiempoEstimado=" + tiempoEstimado +'\n' +
                "categoria='" + categoria + '\n' +
                super.toString() +

                "";
    }
}

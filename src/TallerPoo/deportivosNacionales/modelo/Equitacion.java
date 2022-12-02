package TallerPoo.deportivosNacionales.modelo;

import TallerPoo.deportivosNacionales.modelo.Deportes;

public class Equitacion extends Deportes {
    private String nombreEquipo;
    private float velocidad;
    private int categoria;

    public Equitacion(String nombreEquipo, float velocidad, int categoria,
                      int referencia,String departamento, int nombreDeporte) {
        super(referencia,departamento,nombreDeporte);
        this.nombreEquipo = nombreEquipo;
        this.velocidad = velocidad;
        this.categoria = categoria;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
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
                "nombreEquipo=" + nombreEquipo + '\n' +
                "velocidad=" + velocidad + '\n' +
                "categoria=" + categoria + '\n' +
                super.toString() +
                "";
    }
}

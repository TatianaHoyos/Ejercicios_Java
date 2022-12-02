package TallerPoo.sena.modelo;

public class Aprendiz {
   private int identificacion,programa;
   private String nombre, apellido, genero;
   private double puntajeIcfes;

    public Aprendiz(int identificacion, String nombre, String apellido, String genero, int programa, double puntajeIcfes) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.programa = programa;
        this.puntajeIcfes = puntajeIcfes;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrograma() {
        return programa;
    }

    public void setPrograma(int programa) {
        this.programa = programa;
    }

    public double getPuntajeIcfes() {
        return puntajeIcfes;
    }

    public void setPuntajeIcfes(double puntajeIcfes) {
        this.puntajeIcfes = puntajeIcfes;
    }

    @Override
    public String toString() {
        return "" +
                "identificacion=" + identificacion +'\n'+
                "nombre=" + nombre + '\n' +
                "apellido=" + apellido + '\n' +
                "genero=" + genero + '\n' +
                "programa=" + programa + '\n' +
                "puntajeIcfes=" + puntajeIcfes +'\n'+
                "";
    }
}


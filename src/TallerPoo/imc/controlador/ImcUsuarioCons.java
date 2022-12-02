package TallerPoo.imc.controlador;

public class ImcUsuarioCons {
    private String identidad;
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    private float peso;
    private float altura;
    public ImcUsuarioCons(String identidad, String nombre, String apellido, String genero, int edad, float peso, float altura) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
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

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {

        return "" +
                " identidad=" + identidad + "\n" +
                " nombre=" + nombre + "\n" +
                " apellido=" + apellido + "\n" +
                " genero=" + genero + "\n" +
                " edad=" + edad + "\n" +
                " peso=" + peso + "\n" +
                " altura=" + altura +"\n"+
                "";
    }
}

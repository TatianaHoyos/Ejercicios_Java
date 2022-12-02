package TallerPoo.deportivosNacionales.modelo;

public class Deportes {
   private int referencia,    nombreDeporte;
    ;
   private String departamento;

    public Deportes(int referencia, String departamento, int nombreDeporte) {
        this.referencia = referencia;
        this.departamento = departamento;
        this.nombreDeporte = nombreDeporte;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(int nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    @Override
    public String toString() {
        return "" +
                "referencia= " + referencia +'\n'+
                "departamento= " + departamento +'\n'+
                "nombreDeporte= " + obtenerNombreD( nombreDeporte )+ '\n' +
                "";
    }

    private String obtenerNombreD(int nombreDeporte){
        if (nombreDeporte==1){
            return "Natacion";
        } else if (nombreDeporte==2) {
            return "Baloncesto";
        } else {
            return "Equitacion";
        }
    }
}

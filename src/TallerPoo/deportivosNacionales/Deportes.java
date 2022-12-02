package TallerPoo.deportivosNacionales;

public class Deportes {
   private int referencia;
   private String nombreDeporte,departamento;

    public Deportes(int referencia, String departamento, String nombreDeporte) {
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

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    @Override
    public String toString() {
        return "" +
                "referencia=" + referencia +'\n'+
                "departamento=" + departamento +'\n'+
                "nombreDeporte=" + nombreDeporte + '\n' +
                "";
    }
}

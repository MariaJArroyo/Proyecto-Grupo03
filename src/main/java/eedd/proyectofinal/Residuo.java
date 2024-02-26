
package eedd.proyectofinal;


public class Residuo {
    private String nombreResiduo;
    private String tipoResiduo;

    public Residuo(String nombreResiduo, String tipoResiduo) {
        this.nombreResiduo = nombreResiduo;
        this.tipoResiduo = tipoResiduo;
    }

    public String getNombreResiduo() {
        return nombreResiduo;
    }

    public void setNombreResiduo(String nombreResiduo) {
        this.nombreResiduo = nombreResiduo;
    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    @Override
    public String toString() {
        return "[residuo: "+this.nombreResiduo+" y tipo de residuo: "+this.tipoResiduo+"]";
    }
    
    
}


package eedd.proyectofinal;


public class ProductoReciclado {
    
    private int ID;
    private String descripcion;
    private String materialBase;
    private int numeroLote;
    private String FechaProduccion;

    public ProductoReciclado(int ID, String descripcion, String materialBase, int numeroLote, String FechaProduccion) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.materialBase = materialBase;
        this.numeroLote = numeroLote;
        this.FechaProduccion = FechaProduccion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterialBase() {
        return materialBase;
    }

    public void setMaterialBase(String materialBase) {
        this.materialBase = materialBase;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getFechaProduccion() {
        return FechaProduccion;
    }

    public void setFechaProduccion(String FechaProduccion) {
        this.FechaProduccion = FechaProduccion;
    }
    
    public String imprimirDetalle(){
        return "El producto reciclado tiene un id:  "+this.ID+", su material base es de: "+this.materialBase+ ", su descripcion es: "+this.descripcion
                +" y su numero de lote es: "+this.numeroLote;
    }
    
    
    
    
    
}

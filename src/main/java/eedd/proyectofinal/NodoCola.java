package eedd.proyectofinal;

public class NodoCola {

     private NodoCola atras;
     private ProductoReciclado elemento;
     private Residuo residuo;

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

    public ProductoReciclado getElemento() {
        return elemento;
    }

    public void setElemento(ProductoReciclado elemento) {
        this.elemento = elemento;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    
    
     
     
}

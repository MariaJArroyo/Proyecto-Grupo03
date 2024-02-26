
package eedd.proyectofinal;

public class NodoP {
    private Residuo elemento;
    private NodoP siguiente;
    
    public NodoP() {
        this.siguiente = null;
    }
    
    public Residuo getElemento() {
        return elemento;
    }

    public void setElemento(Residuo elemento) {
        this.elemento = elemento;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString() {
        return this.elemento.toString();
    }
    
    
}

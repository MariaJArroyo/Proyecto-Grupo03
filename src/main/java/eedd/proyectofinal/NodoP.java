/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eedd.proyectofinal;

/**
 *
 * @author SaidL
 */
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
    
    public String mostrarElemento(){
        return elemento.impriprimirResiduo();
    }
    
    
}

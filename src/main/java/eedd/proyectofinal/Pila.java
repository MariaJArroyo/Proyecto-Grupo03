/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eedd.proyectofinal;

/**
 *
 * @author SaidL
 */
public class Pila {
    private NodoP cima;
    
    public boolean esVacia(){
        if (cima==null) {
          return true;  
        }else{
            return false;
        }
    }
    
        public void apilar(Residuo nuevoResiduo){ //Apilar
        NodoP nuevo = new NodoP();
        nuevo.setElemento(nuevoResiduo);
        
        if (esVacia()) {
          cima = nuevo;
          
        }else{
          nuevo.setSiguiente(cima);
          cima = nuevo;
        }
    }
        
    public String imprimirPila(){
        String respuesta = "";
        
        if (esVacia()) {
            respuesta = "Pila vacia, no se pueden imprimir elementos";
        }else{
            NodoP auxiliar = cima;
            while (auxiliar != null) {                
                respuesta +=auxiliar.mostrarElemento()+ "\n";
                auxiliar  = auxiliar.getSiguiente();
            }
        }
        return respuesta;
    }
        
}

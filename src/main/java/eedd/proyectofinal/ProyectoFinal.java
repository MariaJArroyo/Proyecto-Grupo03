package eedd.proyectofinal;

public class ProyectoFinal {

    public static void main(String[] args) {
      
        
        Residuo residuo1 = new Residuo("Periodico", "Papel");
        Residuo residuo2 = new Residuo("Frutas", "Organico");
        Residuo residuo3 = new Residuo("Varillas", "Acero");
        Pila pila1 = new Pila();
        
        pila1.apilar(residuo1);
        pila1.apilar(residuo2);
        pila1.apilar(residuo3);

        System.out.println(pila1.imprimirPila());
        
        pila1.extraerPilarParaInsertarEnCola("Periodico");
        
        
        
        
        
        
        
        
        
    }
}

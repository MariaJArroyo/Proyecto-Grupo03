package eedd.proyectofinal;

public class Pila {

    private NodoP cima;

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar(Residuo nuevoResiduo) { //Apilar
        NodoP nuevo = new NodoP();
        nuevo.setElemento(nuevoResiduo);

        if (esVacia()) {
            cima = nuevo;

        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public NodoP Pila() {
        NodoP auxiliar = null;
        if (esVacia()) {
            System.out.println("Pila vacía, no se pueden extraer elementos");
        } else {
            auxiliar = cima;
            cima = cima.getSiguiente();
        }    
          return auxiliar;
    }
    

    public String imprimirPila() {
        String respuesta = "";
        if (esVacia()) {
            respuesta = "Pila vacia, no se pueden imprimir elementos";
        } else {
            NodoP auxiliar = cima;
            while (auxiliar != null) {
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        return respuesta;
    }

    public void extraerPilarParaInsertarEnCola(Cola colaParaInsertar , String Nombre) {
        String respuesta = "";
        if (esVacia()) {
            respuesta = "La pila se encuentra vacía, no se puede extraer ningún elemento";
        } else {
           
            NodoP auxiliar = cima;
            NodoP anterior = null;
            while (auxiliar != null) {
                if (auxiliar.getElemento().getNombreResiduo() == Nombre) {
                    respuesta = "Se ha extraído el elemento: " + auxiliar.getElemento().getNombreResiduo();
                    auxiliar = null;
                    anterior = cima;
                } else {
                    respuesta = "No se ha encontrado ningún elemento con ese nombre";
                    auxiliar = auxiliar.getSiguiente();
                }
            }      
            NodoCola nuevoNodoCola = new NodoCola();
            nuevoNodoCola.setResiduo(auxiliar.getElemento());
            colaParaInsertar.Encolar(nuevoNodoCola);
        }
        System.out.println(respuesta);
    }
    
    @Override
    public String toString() {
        String respuesta = "Lista de residuos: \n";
        NodoP auxiliar = cima;
        while (auxiliar != null) {
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
        }
        return respuesta;
    }

    

}


package eedd.proyectofinal;


public class Cola {
    private NodoCola frente;
    private NodoCola ultimo;
    private Residuo residuo;

    public NodoCola getFrente() {
        return frente;
    }

    public void setFrente(NodoCola frente) {
        this.frente = frente;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola ultimo) {
        this.ultimo = ultimo;
    }

    public boolean esVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }
    
     public void Encolar(Cola nuevoNodoCola) {
        NodoCola nuevo = new NodoCola();
        nuevo.setResiduo(nuevoNodoCola);
        if (esVacia()) {
            frente = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setAtras(nuevo);// al ultimo actual le asigno un nuevo nodo
            ultimo = nuevo;// y luego el nodo nuevo se convierte en el ultimo
        }
    }
}

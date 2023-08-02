
package Estructura_Orden;

import proyecto.Objetos.Ingrediente;

 //Creacion de los atributos de la clase Nodo pila ingrediente Agg//
public class NodoPila_ingredienteAgregado {
    
    private Ingrediente ingrediente;
    private NodoPila_ingredienteAgregado siguiente;

    public NodoPila_ingredienteAgregado(Ingrediente ingrediente, NodoPila_ingredienteAgregado siguiente) {
        this.ingrediente = null;
        this.siguiente = null;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public NodoPila_ingredienteAgregado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila_ingredienteAgregado siguiente) {
        this.siguiente = siguiente;
    }
    
    
  
    
}

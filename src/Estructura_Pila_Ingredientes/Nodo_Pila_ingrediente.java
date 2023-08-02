
package Estructura_Pila_Ingredientes;

import proyecto.Objetos.Ingrediente;

//Atributos y constructores//
public class Nodo_Pila_ingrediente {
    
    private Ingrediente ingrediente;
    private Nodo_Pila_ingrediente siguiente;

    public Nodo_Pila_ingrediente(Ingrediente ingrediente, Nodo_Pila_ingrediente siguiente) {
        this.ingrediente = null;
        this.siguiente = null;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Nodo_Pila_ingrediente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Pila_ingrediente siguiente) {
        this.siguiente = siguiente;
    }
    
    
  
}


package Estructura_Orden;

import proyecto.Objetos.Ingrediente;

 //Creacion de los atributos de la clase Nodo pila ingrediente Agg//
public class NodoPila_ingredienteAgregado {
    
    private Ingrediente ingrediente;
    private NodoPila_ingredienteAgregado siguiente;

    public NodoPila_ingredienteAgregado(Ingrediente ingrediente, 
            NodoPila_ingredienteAgregado siguiente) {
        this.ingrediente = null;
        this.siguiente = null;
        
    }
    //creacion de metodo gets and setter//

    NodoPila_ingredienteAgregado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

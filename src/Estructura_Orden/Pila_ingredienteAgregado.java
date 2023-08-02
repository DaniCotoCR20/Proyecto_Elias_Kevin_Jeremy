
package Estructura_Orden;


public class Pila_ingredienteAgregado {
    
    private NodoPila_ingredienteAgregado cima;
    private int largo;
    
    
    public boolean Vacia(){
        return cima == null;
        
    }

    public int tamanio(){
    return this.largo;
}

    
    
}

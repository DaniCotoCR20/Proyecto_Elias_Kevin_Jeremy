
package proyecto.Objetos;


public class Hamburguesa {
   
    //Creacion hamburguesa//
  
    private String tipo;
    private Pila_Ingrediente pila_ingredientes = new Pila_Ingrediente();
    private int puntos;

    //Creacion del constructor lleno//
    
    public Hamburguesa(String tipo, int puntos) {
        this.tipo = tipo;
        this.puntos = puntos;
    }

    //Creacion de getts and setters//
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pila_Ingrediente getPila_ingredientes() {
        return pila_ingredientes;
    }

    public void setPila_ingredientes(Pila_Ingrediente pila_ingredientes) {
        this.pila_ingredientes = pila_ingredientes;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    

    
}

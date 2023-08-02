
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
    
    

    
}

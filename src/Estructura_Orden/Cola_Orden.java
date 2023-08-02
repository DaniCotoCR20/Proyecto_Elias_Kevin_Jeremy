
package Estructura_Orden;


public class Cola_Orden {
  
     //Creacion de la clase orden y sus atributos//
    
    private NodoCola_Orden frente;
    private NodoCola_Orden ultimo;
    private int largo;

    //Metodo que me mujestra el tamanio y el largo de la cola
    
    public int tamanio() {
        return largo;
    }

    //Metodo que me muestra si la cola esta vacia o no//
    
    public boolean Vacia() {
        return frente == null;
    }
    
    
}

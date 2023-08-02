
package Estructura_Orden;

import proyecto.Objetos.Orden;

public class NodoCola_Orden {
    //Creacion de atributos del Nodo Cola Orden
   private Orden Orden;
   private NodoCola_Orden atras;
   
   //Creacion de metodos Constructores.
   public NodoCola_Orden(){
       this.Orden = null;
       this.atras = null;
   }
   
   //Creacion de gets
    public Orden getOrden() {
        return Orden;
    }
    public NodoCola_Orden getAtras() {
        return atras;
    }
    
    //Creacion de setters
    public void setOrden(Orden Orden) {
        this.Orden = Orden;
    }
    public void setAtras(NodoCola_Orden atras) {
        this.atras = atras;
    }
    
    
   
}

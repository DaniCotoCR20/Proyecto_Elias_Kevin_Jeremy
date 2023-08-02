
package Estructura_Orden;

import proyecto.Objetos.orden;

public class NodoCola_Orden {
    //Creacion de atributos del Nodo Cola Orden
   private orden Orden;
   private NodoCola_Orden atras;
   
   //Creacion de metodos Constructores.
   public NodoCola_Orden(){
       this.Orden = null;
       this.atras = null;
   }
   
   //Creacion de gets
    public orden getOrden() {
        return Orden;
    }
    public NodoCola_Orden getAtras() {
        return atras;
    }
    
    //Creacion de setters
    public void setOrden(orden Orden) {
        this.Orden = Orden;
    }
    public void setAtras(NodoCola_Orden atras) {
        this.atras = atras;
    }
    
   
}

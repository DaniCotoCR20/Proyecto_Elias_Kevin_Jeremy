
package Estructura_Orden;

import proyecto.Objetos.orden;

public class NodoCola_Orden_Finalizada {

    //Atributos 
    private orden Orden;
    private NodoCola_Orden_Finalizada atras;

    //Constructor
    public NodoCola_Orden_Finalizada(orden Orden, 
            NodoCola_Orden_Finalizada atras) {
        this.Orden = Orden;
        this.atras = atras;
    }

    //Getters
    public orden getOrden() {
        return Orden;
    }
    public NodoCola_Orden_Finalizada getAtras() {
        return atras;
    }
    
    //Setters
    public void setOrden(orden Orden) {
        this.Orden = Orden;
    }
    public void setAtras(NodoCola_Orden_Finalizada atras) {
        this.atras = atras;
    }
    
    
    
    
}

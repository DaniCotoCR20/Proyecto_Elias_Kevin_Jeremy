
package Estructura_Orden;

import proyecto.Objetos.Orden;

public class NodoCola_Orden_Finalizada {

    //Atributos 
    private Orden Orden;
    private NodoCola_Orden_Finalizada atras;

    //Constructor
    public NodoCola_Orden_Finalizada(Orden Orden, 
            NodoCola_Orden_Finalizada atras) {
        this.Orden = Orden;
        this.atras = atras;
    }

    //Getters
    public Orden getOrden() {
        return Orden;
    }
    public NodoCola_Orden_Finalizada getAtras() {
        return atras;
    }
    
    //Setters
    public void setOrden(Orden Orden) {
        this.Orden = Orden;
    }
    public void setAtras(NodoCola_Orden_Finalizada atras) {
        this.atras = atras;
    }
    
    
    
    
}

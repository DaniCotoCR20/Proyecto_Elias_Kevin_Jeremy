
package Estructura_Orden;

import proyecto.Objetos.orden;

public class NodoCola_Orden_Finalizada {

    //Atributos 
    private orden Orden;
    private NodoCola_Orden_Finalizada atras;

    public NodoCola_Orden_Finalizada(orden Orden, 
            NodoCola_Orden_Finalizada atras) {
        this.Orden = Orden;
        this.atras = atras;
    }
    
    
}

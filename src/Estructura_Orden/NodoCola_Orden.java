
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
}

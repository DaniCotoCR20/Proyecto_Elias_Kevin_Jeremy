
package proyecto.Objetos;

//Creacion de la clase orden sus respectivos atributos//

import Estructura_Orden.Pila_ingredienteAgregado;


public class orden {
    //Atributos de la clase orden//
    private int id;
    private Hamburguesa hamburguesa;
    private Pila_ingredienteAgregado pila_ingredienteAgregado
            = new Pila_ingredienteAgregado();
    private boolean finalizada;

    public orden() {
    }

    public orden(int id, Hamburguesa hamburguesa) {
        this.id = id;
        this.hamburguesa = hamburguesa;
        this.finalizada = false;
        
    }

    
    
    
            
    
           
}


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public Pila_ingredienteAgregado getPila_ingredienteAgregado() {
        return pila_ingredienteAgregado;
    }

    public void setPila_ingredienteAgregado(Pila_ingredienteAgregado 
            pila_ingredienteAgregado) {
        this.pila_ingredienteAgregado = pila_ingredienteAgregado;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return "orden{" + "id=" + id + ", hamburguesa=" + hamburguesa + 
                ", pila_ingredienteAgregado=" + pila_ingredienteAgregado + ", "
                + "finalizada=" + finalizada + '}';
    }
    
    
            
    
           
}

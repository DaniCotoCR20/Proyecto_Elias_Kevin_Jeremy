
package proyecto.Objetos;


public class Ingrediente {
  //Creacion de atributos
    private int id;
    private String nombre;
    private boolean agregado;
    
  //Creacion del metodo vacio  
    public Ingrediente(){
    }

  //Constructor lleno
    public Ingrediente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.agregado=false;
    }
    
    
}

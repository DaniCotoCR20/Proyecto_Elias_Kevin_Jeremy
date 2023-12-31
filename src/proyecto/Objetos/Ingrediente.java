
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
    
  //Get Atributos
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAgregado() {
        return agregado;
    }
    
    //Set Atributos
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    //ToString
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}

package proyecto.Objetos;

public class Jugador {

    //Creacion de los atributos de jugador//
    private String id;
    private int puntos;
    private int record;
    private String password;

    public Jugador() {
    }

    public Jugador(String id, int puntos, int record, String password) {
        this.id = id;
        this.puntos = puntos;
        this.record = record;
        this.password = password;
    }

   //Creacion de getts and setters//
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   //Creacion del toString//
    
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", puntos=" + puntos 
                + ", record=" + record + ", password=" + password + '}';
    }

    
    
    
}

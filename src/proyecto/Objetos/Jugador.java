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

}

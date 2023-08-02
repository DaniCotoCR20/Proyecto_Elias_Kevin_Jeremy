package Estructura_Orden;

public class Cola_Orden {

    //Creacion de la clase orden y sus atributos//
    private NodoCola_Orden frente;
    private NodoCola_Orden ultimo;
    private int largo;

    //Metodo que me mujestra el tamanio y el largo de la cola
    public int tamanio() {
        return largo;
    }

    //Metodo que me muestra si la cola esta vacia o no//
    public boolean Vacia() {
        return frente == null;
    }

    //Creacion del metodo encolar una orden//
//     public void encola(Orden orden) {
//
//        NodoCola_Orden newNodo = new NodoCola_Orden();
//        newNodo.setOrden(orden);
//
//        if (Vacia()) {
//            frente = newNodo;
//            ultimo = newNodo;
//        } else {
//            ultimo.setAtras(newNodo);
//            ultimo = newNodo;
//        }
//        largo++;
//
//    }
//    
    //Creacion del metodo que vacia la cola//
// public void VaciarCola() {
//        while (tamanio() != 0) {
//            atiendeOrden();
//        }
//    }
   
    
    //Creacion de metodo buscar una orden//
    
    
//    public boolean search(int id) {
//        // Crea una copia de la cola.
//        NodoCola_Orden aux = frente;
//        // Bandera para verificar si exist el elemento a search.
//        boolean exist = false;
//        // Recorre la pila hasta llegar encontrar el node o llegar al final
//        // de la pila.
//        while (exist != true && aux != null) {
//            // Compara si el value del node es igual que al de referencia.
//            if (id == aux.getOrden().getId()) {
//                // Cambia el value de la bandera.
//                exist = true;
//            } else {
//                // Avanza al siguiente node.
//                aux = aux.getAtras();
//            }
//        }
//        // Retorna el value de la bandera.
//        return exist;
//    }

    

        //Creacion del metodo atiende la orden//

//    public Orden atiendeOrden() {
//        NodoCola_Orden aux = frente;
//        Orden orden = aux.getOrden();
//        if (frente != null) {
//            frente = frente.getAtras();
//            aux.setAtras(null);
//            largo--;
//        }
//        return orden;
//    }
    
    
    
    
}

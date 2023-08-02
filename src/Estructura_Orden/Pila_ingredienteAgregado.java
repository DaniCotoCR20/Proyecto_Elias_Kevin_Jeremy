package Estructura_Orden;

import proyecto.Objetos.Ingrediente;

public class Pila_ingredienteAgregado {

    private NodoPila_ingredienteAgregado cima;
    private int largo;

    public boolean Vacia() {
        return cima == null;

    }

    public int tamanio() {
        return this.largo;
    }

    public void push(Ingrediente ingrediente) {
        NodoPila_ingredienteAgregado newNodo = 
                new NodoPila_ingredienteAgregado();
        newNodo.setIngrediente(ingrediente);
        if (Vacia()) {
            cima = newNodo;
        } else {
            newNodo.setSiguiente(cima);
            cima = newNodo;

        }
        largo++;
    }

}

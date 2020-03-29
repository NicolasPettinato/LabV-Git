import jdk.nashorn.internal.ir.visitor.NodeOperatorVisitor;

import java.util.List;

public class Pila<T> {
    private Nodo<T> lista;

    public Pila(){
        this.lista = null;
    }

    // push : Agrega un elemento a la Pila
    public void push(T nodo){
        Nodo<T> nuevoNodo = new Nodo<>(nodo);
        if(this.lista == null){
            this.lista = nuevoNodo;
        }
        else{
            if (this.lista.getNext() == null){
                this.lista.setNext(nuevoNodo);
            }else{
                Nodo<T> nodoAux = this.lista.getNext();
                while (nodoAux.getNext() !=null) {
                    nodoAux = nodoAux.getNext();
                }
                nodoAux.setNext(nuevoNodo);
            }
        }
    }

    // pop : Tomar el primer elemento de la pila y lo devuelve

    public T pop(){
        T elemento = null;

        if (this.lista !=null){
            if (this.lista.getNext() == null){
                elemento = this.lista.getNodo();
                this.lista = null;
            }
            else{
                Nodo<T> ant = this.lista;
                Nodo<T> aux = ant.getNext();
                this.lista = null;
                this.push(ant.getNodo());
                while (ant.getNext() != null){
                    this.push(aux.getNodo());
                    ant = aux.getNext();
                    aux = aux.getNext();
                }
                ant.setNext(null);
                elemento = aux.getNodo();

            }
        }
        return elemento;
    }


    //size : Cuenta la cantidad de elementos que hay en la Pila

    public int size(){
        int size = 0;

        if(this.lista !=null){
            Nodo<T> aux = this.lista;
            size = 1;
            while (aux.getNext() !=null){
                size ++;
                aux = aux.getNext();
            }
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nElementos:\n");
        Nodo reco = lista;
        while (reco!=null) {
            sb.append(reco.getNodo()+"\n");
            reco=reco.getNext();
        }
        sb.append("\n");
        return sb.toString();
    }
}
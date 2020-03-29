public class Nodo<T> {
    private T nodo;
    private Nodo<T> next;


    public Nodo(T nodo){
        this.nodo = nodo;
        this.next = null;
    }

    public T getNodo(){
        return nodo;
    }

    public void setNodo(T nodo) {
        this.nodo = nodo;
    }

    public void setNext(Nodo<T> next){
        this.next = next;
    }

    public Nodo<T> getNext(){
        return this.next;
    }

}

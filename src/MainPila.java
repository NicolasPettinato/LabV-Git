public class MainPila {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(2);
        //System.out.println(pila);
        pila.push(21);
        //System.out.println(pila);
        pila.push(-1);

        System.out.println(pila);

        int tamaño = pila.size();
        System.out.println(tamaño);

        System.out.println(pila.pop());

        int tamaño2 = pila.size();
        System.out.println(tamaño2);
    }

}

public class MainPila {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(2);
        //System.out.println(pila);
        pila.push(35);
        //System.out.println(pila);
        pila.push(10);
        //System.out.println(pila);
        pila.push(50);

        System.out.println(pila);

        System.out.println("Tamaño: " + pila.size());

        System.out.println("Elemento eliminado: " + pila.pop());

        System.out.println("Tamaño: " + pila.size());
        System.out.println("\n");
        System.out.println(pila);

    }

}

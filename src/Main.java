public class Main {
    public static void main(String[] args) {
        ClaseGenerica<Persona> a = new ClaseGenerica<>();

        a.add(new Persona(25));
        a.add(new Persona(43));
        a.add(new Persona(30));
        a.add(new Persona(17));

        System.out.println(a.verifyExist(new Persona(30)));

        System.out.println(a.verifyExist(new Persona(42)));

        System.out.println(a.getMax());

        System.out.println(a.getMin());

        Persona p = null;

        p = a.delete();

        System.out.println(p);

    }
}

import java.util.Objects;

public class Persona implements Comparable {
    private int edad;

   public Persona(int edad){
       this.edad = edad;
   }

   public int getEdad(){
       return this.edad;
   }

   @Override
    public int compareTo(Object x) {
        if (!(x instanceof Persona)){
            return -1;
        }
        Persona o = (Persona) x;
        if(this.edad == o.getEdad()){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Contenedor.Persona{" + "edad=" + edad + '}';
    }


}

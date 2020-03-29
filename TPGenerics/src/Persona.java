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
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || !(o instanceof Persona)) return false;

        Persona persona = (Persona) o;

        return Integer.compare(persona.edad, edad) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad);
    }

    @Override
    public int compareTo(Object x) {
        if (!(x instanceof Persona)){
            return -1;
        }
        Persona o = (Persona)x;
        if(this.edad>o.getEdad()){
            return 1;
        }
        else{
            if(this.edad == o.getEdad()){
                return 0;
            }
            else{
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "Contenedor.Persona{" + "edad=" + edad + '}';
    }


}

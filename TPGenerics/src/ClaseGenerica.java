import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClaseGenerica <T extends Comparable> {

    private List<T> list;

    public ClaseGenerica(){
        this.list = new ArrayList<>();
    }

    public void add(T objeto){
        this.list.add(objeto);
    }

    public  boolean verifyExist(T objeto){

        return this.list.contains(objeto);
    }

    public T getMax(){
       /* T max = null;
        if (!this.list.isEmpty()) {
            max = this.list.get(0);
            for (T e : this.list) {
                if (max.compareTo(e) < 0) max = e;
            }
        }
        return max; */
        return (T) Collections.max(this.list);
    }

    public T getMin(){
        /*T min = null;
        if (!this.list.isEmpty()) {
            min = this.list.get(0);
            for (T e : this.list) {
                if (min.compareTo(e) > 0) min = e;
            }
        }
        return min;*/
        return (T) Collections.min(this.list);
    }

    public T delete(){
        return this.list.remove(this.list.size() - 1);
    }

    @Override
    public String toString(){
        return "Contenedor{" + "list=" + list + '}';
    }

    public int getSize(){
        return this.list.size();
    }
}

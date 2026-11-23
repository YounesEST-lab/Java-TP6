import java.util.ArrayList;

public class Pile extends Stack{
    public Pile(){
        super();
    }
    public int pop() throws IllegalStateException{
        if (!structure.isEmpty()) {
            int tmp=structure.getLast();
            structure.removeLast();
            return tmp;
        }
        else {
            throw new IllegalStateException("Structure Vide");
        }
    }
}

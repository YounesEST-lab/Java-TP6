import java.util.ArrayList;

public class File extends Stack{
    public File(){
        super();
    }
    public int pop(){
        if (!structure.isEmpty()) {
            int tmp=structure.getFirst();
            structure.removeFirst();
            return tmp;
        }
        else {
            throw new IllegalStateException("Structure Vide");
        }
    }

}

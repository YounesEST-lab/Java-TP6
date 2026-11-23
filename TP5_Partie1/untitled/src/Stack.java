import java.util.*;
public abstract class Stack implements IStack{

    ArrayList<Integer> structure;
    public Stack(){
        this.structure=new ArrayList<>();
    }
    public void push(int x){
        structure.add(x);
    };
    public boolean isEmpty(){
        return (structure.isEmpty());
    }
    public int size(){
        return structure.size();
    }
    public void erase(){
        structure.removeAll(structure);
    }
}

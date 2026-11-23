public class TestStructures {
    public static void main(String[] args) {
        IStack pile = new Pile();
        IStack file = new File();
        for (int x = 10; x <= 30; x += 10) {
            pile.push(x);
            file.push(x);
        }
        int a = pile.pop(), b = pile.pop();
        System.out.println("Pile : pop() -> " + a + ", puis " + b
                + " ; size() -> " + pile.size());
        a = file.pop();
        b = file.pop();
        System.out.println("File : pop() -> " + a + ", puis " + b
                + " ; size() -> " + file.size());
        pile.erase();
        file.erase();
        System.out.println("Après erase() : " + pile.isEmpty()
                + " / " + file.isEmpty());
        try {
            pile.pop();
        } catch (IllegalStateException e) {
            System.out.println("pop() sur une pile vide -> " + e.getMessage());
        }
    }
}

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        SchulNotenStack iStack = new SchulNotenStack();
        iStack.push(Note.EINS);
        iStack.push(Note.ZWEI);
        iStack.push(Note.DREI);
        iStack.push(Note.VIER);
        iStack.push(Note.FUENF);
        iStack.push(Note.SECHS);
        System.out.println("Oberste Zahl: " + iStack.peek());
        System.out.println("");
        System.out.println("Stack abbauen:");
        while (!iStack.isEmpty()) // Ausgabe 4 3 2 1
        {
            System.out.println(iStack.pop().beschreibung);
        }
        try
        {
            iStack.pop(); // Exception, denn der Stack ist leer.
        }
        catch (EmptyStackException e)
        {
            System.out.println("Fehler.");
        }
    }
}
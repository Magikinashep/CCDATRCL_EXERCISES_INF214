import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {

        Queue<String> Fullname = new LinkedList<>();
        // Enqueue 5 of your classmates in this section
        Fullname.add("Dapitillo, Kean John");
        Fullname.add("Bantegui, Moses Christian");
        Fullname.add("Calalang, Victor Vinnie Lars");
        Fullname.add("John Matthew Banto");
        Fullname.add("Estimadora, Jhon Texter");

        // Get the size of the queue
        System.out.println(Fullname.size());

        // Get the front of the queue
        System.out.println(Fullname.peek());

        // Dequeue 5 of your classmates 
        Fullname.remove();
        Fullname.remove();
        Fullname.remove();
        Fullname.remove();
        Fullname.remove();

        //Enqueue another 5 of you classmates
        Fullname.add("Monte de Ramos, Mariel");
        Fullname.add("Masangcay, Jenina Velle");
        Fullname.add("Cinco, Brandon Kenneth");
        Fullname.add("Rifarial, Neil");
        Fullname.add("Legaspi, Carlos Leslie");

        // Display all elements of the queue.
        System.out.println(Fullname.size());
       
        // Get the front of the queue
        System.out.println(Fullname.peek());

        // Display all elements of the queue
        System.out.println(Fullname);
    }
}

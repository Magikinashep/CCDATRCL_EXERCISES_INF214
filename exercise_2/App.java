import java.util.LinkedList;
class App {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        
        Playlist.add("Ain't no rest for the wicked");
        Playlist.add("The worlds smallet Violin");
        Playlist.add("Imahe");
        Playlist.add("Snowman");
        Playlist.add("For the longest time");

       
        Playlist.addFirst("How deep is your life");

        
        
        Playlist.addLast("Save your tears");

        
        System.out.println(Playlist.get(0));

       
        Playlist.set(6, "Enemy");

        
        Playlist.remove(0);

        
        System.out.println("Updated playlist: " + Playlist);
    
    }
}

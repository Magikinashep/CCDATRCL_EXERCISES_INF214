public class App {
    public static void main(String[] args) throws Exception {
        // Create root node A
        Node A = new Node("President.Vargas");
        // Create node B
        Node B = new Node("VicePresident.Dapitilio");
        // Create node C
        Node C = new Node("Secretary.Lalo");
        // Create node D
        Node D = new Node("Muse.Labon");
        // Create node E
        Node E = new Node("Escort.Aranilla");
        // Create node F
        Node F = new Node("Treasurer.Legaspi");
        // Create node G
        Node G = new Node("AnotherImportantPerson.Verzosa");

        // Set left and right child of root node A
        A.left = B;
        A.right = C;

        // Set left and right child of node B
        B.left = D;
        B.right = E;

        // Set left and right child of node C
        C.left = F;
        C.right = G;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(A);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(A);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(A);

    }
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}

package mindtek.collections;

public class MainTest {
    public static void main(String[] args) {

        //   LinkedList linkedList = new LinkedList();

        Node fNode = new Node(5);
        Node sNode = new Node(7);
        Node tNode = new Node(10);
        Node eNode = new Node(11);

        fNode.next = sNode;
        sNode.next = tNode;
        fNode.next = eNode;
        eNode.next = sNode;
        printList(fNode);
        addValueToEachNode(5, fNode);
        printList(fNode);


    }

    private static void addValueToEachNode(int i, Node node) {
        Node current = node;
        while(current!=null) {
            current.data = current.data + i;
            current = current.next;
        }
    }

    private static void printList (Node node){
            Node current = node;
        while(current!=null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        }
    }


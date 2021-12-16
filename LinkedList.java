public class LinkedList {

    private class Node {
        private double element;
        private Node next;

        private Node(double element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node head = null;
    
    public void insert(double element) {
        head = new Node(element, head);
    }
}

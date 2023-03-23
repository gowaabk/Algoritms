import java.util.Random;

class LinkedList {
    private Node head;

    class Node {
        private int value;
        private Node nextNode;
    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        node.nextNode = head;
        head = node;
    }
    // Вывод списка
    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + ", ");
            node = node.nextNode;
        }
        System.out.println();
    }
    // Генерация случайного списка.
    public void generateRandomList(int size) {

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            this.addFirst(random.nextInt(size));
        }

    }

    public void reverseList() {
        Node prev = null;
        Node current = this.head;
        Node next;

        while (current != null) {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }

        this.head = prev;
    }
}

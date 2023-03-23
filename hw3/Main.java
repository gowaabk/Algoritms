// Домашнее задание "Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор)."


public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.generateRandomList(10);
        System.out.println("Исходный список: ");
        list.printList();
        list.reverseList();
        System.out.println("Перевернутый список: ");
        list.printList();
    }

    
}


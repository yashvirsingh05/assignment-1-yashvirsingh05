package Linkedlist;
public class LinkedListDefinitionClass {
    private Node<E> head = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    private Node<E> getNode(int index) {
        Node<E> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }
}


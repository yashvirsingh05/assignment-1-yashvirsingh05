package Linkedlist;

public interface LinkedListADTInterface<E> {
    void add(E item);

    E remove();

    int search(E item);

    void print();

}

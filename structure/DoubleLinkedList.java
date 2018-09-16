package Structure;

public class DoubleLinkedList<L>{

    private DoubleLinkedNode<L> head;
    private DoubleLinkedNode<L> tail;
    private int size;

    // SE GENERAN LOS GETTERS AND SETTER
    public DoubleLinkedNode<L> getHead() {
        return head;
    }

    public void setHead(DoubleLinkedNode<L> head) {
        this.head = head;
    }

    public DoubleLinkedNode<L> getTail() {
        return tail;
    }

    public void setTail(DoubleLinkedNode<L> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void insert(L elemento) {
        if (isEmpty()) {
            head = new DoubleLinkedNode<>(elemento);
            tail = head;
            size++;
        } else {
            tail.setNext(new DoubleLinkedNode<>(elemento));
            tail.getNext().setPrev(tail);
            tail = tail.getNext();
            size++;
        }
    }

    public L consult(L elemento) {
        DoubleLinkedNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement() == elemento) {
                break;
            }
            else {
                temp = temp.getNext();
            }
        }
        return temp.getElemento();
    }


    public void update(L primerElemento, L finalElemento) {
        DoubleLinkedNode<L> temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(primerElemento)) {
                temp.setElement(finalElemento);
                break;
            } else {
                temp = temp.getNext();
            }
        }
    }


    private void frontDelete() {
        DoubleLinkedNode<L> temp = head;
        head = head.getNext();
        temp.setNext(null);
        head.setPrev(null);
        size--;
    }


    private void rearDelete() {
        DoubleLinkedNode<L> temp = tail;
        tail = tail.getPrev();
        temp.setPrev(null);
        tail.setNext(null);
        size--;
    }


    private void deleteUniqueElement(L elemento) {
        if (head.getElemento().equals(elemento)) {
            head = null;
            tail = head;
            size--;
        }
    }


    private void deleteOnTowElements(L elemento) {
        if (head.getElemento().equals(elemento)) {
            frontDelete();
        } else if (tail.getElement().equals(elemento)) {
            rearDelete();
        }
        size--;
    }


    private void deleteOnMiddle(L elemento) {
        DoubleLinkedNode<L> temp;
        DoubleLinkedNode<L> tempNext, tempPrev;
        temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(elemento)) {
                tempPrev = temp.getPrev();
                tempNext = temp.getNext();
                tempNext.setPrev(tempPrev);
                tempPrev.setNext(tempNext);
                temp.setNext(null);
                temp.setPrev(null);
                break;
            } else {
                temp = temp.getNext();
            }
        }
        size--;
    }


    public void delete(L elemento) {
        if (!isEmpty()) {
            if (tail.getElemento().equals(elemento)) {
                rearDelete();
            } else if (head.getElemento().equals(elemento)) {
                frontDelete();
            } else if (size == 1) {
                deleteUniqueElement(elemento);
            } else if (size == 2) {
                deleteOnTowElements(elemento);
            } else if (size >= 3) {
                deleteOnMiddle(elemento);
            }
        }
    }


    public String toString() {
        String msg = "";
        DoubleLinkedNode<L> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString() + "\n";
            temp = temp.getNext();
        }
        return msg;
    }

    public String toStringReverse() {
        String msg = "";
        DoubleLinkedNode<L> temp = tail;
        for (int i = 0; i < size; i++) {
            msg += temp.toString() + "\n";
            temp = temp.getPrev();
        }
        return msg;
    }
}

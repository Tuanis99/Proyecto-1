package book;

import structure.LinkedList;
import structure.LinkedListNode;

public class BookManagement {

    private LinkedList<Book> Libros;
    private LinkedListNode<Book> Libro;
    private Object Libro1;
    private int IDComp;

    //gets y sets de la lista
    public LinkedList<Book> getLibros() {
        return Libros;
    }

    public void setLibros(LinkedList<Book> Libros) {
        this.Libros = Libros;
    }

    //Constructor
    public BookManagement() {
        this.Libros = new LinkedList<>();
    }

    public void Crear(int ID, int CantidadVendida, int CantidadDisponible, int precio, String nombre, String tema, String descripcion) {
        Book nuevoLibro = new Book(ID, CantidadVendida, CantidadDisponible, precio, nombre, tema, descripcion);
        this.Libros.insert(nuevoLibro);

    }

    public void delete(int entID) {
        if (Libros.getSize() == 0) {
            System.out.println("Lista vacía");
        }
        LinkedListNode<Book> temp = Libros.getHead();
        Book Libro2 = temp.getElement();
        IDComp = Libro2.getID();
        if (IDComp == entID) {
            temp.setNextNode(temp);
        } else {
            temp.getNextNode();

        }

    }

    public String Consultar() {
        return Libros.toString();
    }

    public void Modificar() {
        //codigodemodificar
    }

}


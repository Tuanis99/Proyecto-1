package user;

import Servicios.CodeGenerator;
import Structure.DoubleLinkedList;

public class User { 
    //Atributos de la clase
    private String nombre, direccion, correoelectronico, libros,dni,cedula,telefono;
    private CodeGenerator codeGenerator;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getLibros() {
        return libros;
    }

    public void setLibros(String libros) {
        this.libros = libros;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public User(String nombre, String direccion, String correoelectronico, String libros, String cedula, String telefono, CodeGenerator codeGenerator) {
        this.codeGenerator = new CodeGenerator(5);
        this.dni= "User-"+codeGenerator.generateCode();
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoelectronico = correoelectronico;
        this.libros = libros;
        this.cedula = cedula;
        this.telefono = telefono;   
    }

    @Override
    public String toString() {
        return "User{" + "nombre=" + nombre + ", direccion=" + direccion + ", correoelectronico=" + correoelectronico + ", libros=" + libros + ", dni=" + dni + ", cedula=" + cedula + ", telefono=" + telefono+ '}';
    }
} 

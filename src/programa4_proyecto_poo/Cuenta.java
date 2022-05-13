/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa4_proyecto_poo;

/**
 *
 * @author ernes
 */
public class Cuenta {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double cantidad;

    public Cuenta(String nombre, String apellido, int edad, double cantidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cantidad = cantidad;
    }

    public Cuenta() {
    }

    public Cuenta(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
     
}

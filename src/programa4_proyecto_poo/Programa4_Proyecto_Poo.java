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
public class Programa4_Proyecto_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta cuenta001 = new Cuenta ("Ernesto", "Estanislao", 10, 100.0);
        
        Cuenta cuenta002 = new Cuenta();
        cuenta002.setApellido("Estanislao");
        cuenta002.setNombre("Ernesto");
        cuenta002.setEdad(20);
        cuenta002.setCantidad(456.89);
        
        System.out.println(cuenta002.getNombre());
        System.out.println(cuenta002.getApellido());
        System.out.println(cuenta002.getEdad());
        System.out.println(cuenta002.getCantidad());
    }
    
}

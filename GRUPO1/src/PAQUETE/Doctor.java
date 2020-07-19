/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE;

/**
 *
 * @author KEVIN EDUARDO ZELAYA
 */
public class Doctor {
    //Nombre del ciudadano
    public String nombre;
    private String años;
    private int edad;
    
    public Doctor(String nombre,String años){
    this.nombre = nombre;
    this.años = años;
    
    }

    public Doctor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void imprimirAños(){
    System.out.println(años);
    } 
     public void estableserEdad( int _edad){
    this.edad = _edad;
    }
    
    public int obtenerEdad(){
        return edad;
}

    
    
}

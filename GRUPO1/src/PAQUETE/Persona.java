/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE;

/**
 *
 * @author JAIRO PINEDA
 */
public abstract class Persona {
    
    //ATRIBUROS
    private String nombre;
    private String apellido;
    private String edad;
    
    //METODOS    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return this.apellido;
    }    
    public void setEdad(String edad){
        this.edad=edad;
    }
    public String getEdad(){
        return this.edad;
    }  
    public void imprimirNombre(){
        System.out.println(nombre);
    }
    public void imprimirApellido(){
        System.out.println(apellido);
    }
    public void imprimirEdad(){
        System.out.println(edad);
    }
    abstract String setInformacionProfecion();
    
}

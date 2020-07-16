/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo1;

import PAQUETE.Deportista;
import PAQUETE.Doctor;

/**
 *
 * @author JAIRO PINEDA
 */
public class GRUPO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //INSTANCIA DE CLASES
         Doctor doctor = new Doctor();
         Deportista deportista = new Deportista();
         
         //INSTRUCCION DE IMPRESION DOCTOR
          System.out.println(doctor.setInformacionProfecion();
          doctor.imprimirNombre();
          doctor.imprimirApellido();
          doctor.imprimirEdad();
          System.out.println("");
          
          //INSTRUCCION DE IMPRESION DEPORTISTA
          System.out.println(deportista.setInformacionProfecion();
          deportista.imprimirNombre();
          deportista.imprimirApellido();
          deportista.imprimirEdad();
          System.out.println("");
         
         
         
    }
    
}

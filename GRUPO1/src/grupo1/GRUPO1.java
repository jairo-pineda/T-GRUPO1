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
         Doctor doctor = new Doctor("Kevin Zelaya","25");
         Deportista deportista = new Deportista("Jairo pineda","27");
         
         //INSTRUCCION DE IMPRESION DOCTOR
          System.out.println(doctor);
          doctor.estableserEdad(30);
          
          System.out.println("Jairo Pineda");
          
          //INSTRUCCION DE IMPRESION DEPORTISTA
          System.out.println(deportista);
          
          System.out.println("Kevin ZElaya");
          deportista.estableserEdad(25);
         
         
         
    }
    
}

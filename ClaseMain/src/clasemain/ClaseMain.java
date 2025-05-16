/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasemain;

import gijon.Xixones;
import java.util.ArrayList;
import oviedo.Carbayon;



/**
 *
 * @author coova
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Xixones persona = new Xixones("Xixones");
       //se imprime el objeto para comprobar que se visualiza correctamente.
       System.out.println(persona);
       persona.comerCachopo("Cecina");
       persona.beberSidra();
       persona.viajarEnCoche("Me gusta viajar");
       persona.viajarEnAvion();
       persona.entrarPlaya(20.2);
       Carbayon persona2 = new Carbayon(2.2, "Ovetense");
       persona2.beberSidra();
       persona2.alquilarPiso();
       //para ver si el anterior metodo ha funcionado lo imprimo por pantalla.
        System.out.println(persona2);
        persona2.viajarEnCoche("Me encanta esta cancion");
        persona2.viajarEnAvion();
        
        //Se comprueban los metodos de la clase coleccion
        Colecciones lista = new Colecciones();
    
        
        lista.crearVector();
        lista.crearMatriz();
        
        
      
    }
    
}

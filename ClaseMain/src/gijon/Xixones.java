/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gijon;

import java.util.Scanner;

/**
 *
 * @author coova
 */
public class Xixones extends Asturiano implements Iciudadano, Iplayista {

    public Xixones(String gentilicio) {
        super(gentilicio);
    }

    @Override
    public int beberSidra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres un culin");
      
        String respuesta = sc.nextLine();
        if (respuesta.contains("si") && (respuesta.contains("s"))) {
          return 20;
        } else
           return 0;
       
    }

    @Override
    public void viajarEnCoche(String cadena) {
        System.out.println("me gusta la radio " + cadena);
    }

    @Override
    public void viajarEnAvion() {
        System.out.println("Acordarse de los pasaportes");
    }

    @Override
    public boolean entrarPlaya(double num) {
        if (num >= 15.5) {
            System.out.println("Temperatura agradable");
            return true;

        } else {
            System.out.println("Demasiado fria");
            return false;
        }

    }
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oviedo;

import gijon.Asturiano;
import gijon.Iciudadano;

/**
 *
 * @author coova
 */
public class Carbayon extends Asturiano implements Iciudadano{

   double dinero;

    public Carbayon(double dinero, String gentilicio) {
        super(gentilicio);
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }


    @Override
    public int beberSidra() {
        System.out.println("Gracias no quiero mas");
       return 1;
    }
    public void alquilarPiso(){
      double nuevoImporte = this.getDinero()*3;
      this.setDinero(nuevoImporte);
    }

    @Override
    public void viajarEnCoche(String cadena) {
        System.out.println("Cantar cancion" + cadena);
    }

    @Override
    public void viajarEnAvion() {
        System.out.println("Mirar la television");
    }

    @Override
    public String toString() {
        return "Carbayon{" + "dinero=" + dinero + "gentilicio=" + gentilicio + '}';
    }
    
}

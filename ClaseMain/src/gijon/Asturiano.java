/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gijon;

/**
 *
 * @author coova
 */
public abstract class Asturiano {
    protected String gentilicio;
    public abstract int beberSidra();
    public void comerCachopo(String cadena){
        System.out.println("Comiendo un cachopo de: " + cadena);
    }

    public Asturiano(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }
    //genero el tostring para en la main poder reflejar el gentilicio de los objetos creados.

    @Override
    public String toString() {
        return "Asturiano{" + "gentilicio=" + gentilicio + '}';
    }
    
    
}

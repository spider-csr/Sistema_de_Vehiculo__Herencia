/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author maldo
 */
public class Moto extends Vehiculo {

    private double Cilindraje;

    public Moto(double Cilindraje, String Marca, String Modelo) {
        super(Marca, Modelo);
        this.Cilindraje = Cilindraje;
    }

    public double getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(double Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public String Imprimir_Moto() {
        return "        MOTO        " + "\n" + "MODELO: " + getMarca() + "\n"
                + "MARCA: " + getModelo() + "\n"
                + "CILINDRAJE" + Cilindraje;
    }

}

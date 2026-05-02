/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author maldo
 */
public class Auto extends Vehiculo {

    private int Numero_de_Puertas;

    public Auto(String Marca, String Modelo) {
        super(Marca, Modelo);
    }

    public Auto(int Numero_de_Puertas, String Marca, String Modelo) {
        super(Marca, Modelo);
        this.Numero_de_Puertas = Numero_de_Puertas;
    }

    public int getNumero_de_Puertas() {
        return Numero_de_Puertas;
    }

    public void setNumero_de_Puertas(int Numero_de_Puertas) {
        this.Numero_de_Puertas = Numero_de_Puertas;
    }

    public String Imprimir_Auto() {
        return "MARCA: " + getMarca() + "\n"
                + "MODELO: " + getModelo() + "\n"
                + "NÚMERO DE PUERTAS: " + Numero_de_Puertas;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Entidades.Moto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maldo
 */
public class TLista_Moto {

    public static List<Moto> Lista_Moto = new ArrayList<>();

    public static void Insertar_Moto(Moto mo) {
        Lista_Moto.add(mo);
    }

    public static void Eliminar(Moto mo) {
        Lista_Moto.remove(mo);
    }

    public static DefaultTableModel Visualizar() {
        String[] Titulos = {"MARCA", "MODELO", "CILINDRAJE"};
        String[] Datos = new String[3];
        DefaultTableModel dt = new DefaultTableModel(null, Titulos);

        for (int i = 0; i < Lista_Moto.size(); i++) {
            Datos[0] = Lista_Moto.get(i).getMarca();
            Datos[1] = Lista_Moto.get(i).getModelo();
            Datos[2] = String.valueOf(Lista_Moto.get(i).getCilindraje());
            dt.addRow(Datos);
        }
        return dt;

    }

}

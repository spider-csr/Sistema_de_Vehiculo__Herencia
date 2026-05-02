/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Entidades.Auto;
import Entidades.Moto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maldo
 */
public class TLista_Auto {

    public static List<Auto> Lista_Auto = new ArrayList<>();

    public static void Insertar(Auto op) {
        Lista_Auto.add(op);
    }

    public static void Eliminar(Auto op) {
        Lista_Auto.remove(op);
    }

    public static DefaultTableModel Visualizar_Auto() {
        String[] Titulos = {"MARCA", "MODELO", "N° DE PUERTAS"};
        String[] Datos = new String[3];
        DefaultTableModel dt = new DefaultTableModel(null, Titulos);

        for (int i = 0; i < Lista_Auto.size(); i++) {
            Datos[0] = Lista_Auto.get(i).getMarca();
            Datos[1] = Lista_Auto.get(i).getModelo();
            Datos[2] = String.valueOf(Lista_Auto.get(i).getNumero_de_Puertas());
            dt.addRow(Datos);
        }
        return dt;

    }

}

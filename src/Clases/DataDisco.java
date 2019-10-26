/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author DANIEL LUNA
 */
public class DataDisco {
    
    
    public ArrayList<String> infoDisco() {
        File file = new File(System.getProperty("user.dir"));
        Long total = file.getTotalSpace();
        Long libre = file.getFreeSpace();
        Long usado = total - libre;
        ArrayList<String> datos = new ArrayList();
        datos.add("Espacio Total: ");
        datos.add(total.toString());
        datos.add("Espacio Libre: ");
        datos.add(libre.toString());
        datos.add("Espacio Usado: ");
        datos.add(usado.toString());
        datos.add("Unidades: ");
        File drives[] = File.listRoots();
        for (File drive : drives) {
            datos.add(drive.toString());
        }
        return datos;
    }
    
    public DefaultListModel modelData(){
        DefaultListModel mol = new DefaultListModel();
        for (int i = 0; i < infoDisco().size(); i += 2) {
            mol.addElement(infoDisco().get(i) + "  " + infoDisco().get(i + 1));
        }
        return mol;
    }
}

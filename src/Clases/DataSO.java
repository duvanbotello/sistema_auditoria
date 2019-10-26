/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.hyperic.sigar.OperatingSystem;

/**
 *
 * @author DANIEL LUNA
 */
public class DataSO {
    OperatingSystem so;

    public DataSO() {
        so = OperatingSystem.getInstance();
    }
    
    public ArrayList<String> infoSO() {
        ArrayList<String> datos = new ArrayList();
        datos.add("Descripcion: ");
        datos.add(so.getDescription());
        datos.add("Nombre: ");
        datos.add(so.getVendorName());
        datos.add("Version: ");
        datos.add(so.getVersion());
        datos.add("Arquitectura: ");
        datos.add(so.getArch());
        datos.add("Usuario: ");
        datos.add(System.getProperty("user.name"));
        datos.add("Directorio del Usuario: ");
        datos.add(System.getProperty("user.home"));
        return datos;
    }
    
    public DefaultListModel modelData(){
        DefaultListModel mol = new DefaultListModel();
        for (int i = 0; i < infoSO().size(); i += 2) {
            mol.addElement(infoSO().get(i) + "  " + infoSO().get(i + 1));
        }
        return mol;
    }
}

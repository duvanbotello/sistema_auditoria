/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import GUI.Prueba;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.hyperic.sigar.NetInfo;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 *
 * @author DANIEL LUNA
 */
public class DataRed {
    Sigar s;
    NetInterfaceConfig net;
    NetInfo info;

    public DataRed() {
        s = new Sigar();
        try {
            net = s.getNetInterfaceConfig(null);
            info = s.getNetInfo();
        } catch (SigarException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> infoRed() {
        ArrayList<String> datos = new ArrayList();
        datos.add("IP primaria: ");
        datos.add(net.getAddress());
        datos.add("Mac primaria: ");
        datos.add(net.getHwaddr());
        datos.add("Host: ");
        datos.add(info.getHostName());
        return datos;
    }
    
    public DefaultListModel modelData(){
        DefaultListModel mol = new DefaultListModel();
        for (int i = 0; i < infoRed().size(); i += 2) {
            mol.addElement(infoRed().get(i) + "  " + infoRed().get(i + 1));
        }
        return mol;
    }

}

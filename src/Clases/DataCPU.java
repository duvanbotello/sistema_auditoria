/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 *
 * @author DANIEL LUNA
 */
public class DataCPU {
    Sigar s;

    public DataCPU() {
        s = new Sigar();
    }
    
    public ArrayList<String> infoCPU() {
        ArrayList<String> datos = new ArrayList();
        try {
            CpuInfo cpu[] = s.getCpuInfoList();
            CpuInfo data = cpu[0];
            datos.add("Vendedor: ");
            datos.add(data.getVendor());
            datos.add("Modelo: ");
            datos.add(data.getModel());
            datos.add("Mhz: ");
            datos.add("" + data.getMhz());
            if (data.getCacheSize() != Sigar.FIELD_NOTIMPL) {
                datos.add("Tamaño de Cache: ");
                datos.add("" + data.getCacheSize());
            }
            if ((data.getTotalCores() != data.getTotalSockets()) || (data.getCoresPerSocket() > data.getTotalCores())) {
                datos.add("CPU´s Fisicas: ");
                datos.add("" + data.getTotalSockets());
                datos.add("Nucleos por CPU: ");
                datos.add("" + data.getCoresPerSocket());
            }

        } catch (SigarException e) {
        }
        return datos;
    }
    
    public DefaultListModel modelData(){
        DefaultListModel mol = new DefaultListModel();
        for (int i = 0; i < infoCPU().size(); i += 2) {
            mol.addElement(infoCPU().get(i) + "  " + infoCPU().get(i + 1));
        }
        return mol;
    }

    
}

package GUI;

import Clases.Conexion;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.NetInfo;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 *
 * @author DANIEL LUNA
 */
public class Prueba extends javax.swing.JFrame {

    OperatingSystem so;
    Sigar s;
    NetInterfaceConfig net;
    NetInfo info;

    DefaultListModel mol1;
    DefaultListModel mol2;
    DefaultListModel mol3;
    DefaultListModel mol4;

    public Prueba() {
        initComponents();
        setLocationRelativeTo(null);

        Conexion conexion = new Conexion();

        so = OperatingSystem.getInstance();
        s = new Sigar();
        try {
            net = s.getNetInterfaceConfig(null);
            info = s.getNetInfo();
        } catch (SigarException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }

        mol1 = new DefaultListModel();
        mol2 = new DefaultListModel();
        mol3 = new DefaultListModel();
        mol4 = new DefaultListModel();

//        informacion SO
        for (int i = 0; i < infoSO().size(); i += 2) {
            mol1.addElement(infoSO().get(i) + "  " + infoSO().get(i + 1));
        }
        lista1.setModel(mol1);

//        informacion CPU
        for (int i = 0; i < infoCPU().size(); i += 2) {
            mol2.addElement(infoCPU().get(i) + "  " + infoCPU().get(i + 1));
        }
        lista2.setModel(mol2);

//        informacion Disco
        for (int i = 0; i < infoDisco().size(); i += 2) {
            mol3.addElement(infoDisco().get(i) + "  " + infoDisco().get(i + 1));
        }
        lista3.setModel(mol3);

//        informacion Red
        for (int i = 0; i < infoRed().size(); i += 2) {
            mol4.addElement(infoRed().get(i) + "  " + infoRed().get(i + 1));
        }
        lista4.setModel(mol4);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lista1 = new javax.swing.JList();
        lista2 = new javax.swing.JList();
        lista3 = new javax.swing.JList();
        lista4 = new javax.swing.JList();
        titulo = new javax.swing.JLabel();
        imp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lista1.setBackground(new java.awt.Color(204, 204, 204));
        lista1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Sistema Operativo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 102, 102))); // NOI18N
        lista1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lista1.setToolTipText("");
        jPanel2.add(lista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 390, 190));

        lista2.setBackground(new java.awt.Color(204, 204, 204));
        lista2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "CPU", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 102, 102))); // NOI18N
        lista2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lista2.setToolTipText("");
        jPanel2.add(lista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 390, 190));

        lista3.setBackground(new java.awt.Color(204, 204, 204));
        lista3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Disco", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 102, 102))); // NOI18N
        lista3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lista3.setToolTipText("");
        jPanel2.add(lista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 390, 190));

        lista4.setBackground(new java.awt.Color(204, 204, 204));
        lista4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Red", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 102, 102))); // NOI18N
        lista4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lista4.setToolTipText("");
        jPanel2.add(lista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 390, 190));

        titulo.setBackground(new java.awt.Color(204, 204, 204));
        titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 153, 153));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Informe.");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imp.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        imp.setForeground(new java.awt.Color(255, 255, 255));
        imp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/re.png"))); // NOI18N
        imp.setBorder(null);
        imp.setContentAreaFilled(false);
        imp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/re1.png"))); // NOI18N
        imp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imp)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(102, 102, 102))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void impActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impActionPerformed

    }//GEN-LAST:event_impActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton imp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList lista1;
    private javax.swing.JList lista2;
    private javax.swing.JList lista3;
    private javax.swing.JList lista4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

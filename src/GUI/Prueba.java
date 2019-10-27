package GUI;

import Clases.Conexion;
import Clases.DataCPU;
import Clases.DataDisco;
import Clases.DataRed;
import Clases.DataSO;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DANIEL LUNA
 */
public class Prueba extends javax.swing.JFrame {

    Conexion conexion;
    DataSO dso;
    DataCPU dcpu;
    DataDisco dsc;
    DataRed dred;

    public Prueba() {
        initComponents();
        setLocationRelativeTo(null);

        conexion = new Conexion();
        dso = new DataSO();
        dcpu = new DataCPU();
        dsc = new DataDisco();
        dred = new DataRed();

//        informacion SO
        lista1.setModel(dso.modelData());

//        informacion CPU
        lista2.setModel(this.modelData());
//
//        informacion Disco
//        lista3.setModel(dsc.modelData());
//
//        informacion Red
        lista4.setModel(this.modelDataRed());
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        imp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/re.png"))); // NOI18N
        imp.setBorder(null);
        imp.setContentAreaFilled(false);
        imp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/re1.png"))); // NOI18N
        imp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar Equipo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(592, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imp)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void impActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impActionPerformed

    }//GEN-LAST:event_impActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            int idauditoria = Integer.parseInt(JOptionPane.showInputDialog("Inserte ID Auditoria"));
            String vendedor = "";
            String modelo = "";
            String mhz = "";
            String tam_cache = "";
            String cpifisca = "";
            String nucleoscpi = "";

            for (int i = 0; i < dcpu.infoCPU().size(); i += 2) {
                switch (i + 1) {
                    case 1:
                        vendedor = dcpu.infoCPU().get(i + 1);
                        break;
                    case 3:
                        modelo = dcpu.infoCPU().get(i + 1);
                        break;
                    case 5:
                        mhz = dcpu.infoCPU().get(i + 1);
                        break;
                    case 7:
                        tam_cache = dcpu.infoCPU().get(i + 1);
                        break;
                    case 9:
                        cpifisca = dcpu.infoCPU().get(i + 1);
                        break;
                    case 11:
                        nucleoscpi = dcpu.infoCPU().get(i + 1);
                        break;
                    default:
                        break;
                }
            }
            String ipprimaria = "";
            String mac_primaria = "";
            String host = "";

            for (int i = 0; i < dred.infoRed().size(); i += 2) {
                switch (i + 1) {
                    case 1:
                        ipprimaria = dred.infoRed().get(i + 1);
                        break;
                    case 3:
                        mac_primaria = dred.infoRed().get(i + 1);
                        break;
                    case 5:
                        host = dred.infoRed().get(i + 1);
                        break;
                    default:
                        break;
                }
            }

            String nombre = "";
            String descripcion = "";
            String version = "";
            String arquictectura = "";
            String usuario = "";
            String directorio = "";

            for (int i = 0; i < dso.infoSO().size(); i += 2) {
                switch (i + 1) {
                    case 1:
                        descripcion = dso.infoSO().get(i + 1);
                        break;
                    case 3:
                        nombre = dso.infoSO().get(i + 1);
                        break;
                    case 5:
                        version = dso.infoSO().get(i + 1);
                        break;
                    case 7:
                        arquictectura = dso.infoSO().get(i + 1);
                        break;
                    case 9:
                        usuario = dso.infoSO().get(i + 1);
                        break;
                    case 11:
                        directorio = dso.infoSO().get(i + 1);
                        break;
                    default:
                        break;
                }
            }

            String queryRed = "INSERT INTO `auditoria`.`red` (`idred`,`ip_primaria`,`mac_primaria`,`host`)VALUES(null,'" + ipprimaria + "','" + mac_primaria + "','" + host + "');";
            String queryCPU = "INSERT INTO `auditoria`.`cpu` (`idcpu`,`vendedor`,`modelo`,`mhz`,`tam_cache`,`cpufisica`,`nucleoscpu`) VALUES (null,'" + vendedor + "','" + modelo + "','" + mhz + "','" + tam_cache + "','" + cpifisca + "','" + nucleoscpi + "');";
            String querySO = "INSERT INTO `auditoria`.`sistema_operativo` (`idsistema_operativo`,`nombre`,`descripcion`,`version`,`arquitectura`,`usuario`,`directorio`)VALUES(null,'" + nombre + "','" + descripcion + "','" + version + "','" + arquictectura + "','" + usuario + "','" + directorio + "');";

            int idred = conexion.Insertar(queryRed);
            int idcpu = conexion.Insertar(queryCPU);
            int idso = conexion.Insertar(querySO);

            String queryNuevoEuipo = "INSERT INTO `auditoria`.`audi_equipo` (`idaudi_equipo`,`idauditoria`,`sistema_operativo`,`cpu`,`red_idred`,`disco_iddisco`)VALUES(null," + idauditoria + "," + idso + "," + idcpu + "," + idred + ",1);";

            if (conexion.Insertar(queryNuevoEuipo) > 0) {
                JOptionPane.showMessageDialog(null, "Equipo registrado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error, intentalo de nuevo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, intentalo de nuevo");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public DefaultListModel modelDataRed() {
        DefaultListModel mol = new DefaultListModel();
        for (int i = 0; i < dred.infoRed().size(); i += 2) {
            mol.addElement(dred.infoRed().get(i) + "  " + dred.infoRed().get(i + 1));
        }
        return mol;
    }

    public DefaultListModel modelData() {
        DefaultListModel mol = new DefaultListModel();
        for (int i = 0; i < dcpu.infoCPU().size(); i += 2) {
            mol.addElement(dcpu.infoCPU().get(i) + "  " + dcpu.infoCPU().get(i + 1));
        }
        return mol;
    }

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
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList lista1;
    private javax.swing.JList lista2;
    private javax.swing.JList lista3;
    private javax.swing.JList lista4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

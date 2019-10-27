
package GUI;

import AppPackage.AnimationClass;
import Clases.Conexion;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DANIEL LUNA
 */
public class Principal extends javax.swing.JFrame {

    public static Tabla tab = new Tabla();
//    String[] list = {"A", "B", "C"};
//    JComboBox jcb = new JComboBox(list);
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    Conexion cone = new Conexion();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        p_principal.add(tab);
        this.crearTabla();
        cone.CargarAuditoria(modelo);
    }

    public void crearTabla() {
        tab.tabla.setModel(modelo);
        modelo.setColumnIdentifiers(new Object[]{
            "id", "Nombre Auditoria", "Fecha de Auditoria"
        });
    }
    
    private void limpiarTabla() {
        for (int i = 0; i < tab.tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_auditoria = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        autores = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        menu = new javax.swing.JLabel();
        añadir = new javax.swing.JButton();
        opc1 = new javax.swing.JLabel();
        opc2 = new javax.swing.JLabel();
        p_nav = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        p_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_auditoria.setBackground(new java.awt.Color(255, 255, 255));
        p_auditoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        p_auditoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        p_auditoria.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 190, 180));

        autor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/group.png"))); // NOI18N
        autor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                autorMouseClicked(evt);
            }
        });
        p_auditoria.add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, 40));

        autores.setBackground(new java.awt.Color(255, 255, 255));
        autores.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        autores.setForeground(new java.awt.Color(56, 90, 114));
        autores.setText("Creado por: Daniel Luna, Duvan Botello.");
        p_auditoria.add(autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 575, 280, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 90, 114));
        jLabel2.setText("Nombre Auditoria");
        p_auditoria.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 192, 30));

        txt_nombre.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        p_auditoria.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 30));

        jSeparator1.setForeground(new java.awt.Color(56, 90, 114));
        jSeparator1.setToolTipText("");
        p_auditoria.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 200, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 90, 114));
        jLabel3.setText("Fecha Auditoria");
        p_auditoria.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 192, 30));

        txt_fecha.setBackground(new java.awt.Color(255, 255, 255));
        txt_fecha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_fecha.setForeground(new java.awt.Color(56, 90, 114));
        txt_fecha.setToolTipText("");
        txt_fecha.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        p_auditoria.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 200, 30));

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        p_auditoria.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        añadir.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        añadir.setForeground(new java.awt.Color(255, 255, 255));
        añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn1.png"))); // NOI18N
        añadir.setText("Añadir    ");
        añadir.setToolTipText("");
        añadir.setBorder(null);
        añadir.setBorderPainted(false);
        añadir.setContentAreaFilled(false);
        añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadir.setFocusPainted(false);
        añadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        p_auditoria.add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, 50));

        opc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/opc1.png"))); // NOI18N
        p_auditoria.add(opc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 50, 50));

        opc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print.png"))); // NOI18N
        p_auditoria.add(opc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 50, -1));

        getContentPane().add(p_auditoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 580));

        p_nav.setBackground(new java.awt.Color(255, 255, 255));
        p_nav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        p_nav.setToolTipText("");
        p_nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Open Sans Semibold", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(56, 90, 114));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Sistema de Auditoria");
        titulo.setToolTipText("");
        p_nav.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 300, 30));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cerrar.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        p_nav.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 40));

        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/min.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        p_nav.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 40));

        getContentPane().add(p_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 750, 50));

        p_principal.setBackground(new java.awt.Color(204, 204, 204));
        p_principal.setLayout(new java.awt.BorderLayout());
        getContentPane().add(p_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 740, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
//        -->
        AnimationClass opcion1 = new AnimationClass();
        opcion1.jLabelXRight(-50, 50, 10, 5, opc1);
//        <--
        AnimationClass opcion1l = new AnimationClass();
        opcion1l.jLabelXLeft(50, -50, 10, 5, opc1);
        
        AnimationClass opcion2 = new AnimationClass();
        opcion2.jLabelXRight(-50, 110, 10, 5, opc2);
        AnimationClass opcion2l = new AnimationClass();
        opcion2l.jLabelXLeft(110, -50, 10, 5, opc2);
        
        AnimationClass menus = new AnimationClass();
        menus.jLabelXRight(0, 230, 10, 5, menu);
        AnimationClass menusl = new AnimationClass();
        menusl.jLabelXLeft(230, 0, 10, 5, menu);
    }//GEN-LAST:event_menuMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void autorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autorMouseClicked
        AnimationClass about = new AnimationClass();
        about.jLabelYUp(575, 515, 10, 5, autores);
        AnimationClass aboutd = new AnimationClass();
        aboutd.jLabelYDown(515, 575, 10, 5, autores);
    }//GEN-LAST:event_autorMouseClicked

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        if (!"".equals(txt_nombre.getText())) {
            if (txt_fecha.getDate() != null) {
                SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
                String query = "INSERT INTO `auditoria`(`idaudioria`, `audi_nombre`, `audi_fecha`) VALUES (null,'" + txt_nombre.getText() + "','" + dt1.format(txt_fecha.getDate()) + "')";
                System.out.println(query);
                if (cone.Insertar(query) <= 0) {
                    JOptionPane.showMessageDialog(null, "Intenta de nuevo", "Mensaje", JOptionPane.WARNING_MESSAGE);

                } else {
                    this.limpiarTabla();
                    cone.CargarAuditoria(modelo);
                    txt_nombre.setText("");
                    txt_fecha.setDate(null);
                    JOptionPane.showMessageDialog(null, "Nueva auditoria registrada", "Mensaje", JOptionPane.WARNING_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese Fecha auditoria", "Mensaje", JOptionPane.WARNING_MESSAGE);

            }
        } else {

            JOptionPane.showMessageDialog(null, "Por favor ingrese nombre auditoria", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_añadirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor;
    private javax.swing.JLabel autores;
    private javax.swing.JButton añadir;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel opc1;
    private javax.swing.JLabel opc2;
    private javax.swing.JPanel p_auditoria;
    private javax.swing.JPanel p_nav;
    public static javax.swing.JPanel p_principal;
    private javax.swing.JLabel titulo;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}

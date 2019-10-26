package GUI;

import Clases.Conexion;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nain
 */
public class Principal extends javax.swing.JFrame {

    String[] list = {"A", "B", "C"};
    JComboBox jcb = new JComboBox(list);
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    Conexion cone = new Conexion();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.crearTabla();
        cone.CargarAuditoria(modelo);

    }

    public void crearTabla() {
        tabla1.setModel(modelo);
        modelo.setColumnIdentifiers(new Object[]{
            "id", "Nombre Auditoria", "Fecha de Auditoria"
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreaudi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE AUDITORIA PARA CONTROL DE EQUIPOS DE COMPUTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setText("Bienvenidos  al  Sistema de Auditoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/auditoria.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 80));

        jLabel3.setText("Ingese Nombre Auditoria:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        txtnombreaudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreaudiActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombreaudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, -1));

        jLabel4.setText("Ingrese Fecha Auditoria:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 620, 220));
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 200, -1));

        jButton1.setText("Añadir nueva Auditoria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 770, 40));

        jMenu1.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo Equipo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Prueba requerimientos = new Prueba();
        requerimientos.setVisible(true);
//        JOptionPane.showMessageDialog( null, jcb, "Seleccione Auditoria", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtnombreaudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreaudiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreaudiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (!"".equals(txtnombreaudi.getText())) {
            if (txt_fecha.getDate() != null) {
                SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
                String query = "INSERT INTO `auditoria`(`idaudioria`, `audi_nombre`, `audi_fecha`) VALUES (null,'" + txtnombreaudi.getText() + "','" + dt1.format(txt_fecha.getDate()) + "')";
                System.out.println(query);
                if (cone.Insertar(query) <= 0) {
                    JOptionPane.showMessageDialog(null, "Intenta de nuevo", "Mensaje", JOptionPane.WARNING_MESSAGE);

                } else {
                    this.limpiarTabla();
                    cone.CargarAuditoria(modelo);
                    txtnombreaudi.setText("");
                    txt_fecha.setDate(null);
                    JOptionPane.showMessageDialog(null, "Nueva auditoria registrada", "Mensaje", JOptionPane.WARNING_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese Fecha auditoria", "Mensaje", JOptionPane.WARNING_MESSAGE);

            }
        } else {

            JOptionPane.showMessageDialog(null, "Por favor ingrese nombre auditoria", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarTabla() {
        for (int i = 0; i < tabla1.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JTextField txtnombreaudi;
    // End of variables declaration//GEN-END:variables
}


package GUI;

import Clases.Conexion;
import Clases.DataCPU;
import Clases.DataDisco;
import Clases.DataRed;
import Clases.DataSO;
import static GUI.Principal.p_principal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DANIEL LUNA
 */
public class Informe extends javax.swing.JPanel {

    public DataSO dso;
    public DataCPU dcpu;
    public DataDisco dsc;
    public DataRed dred;
    public Conexion conexion;
    
    public Informe() {
        initComponents();
        dso = new DataSO();
        dcpu = new DataCPU();
        dsc = new DataDisco();
        dred = new DataRed();
        conexion = new Conexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lista = new javax.swing.JList();
        tituloinf = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/so.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 94));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cpu.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, 94));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/disco.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        lista.setBackground(new java.awt.Color(204, 204, 204));
        lista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(102, 102, 102))); // NOI18N
        lista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lista.setToolTipText("");
        add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 390, 190));

        tituloinf.setFont(new java.awt.Font("Open Sans Semibold", 0, 24)); // NOI18N
        tituloinf.setForeground(new java.awt.Color(56, 90, 114));
        tituloinf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloinf.setToolTipText("");
        add(tituloinf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 300, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        tituloinf.setText("Sistema Operativo.");
        lista.setModel(dso.modelData());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        tituloinf.setText("Equipo | CPU.");
        lista.setModel(dcpu.modelData());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        tituloinf.setText("Equipo | Disco.");
        lista.setModel(dsc.modelData());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        tituloinf.setText("Equipo | Red.");
        lista.setModel(dred.modelData());
    }//GEN-LAST:event_jLabel6MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible(false);
        p_principal.add(Principal.tab);
        p_principal.validate();
        Principal.tab.setVisible(true);
    }//GEN-LAST:event_backMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList lista;
    private javax.swing.JLabel tituloinf;
    // End of variables declaration//GEN-END:variables
}

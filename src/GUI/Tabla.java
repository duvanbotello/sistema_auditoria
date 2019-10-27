
package GUI;

import static GUI.Principal.p_principal;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author DANIEL LUNA
 */
public class Tabla extends javax.swing.JPanel {

    
    
    public Tabla() {
        initComponents();
        
//        tabla con fondo
        ((DefaultTableCellRenderer) tabla.getDefaultRenderer(Object.class)).setOpaque(false);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        tabla.setShowGrid(false);
        tabla.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        nuevoequipo = new javax.swing.JButton();
        fondotabla = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabla.setRowHeight(25);
        tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tabla.setSelectionForeground(new java.awt.Color(204, 204, 204));
        scroll.setViewportView(tabla);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 550, 330));

        nuevoequipo.setFont(new java.awt.Font("Open Sans Semibold", 0, 14)); // NOI18N
        nuevoequipo.setForeground(new java.awt.Color(255, 255, 255));
        nuevoequipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn2.png"))); // NOI18N
        nuevoequipo.setText("Nuevo Equipo   ");
        nuevoequipo.setToolTipText("");
        nuevoequipo.setBorder(null);
        nuevoequipo.setBorderPainted(false);
        nuevoequipo.setContentAreaFilled(false);
        nuevoequipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoequipo.setFocusPainted(false);
        nuevoequipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevoequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoequipoActionPerformed(evt);
            }
        });
        add(nuevoequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 130, 50));

        fondotabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        add(fondotabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 550, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoequipoActionPerformed
        Informe inf = new Informe();
        this.setVisible(false);
        p_principal.add(inf);
        p_principal.validate();
    }//GEN-LAST:event_nuevoequipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondotabla;
    private javax.swing.JButton nuevoequipo;
    private javax.swing.JScrollPane scroll;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

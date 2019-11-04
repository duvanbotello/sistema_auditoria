
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

    DataSO dso;
    DataCPU dcpu;
    DataDisco dsc;
    DataRed dred;
    Conexion conexion;
    
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jButton1.setText("Agregar Equipo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        jButton2.setText("Reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));
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
            
            String espaciototal = "";
            String espaciolibre = "";
            String espaciousado = "";
            String unidades = "";

            for (int i = 0; i < dsc.infoDisco().size(); i += 2) {
                switch (i + 1) {
                    case 1:
                    espaciototal = dsc.infoDisco().get(i + 1);
                    break;
                    case 3:
                    espaciolibre = dsc.infoDisco().get(i + 1);
                    break;
                    case 5:
                    espaciousado = dsc.infoDisco().get(i + 1);
                    break;
                    case 7:
                    unidades = dsc.infoDisco().get(i + 1);
                    break;
                    default:
                    break;
                }
            }
            System.out.println(unidades);
            String queryDisco = "INSERT INTO `auditoria`.`disco` (`iddisco`,`espaciototal`,`espaciodisponible`,`espaciousado`,`unidades`) VALUES (null,'" + espaciototal + "','" + espaciolibre + "','" + espaciousado + "','" + unidades +"2" +"');";
            String queryRed = "INSERT INTO `auditoria`.`red` (`idred`,`ip_primaria`,`mac_primaria`,`host`)VALUES(null,'" + ipprimaria + "','" + mac_primaria + "','" + host + "');";
            String queryCPU = "INSERT INTO `auditoria`.`cpu` (`idcpu`,`vendedor`,`modelo`,`mhz`,`tam_cache`,`cpufisica`,`nucleoscpu`) VALUES (null,'" + vendedor + "','" + modelo + "','" + mhz + "','" + tam_cache + "','" + cpifisca + "','" + nucleoscpi + "');";
            String querySO = "INSERT INTO `auditoria`.`sistema_operativo` (`idsistema_operativo`,`nombre`,`descripcion`,`version`,`arquitectura`,`usuario`,`directorio`)VALUES(null,'" + nombre + "','" + descripcion + "','" + version + "','" + arquictectura + "','" + usuario + "','" + directorio + "');";

            int idred = conexion.Insertar(queryRed);
            int iddisco = conexion.Insertar(queryDisco);
            System.out.println(iddisco);
            int idcpu = conexion.Insertar(queryCPU);
            int idso = conexion.Insertar(querySO);

            String queryNuevoEuipo = "INSERT INTO `auditoria`.`audi_equipo` (`idaudi_equipo`,`idauditoria`,`sistema_operativo`,`cpu`,`red_idred`,`disco_iddisco`)VALUES(null," + idauditoria + "," + idso + "," + idcpu + "," + idred + "," + iddisco + ");";

            if (conexion.Insertar(queryNuevoEuipo) > 0) {
                JOptionPane.showMessageDialog(null, "Equipo registrado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error, intentalo de nuevo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, intentalo de nuevo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Conexion con = new Conexion();
        Connection conn = null;
        JasperReport reporte = null;
        String path = "src/Reportes/report3.jasper";

        try {
            int id_auditoria = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Id Auditoria"));
            conn = con.getConexion();
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            @SuppressWarnings("unchecked")
            Map<String, Object> parametro = new HashMap();
            parametro.put("idauditoria", id_auditoria);
            JasperPrint jprint = JasperFillManager.fillReport(path, parametro, conn);
            JasperViewer view = new JasperViewer(jprint, false);

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Ingresar Dato");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList lista;
    private javax.swing.JLabel tituloinf;
    // End of variables declaration//GEN-END:variables
}

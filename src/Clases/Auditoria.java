/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author nain
 */
public class Auditoria {
    private String aud_nombre;
    private Date fecha_aud;

    public Auditoria(String aud_nombre, Date fecha_aud) {
        this.aud_nombre = aud_nombre;
        this.fecha_aud = fecha_aud;
    }
    
    public String getAud_nombre() {
        return aud_nombre;
    }

    public void setAud_nombre(String aud_nombre) {
        this.aud_nombre = aud_nombre;
    }

    public Date getFecha_aud() {
        return fecha_aud;
    }

    public void setFecha_aud(Date fecha_aud) {
        this.fecha_aud = fecha_aud;
    }
    
    
}

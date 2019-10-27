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

    private int id;
    private String aud_nombre;
    private Date fecha_aud;

    public Auditoria(int id, String aud_nombre, Date fecha_aud) {
        this.id = id;
        this.aud_nombre = aud_nombre;
        this.fecha_aud = fecha_aud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

/*
 * Copyright (C) 2019 Carlos Micó
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package Pojos;

import Comunes.Estado;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Carlos Micó
 */
public class Historial implements Serializable{
    private int id;
    private Ejemplar ejemplar;
    private Alumno alumno;
    private int curso_escolar;
    private int estado_inicial;
    private int estado_final;
    private Date fecha_incial;
    private Date fecha_final;
    private String observaciones;
    
    public Historial(){
        
    }

    public Historial(int id, Ejemplar ejemplar, Alumno alumno, int curso_escolar, int estado_inicial, int estado_final, Date fecha_incial, Date fecha_final, String observaciones) {
        this.id = id;
        this.ejemplar = ejemplar;
        this.alumno = alumno;
        this.curso_escolar = curso_escolar;
        this.estado_inicial = estado_inicial;
        this.estado_final = estado_final;
        this.fecha_incial = fecha_incial;
        this.fecha_final = fecha_final;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getCurso_escolar() {
        return curso_escolar;
    }

    public void setCurso_escolar(int curso_escolar) {
        this.curso_escolar = curso_escolar;
    }

    public int getEstado_inicial() {
        return estado_inicial;
    }

    public void setEstado_inicial(int estado_inicial) {
        this.estado_inicial = estado_inicial;
    }

    public int getEstado_final() {
        return estado_final;
    }

    public void setEstado_final(int estado_final) {
        this.estado_final = estado_final;
    }

    public Date getFecha_incial() {
        return fecha_incial;
    }

    public void setFecha_incial(Date fecha_incial) {
        this.fecha_incial = fecha_incial;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Historial{" + "id=" + id + ", ejemplar=" + ejemplar + ", alumno=" + alumno + ", curso_escolar=" + curso_escolar + ", estado_inicial=" + estado_inicial + ", estado_final=" + estado_final + ", fecha_incial=" + fecha_incial + ", fecha_final=" + fecha_final + ", observaciones=" + observaciones + '}';
    }
}
package com.co.castor.Pojo;

import java.util.Date;

public class EmpleadosPojo {


     private long id;
     private CargosPojo cargos;
     private int cedula;
     private String nombre;
     private String foto;
     private Date fechaIngreso;

    public EmpleadosPojo() {
    }

	
    public EmpleadosPojo(long id, CargosPojo cargos, int cedula, String nombre) {
        this.id = id;
        this.cargos = cargos;
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public EmpleadosPojo(long id, CargosPojo cargos, int cedula, String nombre, String foto, Date fechaIngreso) {
       this.id = id;
       this.cargos = cargos;
       this.cedula = cedula;
       this.nombre = nombre;
       this.foto = foto;
       this.fechaIngreso = fechaIngreso;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public CargosPojo getCargos() {
        return this.cargos;
    }
    
    public void setCargos(CargosPojo cargos) {
        this.cargos = cargos;
    }
    public int getCedula() {
        return this.cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }




}



package com.co.castor.Pojo;

import java.util.HashSet;
import java.util.Set;

public class CargosPojo {


     private int idcargo;
     private String nombre;
     private Set<EmpleadosPojo> empleadoses = new HashSet<EmpleadosPojo>(0);

    public CargosPojo() {
    }

	
    public CargosPojo(int idcargo, String nombre) {
        this.idcargo = idcargo;
        this.nombre = nombre;
    }
    public CargosPojo(int idcargo, String nombre, Set<EmpleadosPojo> empleadoses) {
       this.idcargo = idcargo;
       this.nombre = nombre;
       this.empleadoses = empleadoses;
    }
   
    public int getIdcargo() {
        return this.idcargo;
    }
    
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<EmpleadosPojo> getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set<EmpleadosPojo> empleadoses) {
        this.empleadoses = empleadoses;
    }




}



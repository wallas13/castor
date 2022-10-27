/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.castor.conexion;

import com.co.castor.Pojo.EmpleadosPojo;
import com.co.castor.modelo.Empleados;
import java.util.List;

/**
 *
 * @author andre
 */
public interface EmpleadosDAO {
    public void insertar(Empleados empleado);
    
    public void actualizar(EmpleadosPojo empleado);
    
    public void eliminar(int idEmpleado);
    
    public List<Empleados> list_empleados();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.castor.conexionImp;

import com.co.castor.Pojo.EmpleadosPojo;
import com.co.castor.conexion.EmpleadosDAO;
import com.co.castor.modelo.Cargos;
import com.co.castor.modelo.Empleados;
import com.co.castor.modelo.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author andre
 */
public class EmpleadosDAOImp implements EmpleadosDAO{
    Session sesion = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public void insertar(Empleados empleado) {
        sesion.beginTransaction();
        sesion.save(empleado);
        sesion.getTransaction().commit();
    }

    @Override
    public void actualizar(EmpleadosPojo empleado) {
        sesion.beginTransaction();
        Empleados emp = (Empleados) sesion.get(Empleados.class, empleado.getId());
        if (emp != null){
            emp.setNombre(empleado.getNombre());
            emp.setFoto(empleado.getFoto()!=null?empleado.getFoto():null);
        } else {
            Cargos cargo = new Cargos(empleado.getCargos().getIdcargo(), empleado.getCargos().getNombre());
            emp = new Empleados(empleado.getId(),cargo,emp.getCedula(),emp.getNombre(),emp.getFoto(),emp.getFechaIngreso());
        }
        sesion.saveOrUpdate(emp);
        sesion.getTransaction().commit();
    }

    @Override
    public void eliminar(int idEmpleado) {
        sesion.beginTransaction();
        Empleados emp = (Empleados) sesion.get(Empleados.class, idEmpleado);
        if (emp != null){
            sesion.delete(emp);
        }
        sesion.getTransaction().commit();
    }

    @Override
    public List<Empleados> list_empleados() {
        Query q = sesion.createQuery("select c from empleados");
        return (List<Empleados>) q.list();
    }
    
}

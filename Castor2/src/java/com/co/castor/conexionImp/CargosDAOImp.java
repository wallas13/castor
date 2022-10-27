/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.castor.conexionImp;

import com.co.castor.conexion.CargosDAO;
import com.co.castor.modelo.Cargos;
import com.co.castor.modelo.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author andre
 */
public class CargosDAOImp implements CargosDAO{
    Session sesion = (Session) HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public void Insertar(Cargos cargo) {
        sesion.beginTransaction();
        sesion.save(cargo);
        sesion.getTransaction().commit();
    }

    @Override
    public void Actualizar(int idCargo, String nombre) {
        sesion.beginTransaction();
        Cargos cargo = (Cargos) sesion.get(Cargos.class, idCargo);
        if (cargo != null){
            cargo.setNombre(nombre);
        } else {
            cargo = new Cargos(idCargo, nombre);
        }
        sesion.saveOrUpdate(cargo);
        sesion.getTransaction().commit();
    }

    @Override
    public void Eliminar(int idCargo) {
        sesion.beginTransaction();
        Cargos cargo = (Cargos) sesion.get(Cargos.class, idCargo);
        if (cargo != null){
            sesion.delete(cargo);
        }
        sesion.getTransaction().commit();
    }

    @Override
    public List<Cargos> lista_Cargos() {
        Query q = sesion.createQuery("select c from cargos");
        return (List<Cargos>) q.list();
    }

    
}

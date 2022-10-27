/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.castor.conexion;

import com.co.castor.modelo.Cargos;
import java.util.List;

/**
 *
 * @author andre
 */
public interface CargosDAO {
    public void Insertar(Cargos cargo);
    
    public void Actualizar(int idCargo, String nombre);
    
    public void Eliminar(int idCargo);
    
    public List<Cargos> lista_Cargos();
    
}   

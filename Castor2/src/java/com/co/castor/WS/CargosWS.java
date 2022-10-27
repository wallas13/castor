/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.castor.WS;

import com.co.castor.Pojo.CargosPojo;
import com.co.castor.conexion.CargosDAO;
import com.co.castor.conexionImp.CargosDAOImp;
import com.co.castor.modelo.Cargos;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "CargosWS")
public class CargosWS {

    /**
     * This is a sample web service operation
     * @param cargoin
     * @return 
     */
    @WebMethod(operationName = "ingresarCargo")
    public String ingresarCargo(@WebParam(name = "Cargo") CargosPojo cargoin) {
        CargosDAO cargo = new CargosDAOImp();
        Cargos car = new Cargos(cargoin.getIdcargo(), cargoin.getNombre());
        cargo.Insertar(car);
        return "successfully";
    }
}

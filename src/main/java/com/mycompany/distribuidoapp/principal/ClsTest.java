/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.distribuidoapp.principal;

import com.mycompany.distribuidoapp.entidades.Productos;
import com.mycompany.distribuidoapp.session.ProductosJpaController;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aaron
 */
public class ClsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("laboratorio");
        ProductosJpaController pjc = new ProductosJpaController(emf);

        Productos p = new Productos();

        p.setCodigo(1);
        p.setNombre("Softwsare ISO");
        Double dl = 99.99;
        BigDecimal bdl = BigDecimal.valueOf(dl);
        p.setPrecio(bdl);
        p.setDetalle("Software Categoria");

        try {
            pjc.create(p);
        } catch (Exception ex) {
            Logger.getLogger(ClsTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.attendanceapp.org.facade;

import com.attendanceapp.org.crud.GenericCRUD;
import javax.persistence.EntityManager;

/**
 *
 * @author Babak Tamjidi  baboly@gmail.com
 */
public class DayFacade extends GenericCRUD<Day> {

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.db.exception;

import org.hibernate.HibernateException;

/**
 *
 * @author HAENCISO
 */
public class UnableToSaveException extends HibernateException{
    public UnableToSaveException(HibernateException msg) {
        super(msg);
    }
}

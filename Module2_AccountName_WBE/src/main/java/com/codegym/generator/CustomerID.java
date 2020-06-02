package com.codegym.generator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class CustomerID implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String prefix = "CUS-";
        return prefix + generaRandomNumber();
    }
    private  static String generaRandomNumber(){
        Random random= new Random();
        return String.format("%d", random.nextInt(10000));
    }
}

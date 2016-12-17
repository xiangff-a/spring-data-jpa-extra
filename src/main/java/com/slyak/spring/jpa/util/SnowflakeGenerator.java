package com.slyak.spring.jpa.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class SnowflakeGenerator implements IdentifierGenerator {
    public static final String TYPE = "com.slyak.spring.jpa.util.SnowflakeGenerator";

    private static final IdWorker idWorker = new IdWorker();

    @Override
    public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
        return idWorker.getId();
    }
}

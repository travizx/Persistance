/*
 * Interfaz que implimentaran todos los DAOs que se vallan generando.
 */
package com.mx.teknei.pcabordo.lib.dao;

import java.io.Serializable;

/**
 *
 * @author HAENCISO
 * @param <Entity>
 * @param <PK>
 */
public interface GenericDao<Entity, PK extends Serializable> {
    void add(Entity t);
    void update(Entity t);
    Entity find(PK id);
    void erase(Entity t);
}

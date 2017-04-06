/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Actor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ASANTAANA
 */
@Stateless
public class ActorManager implements ActorManagerLocal {

    @PersistenceContext(unitName = "com.udea_Peliculas-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    //@Resource
    //private javax.transaction.UserTransaction utx;

    @Override
    public List<Actor> getAllActor() {
        Query query= em.createNamedQuery("Actor.findAll");
        return query.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Actor updateActor(Actor actor) {
        return em.merge(actor);
    }

    //public void persist(Object object) {
    //    try {
    //        utx.begin();
    //        em.persist(object);
    //        utx.commit();
    //    } catch (Exception e) {
    //        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
    //        throw new RuntimeException(e);
    //    }
    //}
}

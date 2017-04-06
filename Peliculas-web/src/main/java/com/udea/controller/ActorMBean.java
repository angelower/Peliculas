/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.entity.Actor;
import com.udea.session.ActorManagerLocal;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ASANTAANA
 */
public class ActorMBean {

    @EJB
    private ActorManagerLocal actorManager;

    private Actor actor;
    private List<Actor> actors;
    /**
     * Creates a new instance of ActorMBean
     */
    public ActorMBean() { }
    
    public List<Actor> getActors(){
        if((actors==null)||(actors.isEmpty()))
            refresh();
            return actors;
    }
    
    public String update(){
        System.out.println("UPDATE");
        actor = actorManager.updateActor(actor);
        return "SAVED";
    }
    
    public String list(){
        System.out.println("LIST");
        return "LIST";
    }
    
    public void refresh(){
        actors=actorManager.getAllActor();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.Actor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ASANTAANA
 */
@Local
public interface ActorManagerLocal {

    List<Actor> getAllActor();

    Actor updateActor(Actor actor);
    
}

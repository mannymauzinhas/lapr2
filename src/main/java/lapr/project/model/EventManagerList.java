/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */


public class EventManagerList {
    
    private List<EventManager> managerList;
    
    public EventManagerList(){
        this.managerList = new ArrayList<>();
    }
    
    public List<EventManager> getEventManagersList(){
        return managerList;
    }
    
    public void setEventManagersList(List<EventManager> managerList){
        this.managerList = managerList;
    }
    
    private boolean validate(EventManager eventManager){
        for (EventManager u: managerList){
            if(u.equals(eventManager)){
                return false;
            }
        }
        return true;
    }
    
    public void addEventManager(EventManager eventManager){
        if(validate(eventManager)){
            managerList.add(eventManager);
        }else{
            JOptionPane.showMessageDialog(null, "The event manager "+eventManager.getName(), "Error!", -1);
        }
    }
    
    public int size (){
        return managerList.size();
    }
}

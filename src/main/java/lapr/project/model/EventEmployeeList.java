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
public class EventEmployeeList {
    private List<EventEmployee> employeeList;
    
    public EventEmployeeList(){
        this.employeeList = new ArrayList<>();
    }
    
    public List<EventEmployee> getEmployeeList(){
        return employeeList;
    }
    
    public void setEmployeeList(List<EventEmployee> employeeList){
        this.employeeList = employeeList;
    }
    
    private boolean validate(EventEmployee user){
        for (EventEmployee u: employeeList){
            if(u.equals(user)){
                return false;
            }
        }
        return true;
    }
    
    public void addEmployee(EventEmployee employee){
        if(validate(employee)){
            employeeList.add(employee);
        }else{
            JOptionPane.showMessageDialog(null, "The employee "+employee.getName(), "Error!", -1);
        }
    }
    
    public int size (){
        return employeeList.size();
    }
}

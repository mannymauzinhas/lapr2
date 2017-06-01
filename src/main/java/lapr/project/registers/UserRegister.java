/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.registers;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lapr.project.users.User;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class UserRegister implements Serializable {
    
    private ArrayList<User> usersList;
    
    public UserRegister(){
        this.usersList = new ArrayList<>();
    }
    
    public ArrayList<User> getUsersList(){
        return usersList;
    }
    
    public void setUsersList(ArrayList<User> usersList){
        this.usersList = usersList;
    }
    
    public boolean validate(User user){
        for (User u: usersList){
            if(u.equals(user)){
                return false;
            }
        }
        return true;
    }
    
    public void addUser(User user){
        if(validate(user)){
            usersList.add(user);
        }else{
            JOptionPane.showMessageDialog(null, "The User "+user.getName(), "Error!", -1);
        }
    }
}
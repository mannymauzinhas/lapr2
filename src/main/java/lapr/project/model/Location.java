package lapr.project.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Location implements Serializable{
    private static final long serialVersionUID = 1;

    private String address;
    private boolean inUse;

    /**
     *
     * @param address
     * @param area
     */
    public Location(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Address: " +address;
    }
    
    public void setInUse(boolean inUse){
        this.inUse = inUse;
    }

    public boolean isInUse() {
        return inUse;
    }

    
    
}

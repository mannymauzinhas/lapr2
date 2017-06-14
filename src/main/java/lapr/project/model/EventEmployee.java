package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventEmployee {

    private int experience;
    private User eventEmployee;
    private EventRegistry eventRegistry;
    private ApplicationList applicationList;
    
    /**
     *
     * @param eventEmployee
     * @param experience
     */
    public EventEmployee(User eventEmployee, int experience) {
        this.eventEmployee = eventEmployee;
        this.experience = experience;
        this.eventRegistry = new EventRegistry();
        this.applicationList= new ApplicationList();
    }

    public String getEmail() {
        return eventEmployee.getEmail();
    }

    public String getUsername() {
        return eventEmployee.getUserName();
    }

    /**
     *
     * @param experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     *
     * @return
     */
    public int getExperience() {
        return experience;
    }

    public EventRegistry getEventRegistry() {
        return eventRegistry;
    }

    public void setEventRegistry(EventRegistry eventRegistry) {
        this.eventRegistry = eventRegistry;
    }

    public ApplicationList getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(ApplicationList applicationList) {
        this.applicationList = applicationList;
    }

    @Override
    public String toString() {
        return eventEmployee.toString() + " Experience: " + experience;
    }

    public User getEmployee() {
        return eventEmployee;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author MarioDias
 */
public class ShowEventAcceptanceRate {

    private Event event;
    private int accepted;
    private int total;
    private double acceptanceRate;

    public ShowEventAcceptanceRate(Event event) {
        this.event = event;
        showEventAcceptanceRate();
    }

    private void showEventAcceptanceRate() {
        int acceptedCounter = 0;
        int totalCounter = 0;

        for (int i = 0; i < event.getApplicationsList().size(); i++) {

            Application application = event.getApplicationsList().getApplication(i);
            totalCounter++;
            if (application.isDecision()) {
                acceptedCounter++;
            }

        }
        if (totalCounter == 0) {
            totalCounter = 1;
        }
        total = totalCounter;
        accepted = acceptedCounter;
        acceptanceRate = ((acceptedCounter) / (double) (totalCounter));
    }

    public double getAcceptanceRate() {
        return acceptanceRate;
    }

    public int getAccepted() {
        return accepted;
    }

    public int getTotal() {
        return total;
    }
}

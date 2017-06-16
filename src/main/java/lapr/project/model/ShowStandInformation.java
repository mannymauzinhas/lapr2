package lapr.project.model;

import java.util.ArrayList;

/**
 *
 * @author MarioDias
 */
public class ShowStandInformation {

    private StandRegistry standRegistry;
    private float intervalMatrix[][];
    private ArrayList<String> intervals;
    private float totalAmplitude = 0;
    private String frequencyString;

    public ShowStandInformation(StandRegistry standRegistry) {
        this.standRegistry = standRegistry;
        this.intervals = new ArrayList<>();
        TotalAmplitude();
        SturgesRule();
    }

    private StandRegistry getStandRegistry() {
        return standRegistry;
    }

    public StandRegistry newStandRegistryInterval(int pos) {
        StandRegistry newStandRegistry = new StandRegistry();
        for (int i = 0; i < standRegistry.size(); i++) {
            if (getStandRegistry().getStand(i).getArea() <= intervalMatrix[pos][1] && getStandRegistry().getStand(i).getArea() >= intervalMatrix[pos][0]) {
                newStandRegistry.addStand(standRegistry.getStand(i));
            }
        }
        float n = (float) newStandRegistry.size() / standRegistry.size();

        float frequency = (n * 100);
        frequencyString = String.format("%.2f%%", frequency);
        return newStandRegistry;
    }

    private void SturgesRule() {
        int k = (int) Math.ceil(1 + 3.3 * Math.log10((float) standRegistry.size()));
        float amplitude = totalAmplitude / k;
        createElements((int)amplitude, Math.round(k));
    }

    private void createElements(int amplitude, int k) {
        float value = standRegistry.getStand(0).getArea();
        intervalMatrix = new float[k][2];
        for (int i = 0; i < k; i++) {
            intervalMatrix[i][0] = value;
            intervalMatrix[i][1] = value + amplitude;
            intervals.add("[ " + intervalMatrix[i][0] + " ; " + intervalMatrix[i][1] + " ]");
            value += amplitude;
        }
    }

    private void TotalAmplitude() {
        standRegistry.sort();
        float min = standRegistry.getStand(0).getArea();
        float max = standRegistry.getStand(standRegistry.size() - 1).getArea();
        totalAmplitude = max - min;
    }

    public float[][] getIntervalMatrix() {
        return intervalMatrix;
    }

    public ArrayList<String> getIntervals() {
        return intervals;
    }

    public String getFrequencyString() {
        return frequencyString;
    }

}

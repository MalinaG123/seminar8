package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public class UpdatesServer {
    private String updatePackage;
    private List<CarOS> observers;

    public UpdatesServer(String updatePackage) {
        this.updatePackage = updatePackage;
        this.observers = new ArrayList<>();
    }

    public void pushUpdates(String update){
        this.updatePackage=update;
        for (CarOS c:observers) {
            c.update(update);
        }
    }

    public void addObservers(CarOS carOS){
        this.observers.add(carOS);
    }

    public void deleteObeservers(CarOS carOS){
        if(this.observers.contains(carOS)){
            this.observers.remove(carOS);
        }
    }
}

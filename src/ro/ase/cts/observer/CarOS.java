package ro.ase.cts.observer;

public class CarOS {
    private String lastUpdate;

    public CarOS(String lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public void update(String update){
        this.lastUpdate=update;
    }

    public void afiseaza(){
        System.out.println("Update: "+lastUpdate);
    }
}

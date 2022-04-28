package ro.ase.cts;

import ro.ase.cts.composite.Angajat;
import ro.ase.cts.composite.Manager;
import ro.ase.cts.observer.CarOS;
import ro.ase.cts.observer.UpdatesServer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        COMPOSITE
        Angajat angajat = new Angajat("ang1","12ws");
        Angajat angajat2 = new Angajat("ang2","13ws");
        Angajat angajat3 = new Angajat("ang3","14ws");
        Manager manager = new Manager(new Angajat("manager","2s"),new ArrayList<>());
        manager.adaugaSubordonat(angajat);
        manager.adaugaSubordonat(angajat2);
        manager.adaugaSubordonat(angajat3);
        System.out.println(manager.afisareDetalii());

        manager.stergeSubordonat(angajat2);
        System.out.println(manager.afisareDetalii());

//        OBSERVER
        UpdatesServer updatesServer = new UpdatesServer("ios13");
        CarOS carOS1 = new CarOS("ios12");
        CarOS carOS2 = new CarOS("ios11");
        updatesServer.addObservers(carOS1);
        updatesServer.addObservers(carOS2);
        updatesServer.pushUpdates("ios13");
        carOS1.afiseaza();
        carOS2.afiseaza();
    }
}

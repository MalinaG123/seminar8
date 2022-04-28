package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IAngajat{
    private Angajat angajat;
    private List<IAngajat> subordonati = new ArrayList<>();

    public Manager(Angajat angajat, List<IAngajat> subordonati) {
        this.angajat = angajat;
        this.subordonati = subordonati;
    }

    @Override
    public String toString() {
        String msj;
         msj = "Manager: " + angajat.afisareDetalii() +
                "\n Subordonati:\n " ;
        for (IAngajat a:subordonati) {
            msj += a.afisareDetalii()+"\n ";
        };
        return msj;
    }

    @Override
    public String afisareDetalii() {
        return this.toString();
    }

    public void adaugaSubordonat(IAngajat angajat){
        subordonati.add(angajat);
    }

    public void stergeSubordonat(IAngajat angajat){
        subordonati.remove(angajat);
    }
}

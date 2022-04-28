package ro.ase.cts.composite;

public class Angajat implements IAngajat{
    private String nume;
    private String codAngajat;

    public Angajat(String nume, String codAngajat) {
        this.nume = nume;
        this.codAngajat = codAngajat;
    }


    @Override
    public String toString() {
        return
                "nume='" + nume + '\'' +
                ", codAngajat='" + codAngajat + '\'';
    }

    @Override
    public String afisareDetalii() {
        return this.toString();
    }

}

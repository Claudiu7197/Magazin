package ro.mta.magazin;

import java.util.ArrayList;
import java.util.Collections;

public class Magazin {
    private ArrayList<Produs> produse;
    public void sort()
    {
        Collections.sort(produse);
    }
    public Magazin() { produse = new ArrayList<Produs>();}

    public ArrayList<Produs> getProduse() {
        return produse;
    }

    public void setProduse(ArrayList<Produs> produse) {
        this.produse = produse;
    }

    public Magazin(ArrayList<Produs> produse) {
        produse = new ArrayList<Produs>();
        for (Produs p : produse) {
            this.produse.add(p);
        }
    }
    public void add(Produs p)
    {
        this.produse.add(p);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Magazinul contine produse cu valoarea mai mare de 10 lei: \n");
        for (Produs p : produse) {
            if(p.getPret()>10) {
                builder.append(p.getNume());
                builder.append(" la pretul de ");
                builder.append(p.getPret());
                builder.append(".\n\n");
            }
        }

        builder.append("Produsele urmatoare sunt la super pret mai mic de 10 lei!!! \n");
        for (Produs p : produse) {
            if(p.getPret()<=10) {
                builder.append(p.getNume());
                builder.append(" la pretul de ");
                builder.append(p.getPret());
                builder.append(".\n");
            }
        }


        return builder.toString();
    }
}


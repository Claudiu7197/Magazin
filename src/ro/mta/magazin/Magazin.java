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
        builder.append("Magazinul contine \n");
        for (Produs p : produse) {
            builder.append(p.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}


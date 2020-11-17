package ro.mta.magazin;

public class Produs implements Comparable<Produs>{
    private String nume;
    private String raion;
    private int cantitate;
    private int pret;
    @Override
    public int compareTo(Produs o)
    {
        if(this.pret<o.pret)
            return -1;
        if(this.pret>o.pret)
            return 1;

        return 0;
    }

    public Produs(String nume, String raion, int cantitate, int pret) {
        this.nume = nume;
        this.raion = raion;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public int getPret()
    {
        return pret;
    }

    public String getNume()
    {
        return nume;
    }

    @Override
    public String toString()
    {
        return this.nume+" se afla la raionul de "+this.raion+" avand pretul "+this.pret+" lei.Cantitatea este de "+this.cantitate;
    }
}


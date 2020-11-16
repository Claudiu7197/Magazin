package ro.mta.magazin;

public class Main {
    public static void main(String[] args)
    {
        Produs p=new Produs("Chio Chips","Snacksuri",20,3);
        Magazin m=new Magazin();
        m.add(p);
        m.add(new Produs("Castraveti Fabio","Legume", 50,2));
        System.out.println(m);
    }
}

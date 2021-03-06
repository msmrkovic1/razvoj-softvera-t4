package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Racun {
  public Racun() { Artikli = new ArrayList<>(); }
  public Racun(Artikal artikal, int kol) {
    this();
    Artikli.add(new Stavka(artikal, kol));
  }
  
  private ArrayList<Stavka> Artikli;
  private class Stavka {
    private Artikal artikal;
    private int kolicina;
    
    public Stavka(Artikal artikal, int kolicina) {
      this.artikal = artikal; this.kolicina = kolicina;
    }
  
    // Setteri
    public void setArtikal(Artikal artikal) { this.artikal = artikal; }
    public void setKolicina(int kolicina) { this.kolicina = kolicina; }
    // Getteri
    public Artikal getArtikal() { return artikal; }
    public int getKolicina() { return kolicina; }
  }
  
  public void dodajStavku(Artikal artikal, int kol) {
    Artikli.add(new Stavka(artikal, kol));
  }
  public double ukupanIznos() {
    double iznos = 0;
    for (Stavka stavka : Artikli)
      iznos = iznos + stavka.getArtikal().getCijena() * stavka.getKolicina();
    return iznos;
  }
}

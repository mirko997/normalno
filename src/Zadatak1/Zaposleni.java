
package Zadatak1;


public class Zaposleni {
    String ime;

    public Zaposleni() {
    }

    public Zaposleni(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Zaposleni{" + "ime=" + ime + '}';
    }
    
    
}


package Zadatak1;


public class ProstTip<T> {
    
    private T atribut;

    public ProstTip() {
    }

    public ProstTip(T atribut) {
        this.atribut = atribut;
    }

    public T getAtribut() {
        return atribut;
    }

    public void setAtribut(T atribut) {
        this.atribut = atribut;
    }

    @Override
    public String toString() {
        return "ProstTip{" + "atribut=" + atribut + '}' + "\n" + atribut.getClass().getName();
    }
    
    
    
}

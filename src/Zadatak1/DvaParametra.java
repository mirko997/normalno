
package Zadatak1;


public class DvaParametra <T,S> {
    
    private T a1;
    private S a2;

    public DvaParametra() {
    }

    public DvaParametra(T a1, S a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public T getA1() {
        return a1;
    }

    public void setA1(T a1) {
        this.a1 = a1;
    }

    public S getA2() {
        return a2;
    }

    public void setA2(S a2) {
        this.a2 = a2;
    }

    @Override
    public String toString() {
        return "DvaParametra{" + "a1=" + a1 + ", a2=" + a2 + '}' + "\n" + a1.getClass().getName() + "\n" + a2.getClass().getName();
    }
    
    
}

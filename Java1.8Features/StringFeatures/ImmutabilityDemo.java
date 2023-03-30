
/*
 * Java program to demonstrate implementation of 
 * customized immutable class
 */

 public class ImmutabilityDemo {
    
    private int i;
    ImmutabilityDemo(int i) {
        this.i = i;
    }
    public ImmutabilityDemo modify(int i) {
        if(this.i == i) { return this; }
        else { return new ImmutabilityDemo(i); }
    }

    public static void main(String[] args) {
        ImmutabilityDemo t1 = new ImmutabilityDemo(0)        
    }
 }
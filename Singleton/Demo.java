package Test.Singleton;
// By declaring every every constructor as private we can restrict child class creation
// For the below class A, it is impossible to create child class
class A {
    // When class A is private, child class (B) cannot be created
    // that throws you compile time error
    A() {

    }
}
class B extends A {
// we can create our own singleton classes and for that we've to use privat constructor and private static variable and public factory method.
}
public class Demo { 
    public static void main(String[] args) {
        
    }
}
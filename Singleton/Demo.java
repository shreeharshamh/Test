package Singleton;
// By declaring every every constructor as private we can restrict child class creation
class A {
    // When class A is private, child class (B) cannot be created
    // that throws you compile time error
    A() {

    }
}
class B extends A {
    
}
public class Demo { }
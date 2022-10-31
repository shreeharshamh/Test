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
    
}
public class Demo { }
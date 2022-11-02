// package Test.CollectionFramework;

public class ArraysDemo {
    public static void main(String[] args) {
        // 
        int x = 10;
        int y = 20;
        int z = 30;
        // if there are 10,000 objects, then it is cumbersome job to create 10,000 variables thus it is recommended to go with Arrays concept
        Integer[] intArray = new Integer[100];
        for(int i=0; i<10; i++) {
            intArray[i] = i+1;
            System.out.println(intArray[i]);
        }
        // Arrays are limited in size
        // Homogenous in natureeee
    }    
}

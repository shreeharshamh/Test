package Test.StringPoolDemo;
/*
    A java program to demonstrate StringPool internal implementation
 * String pool is pool of strings in java heap space
 * 
 */

public class StringPoolDemo 
{
    public static void main(String[] args) {
        // there are two ways of creating a string
        // using string in double quotes
        String s1 = "Pluto";
        String s2 = "Neptune";
        String s3 = "Pluto";

        // creating String using new keyword
        /*
         * when String.intern() method is used, the jvm will check the string pools for litterals.
         * if already present in the pool, then jvm allocates the reference to that existing litteral
         * instead of allocating space in heap.
         */
        String s4 = new String("Pluto").intern();
        String s5 = new String("Neptune");
        String s6 = new String("Mercury");
        /*
         * whenever a string is created using String str = "random"; jvm checks the pool for the litterals. If
         * literal is true then, JVM allots the reference to existing string instead of creating new
         * string in  string pool so that the memory consumption is reduced
         */

         /*
          * when the string is created using new keyword, the jvm checks the string pool, if the string is already
          * present in the string pool, the the jvm allots the space in the heap along with SCP
          * 
          */

          /*
           * Note : 
           * Everytime a string is created using new keyword, the jvm checks the pool and if string already present in 
           * the pool then jvm is not going to create a reference but allocate heap space for theat element
           */

        System.out.println(s1 == s3);               // true
        System.out.println(s2 == s5);               // false
        System.out.println(s3 == s4);               // true
    }
    
}

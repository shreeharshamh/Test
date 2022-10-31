interface iface {
    public void add(int a, int b);
}
/*
class Demo implements iface {
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}
*/
class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        iface i = (a,b) -> System.out.println(a+b);
        i.add(125, 301);
        /* 
        iface i = new Demo();
        i.add(10, 20);
        */
    }
}
interface iface {
    public void add(int a, int b);
}
class demo implements iface {
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        iface i = (a,b) -> System.out.println(a+b);
        i.add(102, 302);
    }
}
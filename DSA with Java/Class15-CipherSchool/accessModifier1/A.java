package accessModifiers1;

public class A {
    int x = 10;//default
    private int y = 15;
    public int z = 20;
     protected int w = 23;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.w);
    }
}
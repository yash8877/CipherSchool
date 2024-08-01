package accessModifiers1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x);//default is accessable
        // System.out.println(obj.y);//private not accessible outside the class
        System.out.println(obj.z);//public is accessible outside the class
        System.out.println(obj.w);
    }
}

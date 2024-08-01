package accessModifiers2;
import accessModifiers1.A;
public class C extends A{
    public static void main(String[] args) {
        A obj = new A();
        C chilobj = new C();
        // System.out.println(obj.x);//default is not accessible outside the package
        System.out.println(chilobj.x);//NOT VISIBLE
        // System.out.println(obj.y);//private not accessible outside the class
        System.out.println(chilobj.y);//NOT VISIBLE
        System.out.println(obj.z);//public is accessible outside the class
        System.out.println(chilobj.w);//protected will be visible in different package in subclass, using object of subclass 
    }
}

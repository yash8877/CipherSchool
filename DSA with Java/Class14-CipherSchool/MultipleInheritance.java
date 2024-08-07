interface M {
    int x = 10;
    void fun();
    
}
interface N{
    int x = 20;
    void fun();
    
}

class C implements M,N{//multiple inheritence inn java
    public void fun(){
        System.out.println("I am function in C");
        System.out.println(M.x);//Ambiguity resolved using fully qualified name
        System.out.println(N.x);//Ambiguity resolved using fully qualified name
        System.out.println(M.super.hashCode());
        System.out.println(N.super.hashCode());

    }
}
/**
 * InnerInterfaceStudy
 */
interface  O extends M,N{
    void fun();
    
}
class D implements O{
    public void fun(){
        System.out.println("I am in function D");
    }
}


public class MultipleInheritance {

    public static void main(String[] args) {
        C c = new C();
        c.fun();
        D d = new D();
        d.fun();
    }
}

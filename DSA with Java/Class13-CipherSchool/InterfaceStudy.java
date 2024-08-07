/**
 * InnerInterfaceStudy
 */
interface M {
    int x = 10;
    void fun();
    
}
interface N{
    int x = 20;
    void fun();
    
}

interface  O {
    void fun();
    
}
class D implements O{
    public void fun(){
        System.out.println("I am in function D");
    }
}


public class InterfaceStudy {

    public static void main(String[] args) {
        D d = new D();
        d.fun();
    }
}

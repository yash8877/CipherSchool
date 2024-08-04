class A{
    int a, b;

    public void show(){
        System.out.println("hello");
    }
}

interface B{
    public void eat();
}

interface D extends B{
    public void sleep();
}

class C implements B,D{
    int e, f;
    public void speak(){
        System.out.println("Speaking");
    }

    @Override
    public void eat(){

    }

    @Override
    public void sleep(){
        
    }
}


public class Test {


    public static void main(String[] args) {
        C c = new C();
        c.eat();
    }
}

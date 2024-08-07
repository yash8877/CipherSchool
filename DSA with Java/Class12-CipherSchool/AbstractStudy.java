abstract class Car{//we cannot instantitae an abstract class, which means we cannot create object of an abstract class
    int maxSpeed;
    abstract void accelerate();//only decalred but not implemented , it is without a body
    //they are created to force the child classess to implement them before using. We will use them after overriding

    abstract void brake();
}

abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerrating");
    }
}

class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying brakes");
    }
}

public class AbstractStudy {
   public static void main(String[] args) {
    // Car c = new Car();//Cannot intantitate an abstract class
    // BMW beemer = new BMW;();
    // beemer.accelerate();
   } 
}

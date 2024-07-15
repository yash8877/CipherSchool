abstract class Car{
    int maxSpeed;
    abstract void acclerate();
}

abstract class BMW extends Car{
    void acclerate(){
        System.out.println("BMW is accelerating");
    }
}
class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying brakes");
    }
}

public class AbstractStudy {
    public static void main(String[] args) {
        // BMW obj = new BMW();
        // obj.acclerate();
        BMW2 b = new BMW2();
        b.acclerate();
        b.brake();

    }
}

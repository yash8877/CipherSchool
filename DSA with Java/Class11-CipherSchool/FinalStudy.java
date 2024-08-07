class A{
    final int noOfAlphabet = 26;//final variables==> Value once assigned can't be changed
    final int noOfDigit;
    A(){
        noOfDigit = 10;
    }
    final void fun(){
        System.out.println("I am in class A");
    }
}
final class B extends A{//final class cannot be inherited
    // void fun(){
    //     System.out.println("I am in B and overrdining the class A method");
    // }
}

// class C extends B{

// }

public class FinalStudy {

    
}

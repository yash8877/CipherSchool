/**
 * PrimitiveDT
 */
public class PrimitiveDT {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);

        byte b = 10;
        System.out.println("B is: "+b);
        
        byte b2 = (byte)110;//Explicit type casting
        System.out.println("B2 is: "+b2);

        int i = b;//Implicit type casting or widening 
        System.out.println("I is: "+i);
    }
}
public class primitive {
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

        int z = x + y;
        // + -> operator
        // x,y -> operands

        //Incremnet & Decrement Operatores
        int m = 5;
        int n = m++;//assign the value of m to n and then increase values of a wherever it was defined
        //1. int n = m;
        //2. m= m +1;
        System.out.println("M is: ");
        System.out.println(m);
        System.out.println("N is: ");
        System.out.println(n);

        int p = 5;
        int q = ++p;//increase value of p and assogn to q;
        System.out.println("P is: "+p+", Q is: "+q);
    }
}

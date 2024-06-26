public class Student {
    int rollNo;
    String name;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.name = "Yash raj";
        s1.rollNo = 18;
        s2.name = "Prince Patel";
        s2.rollNo = 19;
        s3.name = "Digpal Singh";
        s3.rollNo = 17;
        s4.name = "Ritu Raj";
        s4.rollNo = 37;

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s3.name);
        System.out.println(s3.rollNo);
        System.out.println(s4.name);
        System.out.println(s4.rollNo);
    }
}
class Student{
    String name;
    int rollNo;
    static int count;//static varibale

    Student(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
        count++;
    }
    static void showCount(){
        System.out.println(count);
    }
}

public class StaticStudy {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Yash");
        //System.out.println(s1.count);//we can call by using object as well
        System.out.println(Student.count);//but this is the way to call the static variables
        Student s2 = new Student(2, "Raj");
        // System.out.println(s1.count);
        System.out.println(Student.count);
        Student s3 = new Student(3, "Singh");
        // System.out.println(s1.count);
        System.out.println(Student.count);
    }
    
}

public class StringStudy {
    public static void main(String[] args){
      String name= "CipherSchools";
      String name2="CipherSchools";
      String name3= new String("CipherSchools");
      String name4= new String("cipherSchools");
      System.out.println(name==name2);
      System.out.println(name3==name4);
      System.out.println(name==name3);
      System.out.println("===============================");
      System.out.println("1.CONCATENATION");
      String s1="hello";
      s1=s1+ "peeps";
      System.out.println(s1);
      System.out.println(s1+",How're you doing");
      System.out.println(s1);
      String s2= new String("Hello");
      String s3=new String (" people");
      String s4=s2.concat(s3);
      System.out.println(s4);
      System.out.println(s2);
       System.out.println("===============================");
      System.out.println("2 CHECKING IF STRIGS ARE EQUAL IN VALUE");
      System.out.println(name.equals(name2));
      System.out.println(name.equals(name3));
      System.out.println("==============================");
      System.out.println("3) Creating new String object from character array");
      char arr[]={'C','I','P','H','E','R'};
      String strFromArr = new String(arr);
      System.out.println(strFromArr);
    }
}
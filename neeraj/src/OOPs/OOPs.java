package OOPs;
class Student{
    String name;
    int age;
     public void studentInfo(String name){
         System.out.println(name);
     }

     public void StudentInfo(int age){
         System.out.println(age);
     }
     public void StudentInfo(String name , int age){
         System.out.println(name +" "+ age);
     }
}
public class OOPs {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "neeraj";
        s1.age = 24;
        s1.studentInfo(s1.name);

    }
}

import java.util.*;
public class DeepCopy {

    public static class Student{
        String name;
        int age;
        int rollNo;
        ArrayList<String> subjects;
        Student(String name , int age , int rollNo){
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
            this.subjects = new ArrayList<>();
        }
        Student(Student other){
            this.name = other.name;
            this.age = other.age;
            this.rollNo = other.rollNo;
            this.subjects = other.subjects;
        }
    }
    public static void main(String[] args) {

        Student s = new Student("Harsh" , 23 , 14);
        s.subjects.add("Maths");
        s.subjects.add("English");
        s.subjects.add("Hindi");
        s.subjects.add("Physics");
        
        System.out.println(s.name + " " + s.age + " " + s.rollNo);
        System.out.println(s.subjects);


        Student deepCopy2 = new Student(s);
        deepCopy2.age = 25;
        deepCopy2.subjects.add("Java");
        System.out.println(deepCopy2.name + " " + deepCopy2.age + " " + deepCopy2.rollNo);
        System.out.println(s.subjects);
    }
}
// javac DeepCopy.java
// java DeepCopy
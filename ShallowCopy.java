public class ShallowCopy {
    public static class Student{
        String name;
        int age;
        int rollNo;

        Student(String name , int age , int rollNo){
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
        }
        Student(Student other){
            this.name = other.name;
            this.age = other.age;
            this.rollNo = other.rollNo;
        }
    }
    public static void main(String[] args) {
        Student s = new Student("Harsh" , 23 , 14);
        System.out.println(s.name + " " + s.age + " " + s.rollNo);


        Student shallowCopy = s;
        shallowCopy.name = "Tejasvi";
        System.out.println(shallowCopy.name + " " + shallowCopy.age + " " + shallowCopy.rollNo);


        Student shallowCopy2 = new Student(s);
        shallowCopy2.age = 25;
        System.out.println(shallowCopy2.name + " " + shallowCopy2.age + " " + shallowCopy2.rollNo);
    }
}

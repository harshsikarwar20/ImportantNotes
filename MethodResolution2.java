public class MethodResolution2 {
    public static void m1(Object b){
        System.out.println("Object");
    }
    public static void m1(String b){
        System.out.println("String");
    }
    public static void m1(Animal b){
        System.out.println("Animal");
    }
    // public static void m1(Dog b){
    //     System.out.println("Dog");
    // }
    
    public static void main(String[] args) {
        MethodResolution2.m1("Harsh");
        MethodResolution2.m1(new Dog());
        
    }
}
interface Animal{}
class Dog implements Animal{}
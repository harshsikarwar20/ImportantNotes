public class InstanceOf {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();

        if(myAnimal instanceof Animal){
            System.out.println("myAnimal is a instanceOf Animal class");
        }

        if(myAnimal instanceof Dog){
            System.out.println("myAnimal is a instance of Dog class");
        }
    }
}
class Animal{

}
class Dog extends Animal{

}

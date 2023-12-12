class A {
    private int id;
    A(int id){
        this.id = id;
    }
    
    public void print(){
        System.out.println("function of parent class");
    }
}

class B extends A{
    private int num ;
    B(int id , int num){
        super(id);
    }
    @Override
    public void print(){
        System.out.println("Fuction of child class");
    }
}
public class RunTimePolymorphism {

    public static void main(String[] args) {
        A obj1 = new A(1);
        obj1.print();

        B obj2 = new B(7,10);
        obj2.print();

        // Run time polymorphism...................................................
        A obj3 = new B(10,10);
        // Reference of class A is given whereas object is created of class B........................
        obj3.print();
    }
}

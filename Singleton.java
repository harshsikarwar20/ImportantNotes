public class Singleton {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Abc obj1 = Abc.getInstance();
        Abc obj2 = Abc.getInstance(); // so everytime we are getting same instance
    }
}

// class Abc{
//     static Abc obj = new Abc(); // This object is static because the method is static 
//     // Since this object is static it will we loaded when class is loaded and 
//     // so it is global variable even if you are not using this object it will be there in the memory..
//     // so this was one of the biggest drawback of singleton class.
//     // so by default it is eager
//     // so if we want to make it as lazy..

//     private Abc(){

//     }
//     public static Abc getInstance(){
//         return obj;
//     }
// }

// Singleton means we can create one object of that class 
/* 
steps :-
1. create static object of the class inside that class only
2. create the private constructor.
3. create a static method which returns the static object and you can give any name to the method.

*/
class Abc{
    public static Abc obj;

    private Abc(){
        System.out.println("Instance created");
    }

    public static Abc getInstance(){
        // obj = new Abc(); // If we use this without if condition then then multiple objects will be created.

        if(obj==null){
            obj = new Abc();
        }
        return obj;
    }
}

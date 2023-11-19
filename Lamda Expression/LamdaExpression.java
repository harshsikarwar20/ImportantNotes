package LamdaExpression;
public class LamdaExpression{
    public static void main(String[] args) {
        System.out.println("My System Starts...");

        // MyInterface myInter = new MyInterImplementation();
        // myInter.sayHello();

        // MyInterface i = new MyInterface() {

        //     @Override
        //     public void sayHello() {
        //         // TODO Auto-generated method stub
        //         System.out.println("This is first anonymous class...");
        //     }
            
        // };

        // i.sayHello();

        // MyInterface i2 = new MyInterface() {

        //     @Override
        //     public void sayHello() {
        //         // TODO Auto-generated method stub
        //         System.out.println("This is second anonymous class...");
        //     }
            
        // };

        // i2.sayHello();

        // Using our interface with the help of lamda...

        // MyInterface i = ()->System.out.println("This is 1st time using lamda expression");;
        // i.sayHello();

        // MyInterface i2 = ()->System.out.println("This is 2nd time using lamda expression");;
        // i2.sayHello();


        SumInterface sumInter = (int a , int b)->{
            return a+b;
        };
        // Use this down one also...
        // SumInterface sumInter = (a , b)-> a+b;
        System.out.println(sumInter.sum(1, 2));

        LengthInter lengthInter = (str -> str.length());
        System.out.println(lengthInter.getLength("Harsh"));
    }
}

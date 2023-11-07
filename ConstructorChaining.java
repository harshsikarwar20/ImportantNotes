public class ConstructorChaining {
    public static void main(String[] args) {
        // Cuboid c = new Cuboid();
        // System.out.println(c.length + " " + c.breadth + " " + c.height);

        Cuboid c = new Cuboid(10, 20);
        c.mul();

    }
}
class Cuboid{
        // int length;
        // int breadth;
        // int height;
        int a;
        int b;

        Cuboid(int a , int b){
            this.a = a;
            this.b = b;
        }

        public static void add(){
            
            // System.out.println("Inside static");
        }

        public void mul(){
            System.out.println(this.a * this.b);
        //     System.out.println("inside Non static");
        //     Cuboid.add();
        }

        // Cuboid(){
        //     // length = 1;
        //     // breadth = 1;
        //     // height = 1;
        //     this(1);
        // }

        // Cuboid(int side){
        //     this(side,side,side);
        // }

        // Cuboid(int length , int breadth){
        //     this(length , breadth , 1);
        // }

        // Cuboid(int length , int breadth , int height){
        //     this.length = length;
        //     this.breadth = breadth;
        //     this.height = height;
        // }
    }

    // calling a another constructor inside a constructor is constructor chaining....

public class MethodResolution {
    public static void m1(byte b){
        System.out.println("Byte");
    }
    public static void m1(int b){
        System.out.println("int");
    }
    public static void m1(short b){
        System.out.println("short");
    }
    public static void m1(long b){
        System.out.println("long");
    }
    public static void m1(float b){
        System.out.println("float");
    }
    public static void m1(double b){
        System.out.println("double");
    }
    public static void main(String[] args) {
        byte i = 10;
        MethodResolution.m1(i);
    }
}

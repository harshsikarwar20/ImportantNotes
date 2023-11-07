public class Singletonthread {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            
            public void run(){
                Abc obj = Abc.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            
            public void run(){
                Abc obj = Abc.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
}

class Abc{
    public static Abc obj;

    private Abc(){
        System.out.println("Instance created");
    }

    public static synchronized Abc getInstance(){ 
        // But this synchronized method will reduce the performance

        if(obj==null){
            obj = new Abc();
        }
        return obj;
    }
}

class Bank extends Thread{
    int bal = 5000;
    int withdraw;

    Bank(int withdraw){
        this.withdraw = withdraw;
    }

    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println(name+" "+"withdrawn money");
            bal = bal - withdraw;
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
public class Synchronization {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Bank obj = new Bank(5000);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        

        t1.setName("Harsh");
        t2.setName("Tejasvi");
        
        Bank obj2 = new Bank(5000);

        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);
        

        t3.setName("Aniket");
        t4.setName("Pinky");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
// javac Synchronization.java
// java Synchronization
class Bank extends Thread{
    int bal = 5000;
    int withdraw;

    Bank(int withdraw){
        this.withdraw = withdraw;
    }

    public void run(){
        String name = Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println(name+" "+"withdrawn money");
            bal = bal - withdraw;
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
public class Multithreading {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Bank obj = new Bank(5000);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        

        t1.setName("Harsh");
        t2.setName("Tejasvi");
        t3.setName("Aniket");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}

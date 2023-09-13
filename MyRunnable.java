public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();  // we can change the name of the function...
    }
}
// Runnable Interface :-

// Runnable is an interface in Java. It defines a single method run( ). It describes a task that can be executed in a separate thread. It does not return any result, but it can perform some actions. It cannot throw a checked exception. The run( ) method must be overridden to define the thread's task.  

// Once the run() method is defined, we can pass the Runnable instance to a Thread constructor or ExecutorService and start the thread using the start() method.

// In the above example, the MyRunnable class implements the Runnable interface and overrides the run( ) method to print a message. The main( ) method creates a MyRunnable instance and a Thread instance, passing the MyRunnable instance to the Thread constructor. The start( ) method of the Thread instance is called to start the thread, which executes the run( ) method of the MyRunnable instance.
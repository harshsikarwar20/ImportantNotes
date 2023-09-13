import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<Integer> {
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyCallable());
        int result = future.get();
        System.out.println("Result = " + result);
        executor.shutdown();
    }
}

// Callable is an interface in Java. It defines a single method call( ). It is also similar to a runnable interface, but it is used when a task returns a result. It can throw a checked exception. The call( ) method must be overridden to define the thread's task.  

// Once the call( ) method is defined, we can pass the Callable instance to an ExecutorService and submit it using the submit( ) method. The submit( ) method returns a Future object, which signifies the result of the task and can be used to retrieve the result or cancel the task.

// In the above example, the MyCallable class implements the Callable<Integer> interface and overrides the call( ) method to calculate the sum of numbers from 1 to 5. The main( ) method creates an executor service using the Executors.newSingleThreadExecutor( ) method, which creates a thread pool with a single thread. 

// It then submits the MyCallable instance to the executor service using the submit( ) method, which returns a Future object representing the result of the task. The get( ) method of the Future object is called to retrieve the result, which is printed to the console. Finally, the executor service is shut down using the shutdown( ) method.


// Frequently Asked Questions:-


// Can a Callable be parameterized with a type for its return value?
// Callable is a generic interface that takes a type parameter for its return value. For example, Callable<Integer> represents a Callable that returns an Integer.

// What is the main difference between Callable and Runnable in Java?
// The main difference between Callable and Runnable in Java is that Callable can return a value while Runnable cannot.

// Can Callable and Runnable both throw exceptions?
// Yes, both Callable and Runnable can throw exceptions. However, Callable's call( ) method can throw checked exceptions, while Runnable's run( ) method is not.

// Which interface should be used if a computation needs to return a value?
// A Callable interface should be used if a computation needs to return a value.

// Can a class implement both Callable and Runnable interfaces?
// Yes, a class can implement both Callable and Runnable interfaces. However, they serve different purposes and should be used based on the specific requirements of the task.

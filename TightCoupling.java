// Java program to illustrate 
// tight coupling concept 
class Volume  { 
     public static void main(String args[]){ 
         Box b = new Box(5,5,5); 
         System.out.println(b.volume); 
     } 
} 
class Box  { 
     public int volume; 
     Box(int length, int width, int height){ 
         this.volume = length * width * height; 
     } 
}
         // OR //

// Java program to illustrate 
// tight coupling concept 
class Subject { 
    Topic t = new Topic(); 
    public void startReading() 
    { 
        t.understand(); 
    } 
} 
class Topic { 
    public void understand() 
    { 
        System.out.println("Tight coupling concept"); 
    } 
} 

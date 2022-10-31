package JavaPrograms;

class GFG {
 // Static variable reference of single_instance
 // of type Singleton
private static GFG single_instance = null;

 // Declaring a variable of type String
 public String s;

 // Constructor
 // Here we will be creating private constructor
 // restricted to this class itself
 private GFG()
 {
     s = "Hello I am a string part of Singleton class";
 }

 // Static method
 // Static method to create instance of Singleton class
 public static GFG getInstance()
 {
     if (single_instance == null)
         single_instance = new GFG();

     return single_instance;
 }
}

//Class 2
//Main class
class GFG {
 // Main driver method
 public static void main(String args[])
 {
     // Instantiating Singleton class with variable x
     GFG x = GFG.getInstance();

     // Instantiating Singleton class with variable y
     GFG y = GFG.getInstance();

     // Instantiating Singleton class with variable z
     GFG z = GFG.getInstance();

     // Printing the hash code for above variable as
     // declared
     System.out.println("Hashcode of x is "
                        + x.hashCode());
     System.out.println("Hashcode of y is "
                        + y.hashCode());
     System.out.println("Hashcode of z is "
                        + z.hashCode());

     // Condition check
     if (x == y && y == z) {

         // Print statement
         System.out.println(
             "Three objects point to the same memory location on the heap i.e, to the same object");
     }

     else {
         // Print statement
         System.out.println(
             "Three objects DO NOT point to the same memory location on the heap");
     }
 }
}
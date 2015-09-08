/**
 * Initial comments summarize the purpose of the class.
 * 
 * @version September 8, 2015
 */
 
 // One or more 'import' statements could go here if we needed to use code
 // from a different package, such as java.util or edu.fcps.karel2, etc.
 
 // A class is a container for code.  Use initial and internal caps for the
 // name of the class and save the code in a file named TheClassName.java
 public class HelloWorld {
     // Inside the body of your class, define its members.
     // Members may be one of three types: variables, methods, and constructors
     
     // Member variables (called fields) -- data that the class "knows"
     // In this example, String declares the type of data while myName serves
     // as the identifier that holds the information.  The value on the right
     // is immediately assigned into the newly declared variable.
     String myName = "George Washington";
     
     // Constructors
     // Constructors hold statements to be executed when/if an instance of the
     // class is created.  If you do not specify any constructors, the following
     // code is silently inserted into your class for you:
     public HelloWorld() {
         //this constructor takes no parameters and does nothing
     }
     
     // Member methods -- functions that the class "can do"
     // Any class can declare a main method, as follows, allowing it to be run
     // as a program from the command line
     public static void main(String[] args) {
       // A sequence of statements to be executed when main() is called or 
       // 'invoked' 
       System.out.println("Hello, "+myName);
     }
     
 }

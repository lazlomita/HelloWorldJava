/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 * Print Hello world in Java programming language
 *
 ******************************************************************************/
public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello world" to the terminal window.
        System.out.println("Hello world JAVA\n");
		
		// Run a cycle that goes from 1 to 10
		for(int i=1; i<=10; i++){
			// Decide if the number is even or not
			if( i%2 == 0){
				// Text concatenation and print
				System.out.println("Count is: " + i + " and it is even.");
			} else {
				// Text concatenation and print
				System.out.println("Count is: " + i + " and it is odd.");
			}
		}
    }
}
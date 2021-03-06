import javafoundations.*;
/**
 * Driver class for LinkedStack
 */
public class LinkedStackDriver {
  /**
   * Driver method of the class
   */
  public static void main( String[] args ){
    LinkedStack< Integer > ls = new LinkedStack< Integer >();
    
    ls.isEmpty();
    
    ls.push( 1 );
    System.out.println( ls.peek() + "\n" + ls );
    
    ls.push( 2 );
    System.out.println( ls.peek() + "\n" + ls );
    
    ls.push( 3 );
    System.out.println( ls.peek() + "\n" + ls.size() + "\n" + ls );
    
    ls.pop();
    System.out.println( ls.peek() + "\n" + ls );
    ls.pop();
    System.out.println( ls.peek() + "\n" + ls );
  }
}
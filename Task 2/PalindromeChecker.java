import javafoundations.*;

/**
 * Checks a string to see whether it is a palindrome.
 */
public class PalindromeChecker {
  
  /**
   * Checks to see if a string is a palindrome using stacks
   * @param s - the String to be checked
   * @return whether s is a palindrome
   */
  public static boolean checkPalindrome( String s ){
    ArrayStack< Character > palStack = new ArrayStack< Character >();
    char[] palChars = s.toCharArray();
    
    //the upper bound works for even and odd length arrays b/c of integer division
    for( int i = 0; i < (s.length() / 2); i++ ){
      palStack.push( palChars[ i ] );
    }
    
    //but now we need a different lower bound for even and odd length arrays
    int begin;
    if( s.length() % 2 == 0 )
      begin = s.length() / 2 ;
    else
      begin = s.length() / 2 + 1; //skips over the middle char that has no partner
    
    for( int i = begin; i < s.length(); i++ ){
      if( palChars[ i ] == palStack.peek() )
        palStack.pop();
      else
        return false;
    }
    
    return true;
  }

  /**
   * Driver method for the class
   */
  public static void main( String[] args ){
    if( args.length == 0 )
      System.out.println( "Please enter a String as a command-line argument." );
    else
      System.out.println( checkPalindrome( args[ 0 ] ) ? 
                           args[ 0 ] + " is a palindrome" : args[ 0 ] + "is not a palindrome");
  }
}
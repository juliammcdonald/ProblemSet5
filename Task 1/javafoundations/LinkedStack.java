package javafoundations;

import javafoundations.exceptions.*;

/**
*  LinkedStack.java       Java Foundations
*
*  Represents a linked implementation of a stack.
*/

public class LinkedStack<T> implements Stack<T>
{
   private int count;
   private LinearNode<T> top;

   /**
   *  Creates an empty stack using the default capacity.
   */
   public LinkedStack()
   {
      count = 0;
      top = null;
   }

   /**
   *  Removes the element at the top of this stack and returns a
   *  reference to it. Throws an EmptyCollectionException if the
   *  stack contains no elements.
   * 
   * @return the element at the top of the stack
   */
   public T pop() throws EmptyCollectionException
   {
      if (count == 0)
         throw new EmptyCollectionException ("Pop operation failed. "
            + "The stack is empty.");

      T result = top.getElement();
      top = top.getNext();
      count--;

      return result;
   }

   /**
   *  Returns a string representation of this stack.
   * 
   * @return the elements in the stack
   */
   public String toString()
   {
      String result = "<top of stack>\n";
      LinearNode current = top;

      while (current != null)
      {
         result += current.getElement() + "\n";
         current = current.getNext();
      }

      return result + "<bottom of stack>";
   }

   //-----------------------------------------------------------------
   //  The following methods are left as Programming Projects.
   //-----------------------------------------------------------------
   /**
    * Adds an element to the stack
    * @param element - element to be added to the stack
    */
   public void push ( T element ) {
     LinearNode< T > oldTop = top;
     top = new LinearNode< T >( element );
     top.setNext( oldTop );
     count++;
   }
   
   /**
    * Shows the top element of the stack but does not modify the stack or element
    * @return the top element
    */
   public T peek () throws EmptyCollectionException {
     if( isEmpty() ){ 
       throw new EmptyCollectionException( "Peek operation failed. The stack is empty." ); 
     }
     return top.getElement();
   }
   
   /**
    * Checks to see whether the stack is empty
    * @return whether the stack is empty
    */
   public boolean isEmpty() {
     return count == 0;
   }
   
   /**
    * Finds the size of the stack
    * @return the size of the stack
    */
   public int size() {
     return count;
   }
}

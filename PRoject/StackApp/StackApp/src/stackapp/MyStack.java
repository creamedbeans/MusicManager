/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;
import java.util.*;
/**
 *
 * @author Hamilton1
 */
 public class MyStack implements StackInterface {
    private ArrayList<String> theStack;

    /** Creates a new instance of Stack */
    public MyStack()
    {
        theStack = new ArrayList<String>();
    }


    public boolean isEmpty()
    {
        return theStack.isEmpty();
    }
   
    /** always false as there is no limit on the size of this ArrayList based stack */
    public boolean isFull()
    {
        return false;
    }

    /** removes the item  from the top of the stack and returns it */
    public Object pop()
    {
        if (!(theStack.isEmpty()))
        {
             return theStack.remove(0);
        }
        else
		return null;
    }


    /** puts an item onto the top of the stack */
    public void push(Object newItem)
    {
          theStack.add(0, (String)newItem);

    }
    
}

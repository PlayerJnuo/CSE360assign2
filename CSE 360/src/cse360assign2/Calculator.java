/**	
 *	Name: Eric Kim
 *	ClassID: 438
 *	Assignment #: 2
 *	Description: The Calculator class contains the functionalies
 *				 of a calculator. Among these are add, subtract
 *				 divide, multiply, getTotal, and getHistory.
 *				 Besides the +,-,%,* functions, getTotal returns
 *				 the current amount, and getHistory returns the
 *				 history of the inputs and outputs so far.
 */

package cse360assign2;

public class Calculator 
{
	/**
	 * total is the current result of
	 * any calculator operation
	 * history is a StringBuilder to
	 * be used for getHistory
	 */
	
	private int total;
	private StringBuilder history = new StringBuilder();
	
	/**
	 * Constructor for Calculator
	 * total value starts at 0
	 * history also start with 0
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history.append("0");
	}
	
	/**
	 * getTotal returns the result of the last
	 * calculation made by the calculator.
	 * @return the value of the last result
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * adds the integer value to total
	 * and appends the operation to history.
	 * @param value the integer to be used in
	 * the operation
	 */	
	public void add (int value) 
	{
		total = total + value;
		history.append(" + " + value);
	}
	
	/**
	 * subtracts the integer value from
	 * total and appends operation to
	 * history
	 * @param value the integer to be used
	 * in the operation
	 */	
	public void subtract (int value) 
	{
		total = total - value;
		history.append(" - " + value);
	}
	
	/**
	 * multiplies the integer value with
	 * the current total and appends 
	 * operation to history
	 * @param value the integer value to be
	 * used in the operation
	 */
	public void multiply (int value) 
	{
		total = total*value;
		history.append(" * " + value);
	}
	
	/**
	 * divides the total using the integer
	 * value and appends the operation to
	 * history
	 * @param value the integer value to be
	 * used in the operation
	 */
	public void divide (int value) 
	{
		total = total/value;
		history.append(" / " + value);
	}
	
	/**
	 * appends the total of all operations
	 * to history and returns a string of
	 * history
	 * @return history in the form of a string
	 */
	public String getHistory () 
	{
		history.append(" = " + getTotal());
		return history.toString();
	}
}
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

	private int total;
	
	/**
	 * Constructor for Calculator.
	 * total value starts at 0.
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () 
	{
		return total;
	}
	
	public void add (int value) 
	{
		total = total + value;
	}
	
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	public void multiply (int value) 
	{
		total = total*value;
	}
	
	public void divide (int value) 
	{
		total = total/value;
	}
	
	public String getHistory () 
	{
		return "";
	}
}

/**
 * 
 * @author Love
 * 
 */
/**
 * 
 * <font Colour="blue"><b>Account Class </b></font>
 *
 */
public abstract class Account {

	protected int number;
	protected double bal;
	Persion person;
	
	/**
	 * 
	 * @return integer value number.
	 */
	/**
	 * 
	 * <font Colour="green"><i>This is getNumber method </i></font>
	 */
	public int getNumber(){
		return number;
	}
	
	/**
	 * 
	 * @return floating value bal.
	 */
	/**
	 * <font Colour="green"><i>This is getBal method </i></font>
	 * 
	 */
	public double getBal(){
		return bal;
	}
	
	/**
	 * 
	 * @return Person reference.
	 */
	/**
	 * 
	 * <font Colour="green"><i>This is getOwner method </i></font>
	 */
	public Persion getOwner(){
		return person;
	}
	
	/**
	 * This is a deposit function and have no return.
	 */
	public void deposit(){
		
	}
	
	public abstract boolean withdraw(double d); 
}

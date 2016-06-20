/**
 * 
 * @author Love
 * @version 1.0
 *
 */
/**
 * 
 * <font Colour="blue"><b>CheckingAccount Class </b></font> 
 * 
 */
public class CheckingAccount extends Account{

	private double chargeRate;
	/**
	 * this function is used to save accounts.
	 * @param no used as an integer.
	 * @param cR used as float.
	 * @param o is the Persion reference.
	 */
	public CheckingAccount(int no, double cR, Persion o) {
		chargeRate = cR;
	}
	
	/**
	 * @param d used as a float.
	 * @return a boolean value.
	 */
	public boolean withdraw(double d){
		return true;
	}
	
	/**
	 * payCharge function.
	 */
	public void payCharge(){
		
	}
}


/*
Emily Haigh
*/

package pkgCar;

public class Car 
{
	private double totalPrice;
	private double downPayment;
	private double loanLength;  //months
	private double interestRate;
	
	public double monthlyCarPayment()
	{
		double principal = getTotalPrice() - getDownPayment();
		double top = getInterestRate() / 12.0 * principal;
		double bottom = 1.0 - Math.pow((1.0 + getInterestRate()/12.0), (-1.0 * getLoanLength())); 
		return top / bottom;
	}
	
	public double spentOnInterestOverTerm()
	{
		// returns only the interest from the loan
		return monthlyCarPayment() * getLoanLength() - (getTotalPrice() - getDownPayment());
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public double getLoanLength() {
		return loanLength;
	}
	public void setLoanLength(double loanLength) {
		this.loanLength = loanLength;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}

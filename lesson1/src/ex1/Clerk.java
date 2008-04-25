package ex1;

public class Clerk extends Person{
	
	private int weeklyWage;
	
	public Clerk(String name, String address, int weeklyWage){
		super(name, address);
		this.weeklyWage = weeklyWage;
	}

	/**
	 * @return the weeklyWage
	 */
	public int getWeeklyWage() {
		return weeklyWage;
	}

	/**
	 * @param weeklyWage the weeklyWage to set
	 */
	public void setWeeklyWage(int weeklyWage) {
		this.weeklyWage = weeklyWage;
	}
	
	@Override
	public int calcSalary(){
		return weeklyWage;
	}

}

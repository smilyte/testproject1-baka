package ex1;

public class Surveyor extends Mechanic{
	
	private int weeklyTests;
	private final int TESTWAGE = 290;
	
	
	public Surveyor(String name, String address, String appYear, int weeklyTests){
		super(name, address, 0, appYear);
		this.weeklyTests = weeklyTests;
	}

	/**
	 * @return the weeklyTests
	 */
	public int getWeeklyTests() {
		return weeklyTests;
	}

	/**
	 * @param weeklyTests the weeklyTests to set
	 */
	public void setWeeklyTests(int weeklyTests) {
		this.weeklyTests = weeklyTests;
	}
	
	
	@Override
	public int calcSalary(){
		int salary = TESTWAGE * weeklyTests;
		return salary;
	}
	
}

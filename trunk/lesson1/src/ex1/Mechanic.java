package ex1;

public class Mechanic extends Person{

	private int wage; //hourly wage
	private String appYear;
	private final int HOURS = 37;

	public Mechanic(String name, String address, int wage, String appYear){
		super(name, address);
		this.wage = wage;
		this.appYear = appYear;
	}
	/**
	 * @return the wage
	 */
	public int getWage() {
		return wage;
	}
	/**
	 * @param wage the wage to set
	 */
	public void setWage(int wage) {
		this.wage = wage;
	}
	/**
	 * @return the year
	 */
	public String getAppYear() {
		return appYear;
	}
	/**
	 * @param appYear the year to set
	 */
	public void setYear(String appYear) {
		this.appYear = appYear;
	}
	@Override
	/**
	 * Calculates salary of mechanic.
	 */
	public int calcSalary(){
		int salary = wage*HOURS;
		return salary;
	}
	
}

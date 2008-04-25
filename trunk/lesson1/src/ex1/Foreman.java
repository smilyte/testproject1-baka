package ex1;

public class Foreman extends Mechanic {

	private String yearOfPromotion;
	private int weeklyBonus;

	public Foreman(String name, String address, int wage, String appYear,
			String yearOfPromotion, int weeklyBonus) {
		super(name, address, wage, appYear);
		this.yearOfPromotion = yearOfPromotion;
		this.weeklyBonus = weeklyBonus;
	}

	/**
	 * @return the yearOfPromotion
	 */
	public String getYearOfPromotion() {
		return yearOfPromotion;
	}

	/**
	 * @param yearOfPromotion
	 *            the yearOfPromotion to set
	 */
	public void setYearOfPromotion(String yearOfPromotion) {
		this.yearOfPromotion = yearOfPromotion;
	}

	/**
	 * @return the weeklyBonus
	 */
	public int getWeeklyBonus() {
		return weeklyBonus;
	}

	/**
	 * @param weeklyBonus
	 *            the weeklyBonus to set
	 */
	public void setWeeklyBonus(int weeklyBonus) {
		this.weeklyBonus = weeklyBonus;
	}

	/**
	 * Calculates salary of foreman.
	 */
	@Override
	public int calcSalary(){
		int salary = super.calcSalary()+weeklyBonus;
		return salary;
	}
}

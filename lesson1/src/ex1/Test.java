package ex1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * Returns the total weekly salary of all mechanics in the list.
	 */
	public static int calcTotalSalary(List<Person> list){
		int total = 0;
		for (int i = 0; i < list.size(); i++){
			Person m = list.get(i);
			total = total + m.calcSalary();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Mechanic("Petras", "Pavasario 11", 55, "1990"));
		list.add(new Surveyor("Unnar", "Spobjergvej 15", "1991", 20));
		list.add(new Foreman("ForemanName", "Foreman Address", 75, "1995", "2000", 30));
		list.add(new Clerk("Clerk Name", "Soendervang 16", 7000));
		
		System.out.println(calcTotalSalary(list));

	}
}

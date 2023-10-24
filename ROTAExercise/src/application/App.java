package application;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rota rota = new Rota();
		
		rota.add("Mary", "programmer", "receptionist");
		rota.add("Herny", "manager");
		rota.add("Magda", "programmer", "receptionist");
		rota.add("Suzie", "receptionist", "manager");
		rota.add("Tanja", "programmer", "manager");
		rota.add("Paula", "manager", "receptionist");
		rota.add("Chrissy", "programmer", "manager");
		rota.add("Steve", "receptionist");
		rota.add("Peter", "programmer", "manager", "receptionist");
		rota.add("Zippo", "receptionist");
		rota.add("Lakai", "receptionist");
		rota.add("Fred", "programmer");
		rota.add("Esther", "programmer");
		rota.add("Carl", "programmer", "manager");
		rota.add("Hasi", "programmer", "receptionist");
		
		rota.printAllPersons();
		
		rota.today();
		rota.nextWeek();
		rota.daysAhead(2);

//		System.out.printf("first day of week (0 or 1) == %d \n", ChronoField.DAY_OF_WEEK.range().getMinimum());
//		System.out.printf("default zone offset==[%s]\n", ZoneId.systemDefault());
//	    System.out.printf("1st day of week==%s\n", WeekFields.of(Locale.getDefault()).getFirstDayOfWeek());


	    
	}

}

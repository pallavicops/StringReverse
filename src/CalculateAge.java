import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today =LocalDate.now();
		LocalDate birthDate = LocalDate.of(2003, 3, 9);
		int year = Period.between(birthDate, today).getYears();
		
		System.out.println("You are now " + year  + " years old");
		
		
		

	}

}

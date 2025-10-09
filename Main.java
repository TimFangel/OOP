import java.util.Arrays;

public class Main {
    public static void main(String[] args) { 
	
		Day[] days = {Day.FRIDAY, Day.MONDAY, Day.WEDNESDAY};
		System.out.println(Arrays.toString(days)); 
		Arrays.sort(days); 
		System.out.println(Arrays.toString(days));
	} 
}

enum Day { 
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; 
} 

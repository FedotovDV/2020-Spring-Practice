package springpractice;

public class SpringPracticeRunner {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}
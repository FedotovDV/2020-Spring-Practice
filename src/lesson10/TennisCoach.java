package lesson10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constraction!");
	}

	@PostConstruct
	public void doMySturtupStuff() {
		System.out.println(">> TennisCoach: inside doMySturtupStuff!");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanupStuff!");
	}
	
	
	@Override
	public String getDailyWorkout() {
				return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
				return fortuneService.getFortune();
	}

}

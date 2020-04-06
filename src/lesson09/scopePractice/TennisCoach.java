package lesson09.scopePractice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
//>> TennisCoach: inside default constraction!
//>> TennisCoach: inside default constraction!//
//Pointing to the same object: false//
//Memory location for theCoach: lesson09.scopePractice.TennisCoach@5ea434c8//
//Memory location for alphaCoach: lesson09.scopePractice.TennisCoach@3bbc39f8

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

//	>> TennisCoach: inside default constraction!
//	>> TennisCoach: inside doMySturtupStuff!
//
//	Pointing to the same object: true
//
//	Memory location for theCoach: lesson09.scopePractice.TennisCoach@52aa2946
//
//	Memory location for alphaCoach: lesson09.scopePractice.TennisCoach@52aa2946
//	>> TennisCoach: inside doMyCleanupStuff!
}

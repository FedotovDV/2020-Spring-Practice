package lesson07.annotationpractice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
//	
//	public TennisCoach() {
//		System.out.println(">> TennisCoach: inside default constraction!");
//	}
//	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//	    this.fortuneService = fortuneService;
//  }

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method!");
//		this.fortuneService = fortuneService;
//	}
	@Override
	public String getDailyWorkout() {
				return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
				return fortuneService.getFortune();
	}

}

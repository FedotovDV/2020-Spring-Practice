package lesson06.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lesson06/BeanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		System.out.println("\nPointing to the same object: "+(theCoach==alphaCoach));
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach +"\n");
		context.close();
	}

}

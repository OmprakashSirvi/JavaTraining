package demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		 * Spring Core component annotations:
		 * 
		 * @Componet
		 * 
		 * @Bean
		 * 
		 * @Configiration
		 */

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo.xml");
		System.out.println("Application is up and running");

		Person person = applicationContext.getBean(Person.class);

		ApplicationContext annotationConfig = new AnnotationConfigApplicationContext();
		Team team = annotationConfig.getBean(Team.class);
		
		team.show();
		person.display();
	}

}

package com.subha.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp2 {
 
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
				SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
						
		// call a method on the bean
				System.out.println(theCoach.getDailyWorkout());
					
		// call method to get daily fortune
				System.out.println(theCoach.getDailyFortune());
				
		// call our new swim methods ....
				System.out.println(theCoach.getEmail());
				System.out.println(theCoach.getTeam());
				
		// close the context
				context.close();
		
	}

}

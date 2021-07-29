package vinhnq27.springframework.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vinhnq27.springframework.springbootapplication.controllers.*;
import vinhnq27.springframework.springbootapplication.services.PetService;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App1Application.class, args);
		System.out.println("------- PetType");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.showPetType());
		System.out.println("------- Profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		System.out.println("------- Primary Bean");
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("------- Contructor");
		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());
	}

}

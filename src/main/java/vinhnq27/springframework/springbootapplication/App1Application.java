package vinhnq27.springframework.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import vinhnq27.springframework.springbootapplication.config.SfgConfiguration;
import vinhnq27.springframework.springbootapplication.config.SfgConstructorConfiguration;
import vinhnq27.springframework.springbootapplication.controllers.*;
import vinhnq27.springframework.springbootapplication.datasource.FakeDataSource;
import vinhnq27.springframework.springbootapplication.services.PrototypeBean;
import vinhnq27.springframework.springbootapplication.services.SingletonBean;

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

		System.out.println("Bean Scope ------>");
		SingletonBean singletonBean = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("--------------------- Fake DataSource Bean");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());

		System.out.println("--------------------- Config Props Bean");
		SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcurl());

		System.out.println("--------------------- Constructor Props Bean");
		SfgConstructorConfiguration sfgConstructorConfiguration = ctx.getBean(SfgConstructorConfiguration.class);
		System.out.println(sfgConstructorConfiguration.getUsername());
		System.out.println(sfgConstructorConfiguration.getPassword());
		System.out.println(sfgConstructorConfiguration.getJdbcurl());
	}

}

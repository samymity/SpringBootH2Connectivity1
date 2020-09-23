package com.example.demo;

import com.example.demo.repository.BookRepository;
import com.example.demo.test.MyService;
import com.example.demo.test.Stack;
import com.example.demo.test.Stack1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
@EnableJpaRepositories("com.example.demo.repository")
@EnableTransactionManagement
public class FuelTestApplication {



	MyService myService ;

	@Autowired
	FuelTestApplication(MyService myService)
	{
		this.myService = myService ;
	}



/*public   void execute()
{

Stack stack = new Stack();
	this.stack.push(10);
    this.stack.push(20);
	this.stack.push(30);
	System.out.println(this.stack.pop() + " Popped from stack");

}*/



	public static void main(String[] args) {
		SpringApplication.run(FuelTestApplication.class, args);
	    System.out.println("test");
		MyService myService  = new Stack1();
		FuelTestApplication obj = new FuelTestApplication( myService);

        obj.myService.single("");







	}



}

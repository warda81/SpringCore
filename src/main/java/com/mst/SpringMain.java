package com.mst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mst.beans.Employee;

@Configuration
@ComponentScan({"com.mst.beans"}) //make it search just in this package
public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//building spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringMain.class); // here live the beans
		//IOC
		//Employee emp = context.getBean(Employee.class);//byType
		Employee emp = (Employee)context.getBean("employeeBean");//when we use byName we should do casting
		emp.showDetails();
	}

}

package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		String con="/in/sp/resources/config.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(con);
Student ss=(Student)	context.getBean("std");
ss.display();
	}
}

package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import EmployeeDao.EmployeeDao;
import Sample_Data.Employee;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		int status = dao.saveEmployee(new Employee(103,"jay",39300));
		System.out.println(status);
		
	}
	

}

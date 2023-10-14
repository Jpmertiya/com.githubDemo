package com.Spring_Orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring_Orm.dao.StudentDao;
import com.Spring_Orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
        
        Student s=new Student(1,"jaspal singh","pali raj.");
        StudentDao d=c.getBean("StudentDao",StudentDao.class);
        int r=d.insert(s);
        if (r==1) {
			System.out.println("inserted successfully");
		}
        else {
			System.out.println("problem while inserting data");
		}
        
    }
}

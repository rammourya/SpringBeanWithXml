package org.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.processing.SupportedSourceVersion;

/**
 * Hello world!
 *
 */
public class XmlConfigExample
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/beans.xml");
        Employee employee=ctx.getBean(Employee.class);
        Department department=ctx.getBean(Department.class);
        Operations operations=ctx.getBean(Operations.class);
        System.out.println(department);
        System.out.println(employee);
        operations.helloWorld();

    }
}

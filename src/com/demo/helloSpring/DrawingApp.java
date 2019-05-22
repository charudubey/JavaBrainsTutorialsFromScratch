package com.demo.helloSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String arg[]){

        /** normal way - tightly coupled methodology */
        /*Triangle triangle = new Triangle();
        triangle.draw();*/

        /** Used to instantiate beans in an xml file. This process is used to implement factory design pattern. Beans factory is a 'factory' in which we define all
        This is used to acheive loose coupling by using Dependency injection mechanism of Spring */
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Triangle triangle1 = (Triangle)beanFactory.getBean("triangleOne");
        triangle1.draw();


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle2 = (Triangle) context.getBean("triangleTwo");
        triangle2.draw();

        Triangle triangle3 = (Triangle) context.getBean("triangleThree");
        triangle3.draw();

        Rectangle rectangle = (Rectangle) context.getBean("rectangle");
        rectangle.draw();

        Parallelogram parallelogram = (Parallelogram) context.getBean("parallelogram");
        parallelogram.draw();

    }

}
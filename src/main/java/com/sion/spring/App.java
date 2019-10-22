package com.sion.spring;


import com.sion.Aop.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
/*        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ((ClassPathXmlApplicationContext) context).start();
        LifeBean lifeBean = (LifeBean)context.getBean("lifeBean");
        lifeBean.getMessage();
        ((ClassPathXmlApplicationContext) context).stop();*/

/*            ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
            ((AnnotationConfigApplicationContext) context).start();
            LifeBean lifeBean = (LifeBean)context.getBean(LifeBean.class);
            lifeBean.getMessage();
            ((AnnotationConfigApplicationContext) context).stop();*/

 /*       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();*/
      //  cvp.publish();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student)context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();

    }
}

package container;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class APP {

	/**
	 * 
	 * @throws Exception
	 * BeanFactory 所采用的是延迟加载，又称为懒加载模式，当需要用到对象的时候才会创建bean对象
	 * 
	 * 
	 */
	
	@Test
	public void test1() throws Exception {
		Resource resource = new ClassPathResource("container/container.xml");
		
		BeanFactory factory=new XmlBeanFactory(resource);
		System.out.println("-=============================");
		//Person person =factory.getBean("person", Person.class);
		//System.out.println(person);
	}
	
	
	/**
	 * 
	 * 	Application 在加载配置文件的时候就把对象创建出来了，
	 * 
	 * 
	 * @throws Exception
	 */
	@Test
	public void testApplicationContext() throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("container/container.xml");
		System.out.println("=====================");
		Person p=ctx.getBean("person", Person.class);
		System.out.println(p);
	}

}

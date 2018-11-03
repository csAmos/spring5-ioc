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
	 * BeanFactory �����õ����ӳټ��أ��ֳ�Ϊ������ģʽ������Ҫ�õ������ʱ��Żᴴ��bean����
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
	 * 	Application �ڼ��������ļ���ʱ��ͰѶ��󴴽������ˣ�
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
